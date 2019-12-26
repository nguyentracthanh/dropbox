package vn.edu.usth.dropbox.model.request;

public class User {
    private String first_name;
    private String password;
    private String last_name;
    private String email;

    public User(String first_name, String password, String last_name, String email) {
        this.first_name = first_name;
        this.password = password;
        this.last_name = last_name;
        this.email = email;
    }

    public User(String password, String email) {
        this.password = password;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "first_name='" + first_name + '\'' +
                ", password='" + password + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User() {
    }


}
