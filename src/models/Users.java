package models;

public class Users {

    public int userID;
    public String userName;
    public String userPassword;


    public Users() {
        this.userID = userID;
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public Users(int userID, String userName, String userPassword) {

    }

    /**
     * @return userID
     */
    public int getUserID() {

        return userID;
    }

    /**
     * @return userName
     */
    public String getUserName() {

        return userName;
    }

    /**
     * @return userPassword
     */
    public String getUserPassword() {

        return userPassword;
    }
}