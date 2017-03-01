package in.co.india.odisha.learnjava.dominos.model;

/*
 * Created by personal on 22-02-2017.
 */
public class Confirmation {
    String userName;
    String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    boolean isSuccess(){
        return true;
    }

}
