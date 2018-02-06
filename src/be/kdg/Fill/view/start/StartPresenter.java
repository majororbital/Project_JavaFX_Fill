package be.kdg.Fill.view.start;

/**
 * @author Michael Kaethoven
 * @version 1.0 6-2-2018 11:39
 */
public class StartPresenter {
	private StartView startView;

	public StartPresenter(StartView startView) {
		this.startView = startView;
		new ButtonPresenter( startView.getButtonView());
	}
}
