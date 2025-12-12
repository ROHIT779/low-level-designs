package component;

public class User {
    private long userID;

    public User(long id){
        this.userID = id;
    }

    public long getUserID(){
        return this.userID;
    }
}
