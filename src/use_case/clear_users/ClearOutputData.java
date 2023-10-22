package use_case.clear_users;

// TODO Complete me

public class ClearOutputData {

	final String[] usersCleared;

	public ClearOutputData(String[] usersCleared) {
		this.usersCleared = usersCleared;
	}

	public String getUsersCleared() {
		return String.join("\n", usersCleared);
	}

}
