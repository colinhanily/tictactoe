/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import gamescreen.GameThread;
import java.awt.Dimension;
import project.TTTWebService;
import project.TTTWebService_Service;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.image.ImageView;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javafx.scene.image.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.ListSelectionModel;

/**
 * Authors: Colin Hanily: 14159031
 *          Padraig Connolly: 14160072 
 * Group Name: Group 2
 * 
 * Main file for the tictactoe project
 */
public class Project implements ActionListener {
    
    //creating variables for various project elements
    private JFrame gameInterface; 
    private JPanel gameSetupPanel, login, signup, statsPage, leagueTable,
            gamePanel;
    private JButton b1, b2, sign_up, sign_up_clear, sign_up_submit, submit_guess, back_to_game_setup,
            play_again, logout, back, stats, create, join, league, exit_stats_page, refresh;
    private JLabel first_label, guesses, second_label, email_label, user_label,
            password_label, signup_user_label, signup_password_label, username_label, wins_label, losses_label, draws_label,
            extra_label, picPanel, tf, guess_label, guesses_used, game_won, game_lost, stats_label;
    private JTextField first, second, email, user_signup, password_signup, user,
            password, user_letter;
    private JTable games;
    private TTTWebService proxy;
    private TTTWebService_Service ws;
    private int pid, gid, wins, losses, draws;
    private String username;
    private String[] myStatsCol, openGamesCol, leagueTableCol;
    private String openGamesData[][];
    private JTable openGames, leagueList;
    private GameThread gameThread;
    private Boolean p1;

    TTTWebService myLink;
    Project game;

