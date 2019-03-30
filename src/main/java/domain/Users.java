package domain;

public class Users {
    private String username;
    private String password;
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    /*public boolean valPassword(String password)
    {
        if(password.length() > 7){
            if(checkPass(password)){
                return true;
            } else {
                return false;
            }
        } else {
            System.out.println("Too small characteres!");
            return false;
        }
    }
    public boolean checkPass(String password)
    {
        boolean hasNum = false;
        boolean hasCap = false;
        boolean hasLow = false;
        char c;
        for(int i = 0; i < password.length(); i++){
            c = password.charAt(i);
            if(Character.isDigit(c)){
                hasNum = true;
            }else if(Character.isUpperCase(c)){
                hasCap = true;
            }else if(Character.isLowerCase(c)){
                hasLow = true;
            }
            if(hasNum && hasCap && hasLow){
                return true;
            }
        }
        return false;
    }*/
}