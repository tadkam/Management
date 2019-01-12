package api;

import entity.User;

import java.util.List;

/**
 * Created by Admin on 2019-01-06.
 */
public interface UserService {
    List<User> getAllUsers();
    void addUser(User user);
    void removeUserById(Long userId);
}