    public Project() throws IOException {

        ws = new TTTWebService_Service(); //creating web service instance
        proxy = ws.getTTTWebServicePort(); //creating proxy to webservice
        myLink = this.getProxy(); // link to the webservice using the proxy

        gameInterface = new JFrame("Game"); //Jframe for the game interface
        int windowWidth = 600;
        int windowHeight = 700;
        gameInterface.setBounds(500, 100, windowWidth, windowHeight);
        gameInterface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameSetupPanel = new JPanel();
        login = new JPanel();
        signup = new JPanel();
        statsPage = new JPanel();
        leagueTable = new JPanel();

        myStatsCol = new String[]{
            "Username", "Wins", "Losses", "Draws"
        };

        openGamesCol = new String[]{
            "GID", "Username"
        };

        leagueTableCol = new String[]{
            "Username", "Wins", "Losses", "Draws"
        };

        openGames = new JTable(listOpenGames(), openGamesCol); //creating JTable instance showing open games
        openGames.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane sp = new JScrollPane(openGames); //scroll pane containing openGames JTable

        leagueList = new JTable(allPlayerStats(), leagueTableCol);
        leagueList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane ll = new JScrollPane(leagueList);

        b1 = new JButton("Clear");
        b2 = new JButton("Log In");
        sign_up = new JButton("Sign Up Instead?");
        sign_up_clear = new JButton("Clear");
        sign_up_submit = new JButton("Sign Up");
        submit_guess = new JButton("Guess!");
        play_again = new JButton("Play Again?");
        logout = new JButton("Logout");
        back = new JButton("Back to Login");
        stats = new JButton("My Stats");
        create = new JButton("Create a New Game");
        league = new JButton("League Table");
        join = new JButton("Join Game");
        exit_stats_page = new JButton("back to Game Screen");
        refresh = new JButton("Refresh Games List");
        back_to_game_setup = new JButton("Back To Main Menu");

        //setting preferred size of each button
        create.setPreferredSize(new Dimension(300, 25));
        join.setPreferredSize(new Dimension(300, 25));
        logout.setPreferredSize(new Dimension(300, 25));
        stats.setPreferredSize(new Dimension(300, 25));
        league.setPreferredSize(new Dimension(300, 25));
        refresh.setPreferredSize(new Dimension(300, 25));
        ll.setPreferredSize(new Dimension(350, 250));
        back_to_game_setup.setPreferredSize(new Dimension(300, 25));

        //Creating JLabel instances
        first_label = new JLabel("First Name:", SwingConstants.CENTER);
        second_label = new JLabel("Second Name:", SwingConstants.CENTER);
        email_label = new JLabel("Email Name:", SwingConstants.CENTER);
        user_label = new JLabel("User Name:");
        password_label = new JLabel("Password:");
        signup_user_label = new JLabel("User Name:", SwingConstants.CENTER);
        signup_password_label = new JLabel("Password:", SwingConstants.CENTER);
        username_label = new JLabel("Username:");
        wins_label = new JLabel("Wins:");
        losses_label = new JLabel("Losses:");
        draws_label = new JLabel("Draws:");
        stats_label = new JLabel("Your Game Stats", SwingConstants.CENTER);

        //Setting label sizes
        wins_label.setPreferredSize(new Dimension(300, 25));
        losses_label.setPreferredSize(new Dimension(300, 25));
        draws_label.setPreferredSize(new Dimension(300, 25));
        exit_stats_page.setPreferredSize(new Dimension(300, 25));
        stats_label.setPreferredSize(new Dimension(300, 25));

        //creating text field instances
        first = new JTextField();
        second = new JTextField();
        email = new JTextField();
        user_signup = new JTextField();
        password_signup = new JPasswordField();
        user = new JTextField();
        password = new JPasswordField();

        //adding action listeners to buttons
        b1.addActionListener(this);
        b2.addActionListener(this);
        sign_up.addActionListener(this);
        sign_up_submit.addActionListener(this);
        submit_guess.addActionListener(this);
        play_again.addActionListener(this);
        logout.addActionListener(this);
        back.addActionListener(this);
        stats.addActionListener(this);
        exit_stats_page.addActionListener(this);
        create.addActionListener(this);
        refresh.addActionListener(this);
        join.addActionListener(this);
        back_to_game_setup.addActionListener(this);
        league.addActionListener(this);
        sign_up_clear.addActionListener(this);
        stats.addActionListener(this);

        //setting layout of panels and adding functionality
        login.setLayout(new GridLayout(7, 2));
        login.add(user_label);
        login.add(user);
        login.add(password_label);
        login.add(password);
        login.add(b1);
        login.add(b2);
        login.add(sign_up);

        signup.setLayout(new GridLayout(6, 2));
        signup.add(first_label);
        signup.add(first);
        signup.add(second_label);
        signup.add(second);
        signup.add(signup_user_label);
        signup.add(user_signup);
        signup.add(signup_password_label);
        signup.add(password_signup);
        signup.add(sign_up_clear);
        signup.add(sign_up_submit);
        signup.add(back);

        gameSetupPanel.add(create);
        gameSetupPanel.add(refresh);
        gameSetupPanel.add(sp);
        gameSetupPanel.add(join);

        gameSetupPanel.add(stats);
        gameSetupPanel.add(league);
        gameSetupPanel.add(logout);

        leagueTable.add(back_to_game_setup);
        leagueTable.add(ll);

        statsPage.add(stats_label);
        statsPage.add(wins_label);
        statsPage.add(losses_label);
        statsPage.add(draws_label);
        statsPage.add(exit_stats_page);
        gameInterface.setContentPane(login);
        gameInterface.setVisible(true);

        allPlayerStats();
    }

    public TTTWebService getProxy() {
        return proxy;
    }

