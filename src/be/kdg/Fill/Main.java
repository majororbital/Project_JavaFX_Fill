package be.kdg.Fill;

import be.kdg.Fill.view.game.GameHeaderPresenter;
import be.kdg.Fill.view.game.GameHeaderView;
import be.kdg.Fill.view.game.GamePresenter;
import be.kdg.Fill.view.game.GameView;
import be.kdg.Fill.view.start.StartPresenter;
import be.kdg.Fill.view.start.StartView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Michael Kaethoven
 * @version 1.0 6-2-2018 10:16
 */

public class Main extends Application {

	public static void main(String[] args) {
		launch( args );
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
//		StartView view = new StartView();
		GameView view = new GameView();
		new GamePresenter( view );
		Scene scene = new Scene( view );
		primaryStage.setScene( scene );
		primaryStage.setWidth( 600 );
		primaryStage.setHeight( 600 );
		primaryStage.setResizable( false );
		primaryStage.setTitle( "Fill" );
		primaryStage.show();
	}
}
