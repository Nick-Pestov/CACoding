package interface_adapter.clear_users;

import interface_adapter.logged_in.LoggedInState;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;
import use_case.login.LoginOutputData;

import javax.swing.*;

public class ClearPresenter implements ClearOutputBoundary {

    @Override
    public void prepareSuccessView(ClearOutputData response) {
        JOptionPane.showMessageDialog(null, "Cleared users: " + response.getUsersCleared());
    }

}