    public static void main(String[] args) throws IOException {
        Project game = new Project();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        if (button == b1) {
            user.setText(""); //clear text field
            password.setText("");
        } else if (button == b2) {

            username = user.getText();
            pid = myLink.login(user.getText(), password.getText()); //setting user pid

            if (pid > 0) { // if successful change panels to the game setup panel

                gameInterface.remove(login);
                gameInterface.setContentPane(gameSetupPanel);
                gameInterface.validate();
                gameInterface.repaint();
            }
        } else if (button == sign_up) { //cgange panels to registration screen
            gameInterface.remove(login);
            user.setText("");
            password.setText("");
            gameInterface.setContentPane(signup);
            gameInterface.validate();
            gameInterface.repaint();
        } else if (button == sign_up_clear) { // clear all sign up fields
            first.setText("");
            second.setText("");
            user_signup.setText("");
            password_signup.setText("");
        } else if (button == sign_up_submit) { //sign up user
            String first_name = first.getText();
            String second_name = second.getText();
            String username_text = user_signup.getText();
            String password_text = password_signup.getText();
            String register = myLink.register(username_text, password_text, first_name, second_name); //register user using web service
            if ("ERROR-REPEAT".equals(register) || "ERROR-INSERT".equals(register) || "ERROR-RETRIEVE".equals(register) || "ERROR-DB".equals(register)) { //if an errir occurs make no changes

            } else {                //otherwise change panels to login screen and clear text fields
                first.setText("");
                second.setText("");
                user_signup.setText("");
                password_signup.setText("");
                gameInterface.remove(signup);
                gameInterface.setContentPane(login);
                gameInterface.validate();
                gameInterface.repaint();
            }
        } else if (button == back) { //back button to remove registration panel and return to login panel
            gameInterface.remove(signup);
            first.setText("");
            second.setText("");
            email.setText("");
            user_signup.setText("");
            password_signup.setText("");
            gameInterface.setContentPane(login);

        } else if (button == logout) { //return to login screen
            pid = 0; 
            user.setText("");
            password.setText("");
            gameInterface.remove(gameSetupPanel);
            gameInterface.setContentPane(login);
            gameInterface.validate();
            gameInterface.repaint();
        } else if (button == stats) { //load the players stats panel
            myGames();
            wins_label.setText("Wins: " + wins);
            losses_label.setText("Losses: " + losses);
            draws_label.setText("Draws: " + draws);
            gameInterface.remove(gameSetupPanel);
            gameInterface.setContentPane(statsPage);
            gameInterface.validate();
            gameInterface.repaint();
        } else if (button == exit_stats_page) { //return from stats panel to game setup panel
            gameInterface.remove(statsPage);
            gameInterface.setContentPane(gameSetupPanel);
            gameInterface.validate();
            gameInterface.repaint();
        } else if (button == create) { // create a new game
            gid = Integer.parseInt(myLink.newGame(pid)); //setting gameID
            p1 = true;
            gameThread = new GameThread(p1, gid, pid, gameSetupPanel, gameInterface);
            gameThread.start();
            gamePanel = gameThread.getPanel();
            initGame();
            System.out.println(pid);

        } else if (button == refresh) {
            refreshOpenGames();
            System.out.println("REFRESHED");
        } else if (button == join) {
            gid = gID();

            String gameJoin = myLink.joinGame(pid, gid);

            if (Integer.parseInt(gameJoin) == 0 || "ERROR-DB".equals(gameJoin)) {
                System.out.println("Error joining game");
            } else {
                p1 = false;
                gameThread = new GameThread(p1, gid, pid, gameSetupPanel, gameInterface);
                gameThread.start();
                gamePanel = gameThread.getPanel();
                refreshOpenGames();
                initGame();
            }
        } else if (button == league) {
            refreshLeagueTable();
        } else if (button == back_to_game_setup) { 
            gameInterface.remove(leagueTable);
            gameInterface.setContentPane(gameSetupPanel);
            gameInterface.validate();
            gameInterface.repaint();
        }
    }

    private void initGame() {
        gameInterface.remove(gameSetupPanel);
        gameInterface.setContentPane(gamePanel);
        gameInterface.validate();
        gameInterface.repaint();
    }

