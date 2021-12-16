package entity;

public class User {
    private String userName;

    public User(String userName, String errorMessage) {
        this.userName = userName;
        this.errorMessage = errorMessage;
    }

    private String errorMessage;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
