package be.kdg.Fill.view.start;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

/**
 * @author Michael Kaethoven
 * @version 1.0 6-2-2018 11:07
 */
public class ButtonView extends VBox {
	private Button startBtn;
	private Button settingBtn;
	private Button exitBtn;

	public ButtonView() {
		initialiseNodes();
		layoutNodes();
	}

	private void initialiseNodes() {
		this.startBtn = new Button( "Start" );
		this.settingBtn = new Button( "Settings" );
		this.exitBtn = new Button( "Exit" );
	}

	private void layoutNodes() {
		startBtn.setPrefWidth( 200 );
		settingBtn.setPrefWidth( 200 );
		exitBtn.setPrefWidth( 200 );
		super.setAlignment( Pos.CENTER );
		super.getChildren().addAll( startBtn, settingBtn, exitBtn );
		super.setSpacing( 80 );
	}

	Button getStartBtn() {
		return startBtn;
	}

	Button getSettingBtn() {
		return settingBtn;
	}

	Button getExitBtn() {
		return exitBtn;
	}
}