    public void refreshLeagueTable() { //creates a league table showing all user's wins, losses and draws

        leagueList = new JTable(allPlayerStats(), leagueTableCol);
        leagueList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane ll = new JScrollPane(leagueList);

        gameInterface.remove(gameSetupPanel);
        leagueTable.removeAll();
        leagueTable.add(back_to_game_setup);
        leagueTable.add(ll);
        gameInterface.setContentPane(leagueTable);
        gameInterface.validate();
        gameInterface.repaint();

    }

    public void refreshOpenGames() { // creates a table showing all open games 

        openGames = new JTable(listOpenGames(), openGamesCol);
        openGames.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane sp = new JScrollPane(openGames);

        gameInterface.remove(gameSetupPanel);
        gameSetupPanel.removeAll();
        gameSetupPanel.add(create);
        gameSetupPanel.add(refresh);
        gameSetupPanel.add(sp);
        gameSetupPanel.add(join);
        gameSetupPanel.add(stats);
        gameSetupPanel.add(league);
        gameSetupPanel.add(logout);
        gameInterface.setContentPane(gameSetupPanel);

    }

    public String[][] listOpenGames() {

        String[] openGames = myLink.showOpenGames().split("\n"); // takes open games data from database and splits it into individual games and stores them in an array
        System.out.println(myLink.showOpenGames());
        if ("ERROR-NOGAMES".equals(myLink.showOpenGames()) || "ERROR-DB".equals(myLink.showOpenGames())) { // if there is an error
            String[][] error = new String[0][0]; // create and return an empty 2d array
            return error;
        } else { // otherwise create an array to hold each games data and store the data of all open games in a 2d array
            String[] details;
            String[][] openGameData = new String[openGames.length][3];
            for (int i = 0; i < openGames.length; i++) { //loop throygh the open games

                details = openGames[i].split(","); //split each games details and store it in an array

                for (int j = 0; j < 3; j++) { //loop through each games details
                    openGameData[i][j] = details[j]; //store each games details in a 2d array, columns represent games, rows represent the games details
                }
            }

            return openGameData;
        }
    }

    public int myGames() {
        wins = 0; //set wins to 0
        losses = 0;
        draws = 0;
        System.out.println("MYSTATS");
        String[] myGames = myLink.leagueTable().split("\n"); //split all games games from database into individual games and store each game in an array
        String[] gameDetails;
        System.out.println(myLink.leagueTable());
        if ("ERROR-NOGAMES".equals(myLink.leagueTable()) || "ERROR-DB".equals(myLink.leagueTable())) { // if error 
            return 0;
        } else { // otherwise loop through each game and split each games details and store them in an array

            for (int i = 0; i < myGames.length; i++) {
                gameDetails = myGames[i].split(",");
                //if the username matches a players name, and the game is completed, determine if win loss or draw and add to players statistic    
                if (username.equals(gameDetails[1]) && Integer.parseInt(gameDetails[3]) == 1) { 
                    wins = wins + 1;
                    System.out.println("win");
                } else if (username.equals(gameDetails[2]) && Integer.parseInt(gameDetails[3]) == 2) {
                    wins = wins + 1;
                    System.out.println("win");
                } else if (username.equals(gameDetails[1]) && Integer.parseInt(gameDetails[3]) == 2) {
                    losses = losses + 1;
                    System.out.println("loss");
                } else if (username.equals(gameDetails[2]) && Integer.parseInt(gameDetails[3]) == 1) {
                    losses = losses + 1;
                    System.out.println("loss");
                } else if (Integer.parseInt(gameDetails[3]) == 3) {
                    draws = draws + 1;
                    System.out.println("DRAW");
                } else {
                    System.out.println("NONE");
                }
            }
        }
        return 0;
    }

    public int gID() { //returns the game ID from the selected game from the JTable for open games 
        int row;
        int gameId;
        row = openGames.getSelectedRow();
        try {
            gameId = Integer.parseInt(openGames.getValueAt(row, 0).toString());
            System.out.println(gameId);
            return gameId;
        } catch (Exception e) {

        }

        System.out.println("join");
        return -1;

    }

