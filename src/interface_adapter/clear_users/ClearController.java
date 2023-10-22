package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;
import use_case.clear_users.ClearInputData;

public class ClearController {

	final ClearInputBoundary clearUseCaseInteractor;

	public ClearController(ClearInputBoundary clearUseCaseInteractor) {
		this.clearUseCaseInteractor = clearUseCaseInteractor;
	}

	public void execute(ClearInputData clearInputData) {
		this.clearUseCaseInteractor.execute(clearInputData);
	}

}
