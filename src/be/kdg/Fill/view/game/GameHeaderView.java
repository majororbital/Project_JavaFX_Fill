package be.kdg.Fill.view.game;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

/**
 * @author Michael Kaethoven
 * @version 1.0 6-2-2018 14:26
 */
public class GameHeaderView extends HBox {
	private Button pauseBtn;
	private Label lvlLbl;
	private Label timerLbl;

	public GameHeaderView() {
		initialiseNodes();
		layouNodes();
	}

	private void initialiseNodes() {
		this.pauseBtn = new Button("Pause");
		this.lvlLbl = new Label("Level");
		this.timerLbl = new Label( "Timer" );
	}

	private void layouNodes() {
		super.getChildren().addAll( pauseBtn, lvlLbl, timerLbl );
		super.setSpacing( 200 );
		super.setPadding( new Insets( 10 ) );

	}

	Button getPauseBtn() {
		return pauseBtn;
	}

	Label getLvlLbl() {
		return lvlLbl;
	}

	Label getTimerLbl() {
		return timerLbl;
	}
}
