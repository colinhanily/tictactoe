/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamescreen;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import project.TTTWebService;
import project.TTTWebService_Service;

/**
 *
 * @author Padraig Connolly
 */
public class GameThread extends Thread implements ActionListener  {
    
    private JPanel myPanel, gridPanel;
    private JLabel myLabel;
    private String gameStatus;
    private TTTWebService proxy;
    private TTTWebService_Service ttt;
    private Boolean p1, noMoves, otherPlayerMsgSet, noPlayer2;
    private String  reply, lastRow, lastXCoor, lastYCoor;
    private int gameID, userID, lastUID;
    private String[] splitReply, splitRow;
    JButton[][] tttLists;
    int numOfRows = 3;
    int numOfCols = 3;
    
    public GameThread(Boolean player1, int gid, int uid){
        
        p1 = player1;
        gameID = gid;
        userID = uid;
        ttt = new TTTWebService_Service();
        proxy = ttt.getTTTWebServicePort();
        gameStatus = "";
        noPlayer2 = true;
        
        
        myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(2,1));
        gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(numOfRows, numOfCols));
        gridPanel.setBorder(new LineBorder(Color.RED, 4));
        
        myLabel = new JLabel(gameStatus, JLabel.CENTER);
        myPanel.add(myLabel);
        
        tttLists = new JButton[numOfRows][numOfCols];
        
        for (int i =0; i < numOfRows; i++){
            for (int j = 0; j < numOfCols; j++){
                tttLists[i][j] = new JButton();
                tttLists[i][j].addActionListener(this);
                tttLists[i][j].setFocusPainted(false);
                tttLists[i][j].setMargin(new Insets(0, 0, 0, 0));
                tttLists[i][j].setContentAreaFilled(false);
                tttLists[i][j].setOpaque(false); 
                tttLists[i][j].setEnabled(false);
                gridPanel.add(tttLists[i][j]);
            }
        }
        myPanel.add(gridPanel);
        
        myPanel.setBorder(new LineBorder(Color.BLACK, 1));
        noMoves = true;
        otherPlayerMsgSet = false;
    
    }
    
    @Override
    public void run() {
        myLabel.setText("Waiting on Player 2 to join");
        while(noPlayer2){
            if (!proxy.getGameState(gameID).equals("-1")){
                noPlayer2 = false;
            }
            try {
                sleep(500);
            } catch(Exception e) {
                
            }
        }
        
        if (p1){
            myLabel.setText("Take your turn!");
            for (int m =0; m < numOfRows; m++){
                for (int n = 0; n < numOfCols; n++){
                    tttLists[m][n].setEnabled(true);
                }
            }
            otherPlayerMsgSet = false;
        } else {
            myLabel.setText("Waiting on the other player!");
            for (int o =0; o < numOfRows; o++){
                for (int p = 0; p < numOfCols; p++){
                    tttLists[o][p].setEnabled(false);
                }
            }
            otherPlayerMsgSet = true;
        }
        
        while (noMoves){
            System.out.println("1: " + reply);
            reply = proxy.getBoard(gameID);
            if (!reply.equals("ERROR-NOMOVES")) {
                noMoves = false;
            }
            try {
                sleep(500);
            } catch(Exception e) {
                
            }
        }
        
        mainloop: while(true) {
            System.out.println("2: " + reply);
            splitReply = reply.split("\n");
            lastRow = splitReply[splitReply.length - 1];
            splitRow = lastRow.split(",");
            lastUID = Integer.parseInt(splitRow[0]);
            lastXCoor = splitRow[1];
            lastYCoor = splitRow[2];
            System.out.println("lastUID: " + lastUID);
            System.out.println("userID: " + userID);
            System.out.println("otherPlayerMsgSet" + otherPlayerMsgSet);
            if (lastUID == userID){
                if (!otherPlayerMsgSet){
                    myLabel.setText("Waiting on the other player!");
                    for (int i =0; i < numOfRows; i++){
                        for (int j = 0; j < numOfCols; j++){
                            tttLists[i][j].setEnabled(false);
                        }
                    }
                    int gameWon = Integer.parseInt(proxy.checkWin(gameID));
                    if (p1){
                        tttLists[Integer.parseInt(lastXCoor)][Integer.parseInt(lastYCoor)].setText("X");
                        switch (gameWon) {
                            case 1:
                                myLabel.setText("You won the game!");
                                break mainloop;
                            case 2:
                                myLabel.setText("You lost the game!");
                                break mainloop;
                            case 3:
                                myLabel.setText("Draw!");
                                break mainloop;
                            default:
                                break;
                        }
                    } else {
                        tttLists[Integer.parseInt(lastXCoor)][Integer.parseInt(lastYCoor)].setText("O");
                        switch (gameWon) {
                            case 1:
                                myLabel.setText("You lost the game!");
                                break mainloop;
                            case 2:
                                myLabel.setText("You won the game!");
                                break mainloop;
                            case 3:
                                myLabel.setText("Draw!");
                                break mainloop;
                            default:
                                break;
                        }
                    }
                    
                    otherPlayerMsgSet = true;
                }
                
            } else {
                if (otherPlayerMsgSet){
                    myLabel.setText("Take your turn!");
                    for (int k =0; k < numOfRows; k++){
                        for (int l = 0; l < numOfCols; l++){
                            tttLists[k][l].setEnabled(true);
                        }
                    }
                    int gameWon = Integer.parseInt(proxy.checkWin(gameID));
                    if (p1){
                        tttLists[Integer.parseInt(lastXCoor)][Integer.parseInt(lastYCoor)].setText("O");
                        switch (gameWon) {
                            case 1:
                                myLabel.setText("You won the game!");
                                break mainloop;
                            case 2:
                                myLabel.setText("You lost the game!");
                                break mainloop;
                            case 3:
                                myLabel.setText("Draw!");
                                break mainloop;
                            default:
                                break;
                        }
                    } else {
                        tttLists[Integer.parseInt(lastXCoor)][Integer.parseInt(lastYCoor)].setText("X");
                        switch (gameWon) {
                            case 1:
                                myLabel.setText("You lost the game!");
                                break mainloop;
                            case 2:
                                myLabel.setText("You won the game!");
                                break mainloop;
                            case 3:
                                myLabel.setText("Draw!");
                                break mainloop;
                            default:
                                break;
                        }
                    }
                    otherPlayerMsgSet = false;
                }
            }
            
            reply = proxy.getBoard(gameID);
            
            try {
                sleep(500);
            } catch(Exception e) {
                
            }
        }
    }
    
    public JPanel getPanel() {
        return myPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        
        for (int i = 0; i < numOfRows; i++){
            for (int j = 0; j < numOfCols; j++){
                if (button == tttLists[i][j]){
                    proxy.takeSquare(i, j, gameID, userID);
                    break;
                }
            }
        }
    }
    
}