    public String[][] allPlayerStats() { //sorts all player statistics for creation of the leagueTable
        System.out.println("STATS");
        String[] games = myLink.leagueTable().split("\n"); //create array of all open games from database using the webservice link
        String[] gameDetails;

        ArrayList<String> players = new ArrayList<String>(); //create and arrayList to store each players ID
        players.clear();
        System.out.println("Stats: " + myLink.leagueTable());
        if ("ERROR-NOGAMES".equals(myLink.leagueTable()) || "ERROR-DB".equals(myLink.leagueTable())) { //if error return an empty 2d array with 1 column and 4 rows 
            String playerStats[][] = new String[1][4];

            return playerStats;
        } else {    //otherwise loop through each game and add each unique player to the players arrayList

            for (int i = 0; i < games.length; i++) {
                gameDetails = games[i].split(",");
                if (players.contains(gameDetails[1])) {

                } else {
                    players.add(gameDetails[1]);
                }
                if (players.contains(gameDetails[2])) {

                } else {
                    players.add(gameDetails[2]);
                }
            }

            String[][] playerStats = new String[players.size()][4]; //create array for each players 
            for (int k = 0; k < players.size(); k++) { //testing player stats by printing to console and initialising values in the array to avoid a null pointer exception
                playerStats[k][0] = players.get(k);
                playerStats[k][1] = Integer.toString(0);
                playerStats[k][2] = Integer.toString(0);
                playerStats[k][3] = Integer.toString(0);
                System.out.println("PLAYER " + playerStats[k][0] + " ");
                System.out.println("Wins " + playerStats[k][0]);
                System.out.println("Losses " + playerStats[k][1]);
                System.out.println("Draws " + playerStats[k][2]);

            }

            for (int i = 0; i < games.length; i++) { //loop through each game and split into individual game data
                gameDetails = games[i].split(",");
                
/*loop through each players stats and conpare to each games details, decide if
the player has a win loss or draw or is not in each game. if the player is in the
game instance, add 1 to the players wins, losses or draws stats in the playerStats 2d
array accordingly, otherwise, ignore the game
*/
                for (int m = 0; m < players.size(); m++) { 
                    if (playerStats[m][0].equals(gameDetails[1]) && Integer.parseInt(gameDetails[3]) == 1) {
                        playerStats[m][1] = Integer.toString(Integer.parseInt(playerStats[m][1]) + 1);
                        System.out.println("win");

                    } else if (playerStats[m][0].equals(gameDetails[2]) && Integer.parseInt(gameDetails[3]) == 2) {
                        playerStats[m][1] = Integer.toString(Integer.parseInt(playerStats[m][1]) + 1);
                        System.out.println("win");

                    } else if (playerStats[m][0].equals(gameDetails[1]) && Integer.parseInt(gameDetails[3]) == 2) {
                        playerStats[m][2] = Integer.toString(Integer.parseInt(playerStats[m][2]) + 1);
                        System.out.println("loss");

                    } else if (playerStats[m][0].equals(gameDetails[2]) && Integer.parseInt(gameDetails[3]) == 1) {
                        playerStats[m][2] = Integer.toString(Integer.parseInt(playerStats[m][2]) + 1);
                        System.out.println("loss");

                    } else if (Integer.parseInt(gameDetails[3]) == 3 && playerStats[m][0].equals(gameDetails[1])) {
                        playerStats[m][3] = Integer.toString(Integer.parseInt(playerStats[m][3]) + 1);
                        System.out.println("draw");

                    } else if (Integer.parseInt(gameDetails[3]) == 3 && playerStats[m][0].equals(gameDetails[2])) {
                        playerStats[m][3] = Integer.toString(Integer.parseInt(playerStats[m][3]) + 1);
                        System.out.println("draw");

                    } else {
                        System.out.println("No match");
                    }
                }
            }
            return playerStats; //return the 2d array of players and their stats
        }

    }
}
