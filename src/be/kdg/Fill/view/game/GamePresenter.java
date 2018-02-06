package be.kdg.Fill.view.game;

/**
 * @author Michael Kaethoven
 * @version 1.0 6-2-2018 14:35
 */
public class GamePresenter {
	private GameView gameView;

	public GamePresenter(GameView view) {
		this.gameView = view;
		new GameHeaderPresenter( view.getGameHeaderView() );
	}
}
