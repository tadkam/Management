package services;

import entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 2019-01-12.
 */
public class UserServiceImpl {
    private List<User> users;

    public UserServiceImpl(){
        this.users = new ArrayList<User>();
    }

    public UserServiceImpl(List<User> users){
        this.users = users;
    }

    public List<User> getAllUsers(){
        return this.users;
    }

    public void addUser(User user){
        users.add(user);
    }

    public void removeUserById(Long id){
        for (int i=0; i< users.size(); i++){
            Long userId = users.get(i).getId();
            if(userId == id){
                users.remove(i);
                break;
            }
        }
    }


}
