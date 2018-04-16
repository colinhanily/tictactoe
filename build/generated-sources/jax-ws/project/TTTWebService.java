
package project;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TTTWebService", targetNamespace = "http://server.james.ttt/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TTTWebService {


    /**
     * 
     * @param password
     * @param surname
     * @param name
     * @param username
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "register", targetNamespace = "http://server.james.ttt/", className = "project.Register")
    @ResponseWrapper(localName = "registerResponse", targetNamespace = "http://server.james.ttt/", className = "project.RegisterResponse")
    @Action(input = "http://server.james.ttt/TTTWebService/registerRequest", output = "http://server.james.ttt/TTTWebService/registerResponse")
    public String register(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "surname", targetNamespace = "")
        String surname);

    /**
     * 
     * @param uid
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "newGame", targetNamespace = "http://server.james.ttt/", className = "project.NewGame")
    @ResponseWrapper(localName = "newGameResponse", targetNamespace = "http://server.james.ttt/", className = "project.NewGameResponse")
    @Action(input = "http://server.james.ttt/TTTWebService/newGameRequest", output = "http://server.james.ttt/TTTWebService/newGameResponse")
    public String newGame(
        @WebParam(name = "uid", targetNamespace = "")
        int uid);

    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://server.james.ttt/", className = "project.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://server.james.ttt/", className = "project.LoginResponse")
    @Action(input = "http://server.james.ttt/TTTWebService/loginRequest", output = "http://server.james.ttt/TTTWebService/loginResponse")
    public int login(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param gid
     * @param gstate
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "setGameState", targetNamespace = "http://server.james.ttt/", className = "project.SetGameState")
    @ResponseWrapper(localName = "setGameStateResponse", targetNamespace = "http://server.james.ttt/", className = "project.SetGameStateResponse")
    @Action(input = "http://server.james.ttt/TTTWebService/setGameStateRequest", output = "http://server.james.ttt/TTTWebService/setGameStateResponse")
    public String setGameState(
        @WebParam(name = "gid", targetNamespace = "")
        int gid,
        @WebParam(name = "gstate", targetNamespace = "")
        int gstate);

    /**
     * 
     * @param gid
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getGameState", targetNamespace = "http://server.james.ttt/", className = "project.GetGameState")
    @ResponseWrapper(localName = "getGameStateResponse", targetNamespace = "http://server.james.ttt/", className = "project.GetGameStateResponse")
    @Action(input = "http://server.james.ttt/TTTWebService/getGameStateRequest", output = "http://server.james.ttt/TTTWebService/getGameStateResponse")
    public String getGameState(
        @WebParam(name = "gid", targetNamespace = "")
        int gid);

    /**
     * 
     * @param gid
     * @param x
     * @param y
     * @param pid
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "takeSquare", targetNamespace = "http://server.james.ttt/", className = "project.TakeSquare")
    @ResponseWrapper(localName = "takeSquareResponse", targetNamespace = "http://server.james.ttt/", className = "project.TakeSquareResponse")
    @Action(input = "http://server.james.ttt/TTTWebService/takeSquareRequest", output = "http://server.james.ttt/TTTWebService/takeSquareResponse")
    public String takeSquare(
        @WebParam(name = "x", targetNamespace = "")
        int x,
        @WebParam(name = "y", targetNamespace = "")
        int y,
        @WebParam(name = "gid", targetNamespace = "")
        int gid,
        @WebParam(name = "pid", targetNamespace = "")
        int pid);

    /**
     * 
     * @param uid
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "showMyOpenGames", targetNamespace = "http://server.james.ttt/", className = "project.ShowMyOpenGames")
    @ResponseWrapper(localName = "showMyOpenGamesResponse", targetNamespace = "http://server.james.ttt/", className = "project.ShowMyOpenGamesResponse")
    @Action(input = "http://server.james.ttt/TTTWebService/showMyOpenGamesRequest", output = "http://server.james.ttt/TTTWebService/showMyOpenGamesResponse")
    public String showMyOpenGames(
        @WebParam(name = "uid", targetNamespace = "")
        int uid);

    /**
     * 
     * @param uid
     * @param gid
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "joinGame", targetNamespace = "http://server.james.ttt/", className = "project.JoinGame")
    @ResponseWrapper(localName = "joinGameResponse", targetNamespace = "http://server.james.ttt/", className = "project.JoinGameResponse")
    @Action(input = "http://server.james.ttt/TTTWebService/joinGameRequest", output = "http://server.james.ttt/TTTWebService/joinGameResponse")
    public String joinGame(
        @WebParam(name = "uid", targetNamespace = "")
        int uid,
        @WebParam(name = "gid", targetNamespace = "")
        int gid);

    /**
     * 
     * @param gid
     * @param x
     * @param y
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkSquare", targetNamespace = "http://server.james.ttt/", className = "project.CheckSquare")
    @ResponseWrapper(localName = "checkSquareResponse", targetNamespace = "http://server.james.ttt/", className = "project.CheckSquareResponse")
    @Action(input = "http://server.james.ttt/TTTWebService/checkSquareRequest", output = "http://server.james.ttt/TTTWebService/checkSquareResponse")
    public String checkSquare(
        @WebParam(name = "x", targetNamespace = "")
        int x,
        @WebParam(name = "y", targetNamespace = "")
        int y,
        @WebParam(name = "gid", targetNamespace = "")
        int gid);

    /**
     * 
     * @param uid
     * @param gid
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteGame", targetNamespace = "http://server.james.ttt/", className = "project.DeleteGame")
    @ResponseWrapper(localName = "deleteGameResponse", targetNamespace = "http://server.james.ttt/", className = "project.DeleteGameResponse")
    @Action(input = "http://server.james.ttt/TTTWebService/deleteGameRequest", output = "http://server.james.ttt/TTTWebService/deleteGameResponse")
    public String deleteGame(
        @WebParam(name = "gid", targetNamespace = "")
        int gid,
        @WebParam(name = "uid", targetNamespace = "")
        int uid);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "leagueTable", targetNamespace = "http://server.james.ttt/", className = "project.LeagueTable")
    @ResponseWrapper(localName = "leagueTableResponse", targetNamespace = "http://server.james.ttt/", className = "project.LeagueTableResponse")
    @Action(input = "http://server.james.ttt/TTTWebService/leagueTableRequest", output = "http://server.james.ttt/TTTWebService/leagueTableResponse")
    public String leagueTable();

    /**
     * 
     * @param gid
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkWin", targetNamespace = "http://server.james.ttt/", className = "project.CheckWin")
    @ResponseWrapper(localName = "checkWinResponse", targetNamespace = "http://server.james.ttt/", className = "project.CheckWinResponse")
    @Action(input = "http://server.james.ttt/TTTWebService/checkWinRequest", output = "http://server.james.ttt/TTTWebService/checkWinResponse")
    public String checkWin(
        @WebParam(name = "gid", targetNamespace = "")
        int gid);

    /**
     * 
     * @param uid
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "showAllMyGames", targetNamespace = "http://server.james.ttt/", className = "project.ShowAllMyGames")
    @ResponseWrapper(localName = "showAllMyGamesResponse", targetNamespace = "http://server.james.ttt/", className = "project.ShowAllMyGamesResponse")
    @Action(input = "http://server.james.ttt/TTTWebService/showAllMyGamesRequest", output = "http://server.james.ttt/TTTWebService/showAllMyGamesResponse")
    public String showAllMyGames(
        @WebParam(name = "uid", targetNamespace = "")
        int uid);

    /**
     * 
     * @param gid
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBoard", targetNamespace = "http://server.james.ttt/", className = "project.GetBoard")
    @ResponseWrapper(localName = "getBoardResponse", targetNamespace = "http://server.james.ttt/", className = "project.GetBoardResponse")
    @Action(input = "http://server.james.ttt/TTTWebService/getBoardRequest", output = "http://server.james.ttt/TTTWebService/getBoardResponse")
    public String getBoard(
        @WebParam(name = "gid", targetNamespace = "")
        int gid);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "showOpenGames", targetNamespace = "http://server.james.ttt/", className = "project.ShowOpenGames")
    @ResponseWrapper(localName = "showOpenGamesResponse", targetNamespace = "http://server.james.ttt/", className = "project.ShowOpenGamesResponse")
    @Action(input = "http://server.james.ttt/TTTWebService/showOpenGamesRequest", output = "http://server.james.ttt/TTTWebService/showOpenGamesResponse")
    public String showOpenGames();

}
