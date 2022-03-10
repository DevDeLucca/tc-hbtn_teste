
public class Person {

    public boolean checkUser(String user){
        return !user.contains("!@#$%&*") && user.length() >= 8;
    }

    public boolean checkPassword(String password){
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
        return password.matches(regex);
    }
}