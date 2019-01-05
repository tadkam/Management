package entity;
/**
 * Created by Admin on 2019-01-05.
 */
public class User {
    private Long id;
    private String login;
    private String password;


    public User(Long id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + this.id +
                ", login='" + this.login +'\''+
                ", password='" + password + '\''+
                '}';
    }



}
