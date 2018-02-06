package be.kdg.Fill.view.game;

import javafx.scene.layout.BorderPane;

/**
 * @author Michael Kaethoven
 * @version 1.0 6-2-2018 14:18
 */
public class GameView extends BorderPane {
	private GameHeaderView gameHeaderView;

	public GameView() {
		initialiseNodes();
		layoutNodes();
	}

	private void initialiseNodes() {
		gameHeaderView = new GameHeaderView();
		new GameHeaderPresenter( gameHeaderView );

	}

	private void layoutNodes() {
		super.setTop( gameHeaderView );

	}

	GameHeaderView getGameHeaderView() {
		return gameHeaderView;
	}
}
