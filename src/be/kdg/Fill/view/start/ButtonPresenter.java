package be.kdg.Fill.view.start;

/**
 * @author Michael Kaethoven
 * @version 1.0 6-2-2018 11:17
 */
public class ButtonPresenter {
	ButtonView view;

	public ButtonPresenter(ButtonView view) {
		this.view = view;
		addEventHandlers();
		updateView();
	}

	private void addEventHandlers() {
		view.getExitBtn().setOnAction( event -> {
			System.out.println("Exit");
			System.exit( 0 );
		} );
	}

	private void updateView() {

	}
}
