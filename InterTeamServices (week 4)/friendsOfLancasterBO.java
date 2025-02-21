public interface friendsOfLancasterBO {
    //Fetches a record of all "Friends of Lancaster" subscriber accounts.
    ArrayList<FriendAccount> getFriendAccounts();

    //Creates a new "Friends of Lancaster" account.
    FriendAccount createAccount(String accountID);
}

public class FriendAccount {
    private String accountID;

    // Constructor
    public FriendAccount(String accountID) {
        this.accountID = accountID;
    }

    // Getter
    public String getAccountID() {
        return accountID;
    }

    // Setter
    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    @Override
    public String toString() {
        return "FriendAccount{" +
                "accountID='" + accountID + '\'' +
                '}';
    }
}