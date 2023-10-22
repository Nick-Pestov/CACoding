package interface_adapter.clear_users;

import interface_adapter.logged_in.LoggedInState;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;
import use_case.login.LoginOutputData;

public class ClearPresenter implements ClearOutputBoundary {

    @Override
    public void prepareSuccessView(ClearOutputData response) {
    }
}
