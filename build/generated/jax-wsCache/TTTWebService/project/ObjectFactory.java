
package project;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the project package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _JoinGameResponse_QNAME = new QName("http://server.james.ttt/", "joinGameResponse");
    private final static QName _Login_QNAME = new QName("http://server.james.ttt/", "login");
    private final static QName _ShowOpenGames_QNAME = new QName("http://server.james.ttt/", "showOpenGames");
    private final static QName _LeagueTable_QNAME = new QName("http://server.james.ttt/", "leagueTable");
    private final static QName _NewGame_QNAME = new QName("http://server.james.ttt/", "newGame");
    private final static QName _GetBoard_QNAME = new QName("http://server.james.ttt/", "getBoard");
    private final static QName _CheckSquareResponse_QNAME = new QName("http://server.james.ttt/", "checkSquareResponse");
    private final static QName _CheckWinResponse_QNAME = new QName("http://server.james.ttt/", "checkWinResponse");
    private final static QName _ShowMyOpenGames_QNAME = new QName("http://server.james.ttt/", "showMyOpenGames");
    private final static QName _DeleteGame_QNAME = new QName("http://server.james.ttt/", "deleteGame");
    private final static QName _DeleteGameResponse_QNAME = new QName("http://server.james.ttt/", "deleteGameResponse");
    private final static QName _SetGameStateResponse_QNAME = new QName("http://server.james.ttt/", "setGameStateResponse");
    private final static QName _JoinGame_QNAME = new QName("http://server.james.ttt/", "joinGame");
    private final static QName _GetGameStateResponse_QNAME = new QName("http://server.james.ttt/", "getGameStateResponse");
    private final static QName _LeagueTableResponse_QNAME = new QName("http://server.james.ttt/", "leagueTableResponse");
    private final static QName _CheckWin_QNAME = new QName("http://server.james.ttt/", "checkWin");
    private final static QName _ShowMyOpenGamesResponse_QNAME = new QName("http://server.james.ttt/", "showMyOpenGamesResponse");
    private final static QName _ShowAllMyGamesResponse_QNAME = new QName("http://server.james.ttt/", "showAllMyGamesResponse");
    private final static QName _GetBoardResponse_QNAME = new QName("http://server.james.ttt/", "getBoardResponse");
    private final static QName _NewGameResponse_QNAME = new QName("http://server.james.ttt/", "newGameResponse");
    private final static QName _LoginResponse_QNAME = new QName("http://server.james.ttt/", "loginResponse");
    private final static QName _CheckSquare_QNAME = new QName("http://server.james.ttt/", "checkSquare");
    private final static QName _TakeSquare_QNAME = new QName("http://server.james.ttt/", "takeSquare");
    private final static QName _Register_QNAME = new QName("http://server.james.ttt/", "register");
    private final static QName _GetGameState_QNAME = new QName("http://server.james.ttt/", "getGameState");
    private final static QName _SetGameState_QNAME = new QName("http://server.james.ttt/", "setGameState");
    private final static QName _TakeSquareResponse_QNAME = new QName("http://server.james.ttt/", "takeSquareResponse");
    private final static QName _ShowAllMyGames_QNAME = new QName("http://server.james.ttt/", "showAllMyGames");
    private final static QName _ShowOpenGamesResponse_QNAME = new QName("http://server.james.ttt/", "showOpenGamesResponse");
    private final static QName _RegisterResponse_QNAME = new QName("http://server.james.ttt/", "registerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: project
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckSquareResponse }
     * 
     */
    public CheckSquareResponse createCheckSquareResponse() {
        return new CheckSquareResponse();
    }

    /**
     * Create an instance of {@link LeagueTable }
     * 
     */
    public LeagueTable createLeagueTable() {
        return new LeagueTable();
    }

    /**
     * Create an instance of {@link GetBoard }
     * 
     */
    public GetBoard createGetBoard() {
        return new GetBoard();
    }

    /**
     * Create an instance of {@link NewGame }
     * 
     */
    public NewGame createNewGame() {
        return new NewGame();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link ShowOpenGames }
     * 
     */
    public ShowOpenGames createShowOpenGames() {
        return new ShowOpenGames();
    }

    /**
     * Create an instance of {@link JoinGameResponse }
     * 
     */
    public JoinGameResponse createJoinGameResponse() {
        return new JoinGameResponse();
    }

    /**
     * Create an instance of {@link JoinGame }
     * 
     */
    public JoinGame createJoinGame() {
        return new JoinGame();
    }

    /**
     * Create an instance of {@link DeleteGameResponse }
     * 
     */
    public DeleteGameResponse createDeleteGameResponse() {
        return new DeleteGameResponse();
    }

    /**
     * Create an instance of {@link SetGameStateResponse }
     * 
     */
    public SetGameStateResponse createSetGameStateResponse() {
        return new SetGameStateResponse();
    }

    /**
     * Create an instance of {@link GetGameStateResponse }
     * 
     */
    public GetGameStateResponse createGetGameStateResponse() {
        return new GetGameStateResponse();
    }

    /**
     * Create an instance of {@link DeleteGame }
     * 
     */
    public DeleteGame createDeleteGame() {
        return new DeleteGame();
    }

    /**
     * Create an instance of {@link CheckWinResponse }
     * 
     */
    public CheckWinResponse createCheckWinResponse() {
        return new CheckWinResponse();
    }

    /**
     * Create an instance of {@link ShowMyOpenGames }
     * 
     */
    public ShowMyOpenGames createShowMyOpenGames() {
        return new ShowMyOpenGames();
    }

    /**
     * Create an instance of {@link NewGameResponse }
     * 
     */
    public NewGameResponse createNewGameResponse() {
        return new NewGameResponse();
    }

    /**
     * Create an instance of {@link CheckSquare }
     * 
     */
    public CheckSquare createCheckSquare() {
        return new CheckSquare();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link ShowAllMyGamesResponse }
     * 
     */
    public ShowAllMyGamesResponse createShowAllMyGamesResponse() {
        return new ShowAllMyGamesResponse();
    }

    /**
     * Create an instance of {@link GetBoardResponse }
     * 
     */
    public GetBoardResponse createGetBoardResponse() {
        return new GetBoardResponse();
    }

    /**
     * Create an instance of {@link ShowMyOpenGamesResponse }
     * 
     */
    public ShowMyOpenGamesResponse createShowMyOpenGamesResponse() {
        return new ShowMyOpenGamesResponse();
    }

    /**
     * Create an instance of {@link LeagueTableResponse }
     * 
     */
    public LeagueTableResponse createLeagueTableResponse() {
        return new LeagueTableResponse();
    }

    /**
     * Create an instance of {@link CheckWin }
     * 
     */
    public CheckWin createCheckWin() {
        return new CheckWin();
    }

    /**
     * Create an instance of {@link ShowAllMyGames }
     * 
     */
    public ShowAllMyGames createShowAllMyGames() {
        return new ShowAllMyGames();
    }

    /**
     * Create an instance of {@link ShowOpenGamesResponse }
     * 
     */
    public ShowOpenGamesResponse createShowOpenGamesResponse() {
        return new ShowOpenGamesResponse();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link GetGameState }
     * 
     */
    public GetGameState createGetGameState() {
        return new GetGameState();
    }

    /**
     * Create an instance of {@link SetGameState }
     * 
     */
    public SetGameState createSetGameState() {
        return new SetGameState();
    }

    /**
     * Create an instance of {@link TakeSquareResponse }
     * 
     */
    public TakeSquareResponse createTakeSquareResponse() {
        return new TakeSquareResponse();
    }

    /**
     * Create an instance of {@link TakeSquare }
     * 
     */
    public TakeSquare createTakeSquare() {
        return new TakeSquare();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JoinGameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.james.ttt/", name = "joinGameResponse")
    public JAXBElement<JoinGameResponse> createJoinGameResponse(JoinGameResponse value) {
        return new JAXBElement<JoinGameResponse>(_JoinGameResponse_QNAME, JoinGameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.james.ttt/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowOpenGames }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.james.ttt/", name = "showOpenGames")
    public JAXBElement<ShowOpenGames> createShowOpenGames(ShowOpenGames value) {
        return new JAXBElement<ShowOpenGames>(_ShowOpenGames_QNAME, ShowOpenGames.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeagueTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.james.ttt/", name = "leagueTable")
    public JAXBElement<LeagueTable> createLeagueTable(LeagueTable value) {
        return new JAXBElement<LeagueTable>(_LeagueTable_QNAME, LeagueTable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewGame }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.james.ttt/", name = "newGame")
    public JAXBElement<NewGame> createNewGame(NewGame value) {
        return new JAXBElement<NewGame>(_NewGame_QNAME, NewGame.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBoard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.james.ttt/", name = "getBoard")
    public JAXBElement<GetBoard> createGetBoard(GetBoard value) {
        return new JAXBElement<GetBoard>(_GetBoard_QNAME, GetBoard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckSquareResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.james.ttt/", name = "checkSquareResponse")
    public JAXBElement<CheckSquareResponse> createCheckSquareResponse(CheckSquareResponse value) {
        return new JAXBElement<CheckSquareResponse>(_CheckSquareResponse_QNAME, CheckSquareResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckWinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.james.ttt/", name = "checkWinResponse")
    public JAXBElement<CheckWinResponse> createCheckWinResponse(CheckWinResponse value) {
        return new JAXBElement<CheckWinResponse>(_CheckWinResponse_QNAME, CheckWinResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowMyOpenGames }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.james.ttt/", name = "showMyOpenGames")
    public JAXBElement<ShowMyOpenGames> createShowMyOpenGames(ShowMyOpenGames value) {
        return new JAXBElement<ShowMyOpenGames>(_ShowMyOpenGames_QNAME, ShowMyOpenGames.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGame }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.james.ttt/", name = "deleteGame")
    public JAXBElement<DeleteGame> createDeleteGame(DeleteGame value) {
        return new JAXBElement<DeleteGame>(_DeleteGame_QNAME, DeleteGame.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.james.ttt/", name = "deleteGameResponse")
    public JAXBElement<DeleteGameResponse> createDeleteGameResponse(DeleteGameResponse value) {
        return new JAXBElement<DeleteGameResponse>(_DeleteGameResponse_QNAME, DeleteGameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetGameStateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.james.ttt/", name = "setGameStateResponse")
    public JAXBElement<SetGameStateResponse> createSetGameStateResponse(SetGameStateResponse value) {
        return new JAXBElement<SetGameStateResponse>(_SetGameStateResponse_QNAME, SetGameStateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JoinGame }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.james.ttt/", name = "joinGame")
    public JAXBElement<JoinGame> createJoinGame(JoinGame value) {
        return new JAXBElement<JoinGame>(_JoinGame_QNAME, JoinGame.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGameStateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.james.ttt/", name = "getGameStateResponse")
    public JAXBElement<GetGameStateResponse> createGetGameStateResponse(GetGameStateResponse value) {
        return new JAXBElement<GetGameStateResponse>(_GetGameStateResponse_QNAME, GetGameStateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeagueTableResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.james.ttt/", name = "leagueTableResponse")
    public JAXBElement<LeagueTableResponse> createLeagueTableResponse(LeagueTableResponse value) {
        return new JAXBElement<LeagueTableResponse>(_LeagueTableResponse_QNAME, LeagueTableResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckWin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.james.ttt/", name = "checkWin")
    public JAXBElement<CheckWin> createCheckWin(CheckWin value) {
        return new JAXBElement<CheckWin>(_CheckWin_QNAME, CheckWin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowMyOpenGamesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.james.ttt/", name = "showMyOpenGamesResponse")
    public JAXBElement<ShowMyOpenGamesResponse> createShowMyOpenGamesResponse(ShowMyOpenGamesResponse value) {
        return new JAXBElement<ShowMyOpenGamesResponse>(_ShowMyOpenGamesResponse_QNAME, ShowMyOpenGamesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowAllMyGamesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.james.ttt/", name = "showAllMyGamesResponse")
    public JAXBElement<ShowAllMyGamesResponse> createShowAllMyGamesResponse(ShowAllMyGamesResponse value) {
        return new JAXBElement<ShowAllMyGamesResponse>(_ShowAllMyGamesResponse_QNAME, ShowAllMyGamesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBoardResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.james.ttt/", name = "getBoardResponse")
    public JAXBElement<GetBoardResponse> createGetBoardResponse(GetBoardResponse value) {
        return new JAXBElement<GetBoardResponse>(_GetBoardResponse_QNAME, GetBoardResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewGameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.james.ttt/", name = "newGameResponse")
    public JAXBElement<NewGameResponse> createNewGameResponse(NewGameResponse value) {
        return new JAXBElement<NewGameResponse>(_NewGameResponse_QNAME, NewGameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.james.ttt/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckSquare }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.james.ttt/", name = "checkSquare")
    public JAXBElement<CheckSquare> createCheckSquare(CheckSquare value) {
        return new JAXBElement<CheckSquare>(_CheckSquare_QNAME, CheckSquare.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TakeSquare }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.james.ttt/", name = "takeSquare")
    public JAXBElement<TakeSquare> createTakeSquare(TakeSquare value) {
        return new JAXBElement<TakeSquare>(_TakeSquare_QNAME, TakeSquare.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Register }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.james.ttt/", name = "register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGameState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.james.ttt/", name = "getGameState")
    public JAXBElement<GetGameState> createGetGameState(GetGameState value) {
        return new JAXBElement<GetGameState>(_GetGameState_QNAME, GetGameState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetGameState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.james.ttt/", name = "setGameState")
    public JAXBElement<SetGameState> createSetGameState(SetGameState value) {
        return new JAXBElement<SetGameState>(_SetGameState_QNAME, SetGameState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TakeSquareResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.james.ttt/", name = "takeSquareResponse")
    public JAXBElement<TakeSquareResponse> createTakeSquareResponse(TakeSquareResponse value) {
        return new JAXBElement<TakeSquareResponse>(_TakeSquareResponse_QNAME, TakeSquareResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowAllMyGames }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.james.ttt/", name = "showAllMyGames")
    public JAXBElement<ShowAllMyGames> createShowAllMyGames(ShowAllMyGames value) {
        return new JAXBElement<ShowAllMyGames>(_ShowAllMyGames_QNAME, ShowAllMyGames.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowOpenGamesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.james.ttt/", name = "showOpenGamesResponse")
    public JAXBElement<ShowOpenGamesResponse> createShowOpenGamesResponse(ShowOpenGamesResponse value) {
        return new JAXBElement<ShowOpenGamesResponse>(_ShowOpenGamesResponse_QNAME, ShowOpenGamesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.james.ttt/", name = "registerResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

}
