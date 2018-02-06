package be.kdg.Fill.view.start;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


/**
 * @author Michael Kaethoven
 * @version 1.0 6-2-2018 10:49
 */
public class StartView extends BorderPane {
	//Buttons for startscreen
	private ButtonView buttonView;


	//Labels for startscreen
	private Label welcomeLbl;
	private Label crLbl; //copyright label


	public StartView() {
		initialiseNodes();
		layoutNodes();
	}

	private void initialiseNodes() {
		this.buttonView = new ButtonView();
		this.welcomeLbl = new Label( "Welcome to Fill!" );
		this.crLbl = new Label( "Made by Niels de Coninck \n& Michael Kaethoven" );
	}

	private void layoutNodes() {
		super.setTop( welcomeLbl );
		BorderPane.setAlignment( welcomeLbl, Pos.CENTER );
		BorderPane.setMargin( welcomeLbl, new Insets( 20 ) );
		super.setBottom( crLbl );
		BorderPane.setAlignment( crLbl, Pos.BOTTOM_RIGHT );
		BorderPane.setMargin( crLbl, new Insets( 10 ) );
		super.setCenter( buttonView );
	}

	ButtonView getButtonView() {
		return buttonView;
	}
}
