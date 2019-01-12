package service;

import entity.User;
import org.junit.Assert;
import org.junit.Test;
import services.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 2019-01-06.
 */
public class UserServiceTest {

    @Test
    public void testGetAllUsers(){
        List<User> users = new ArrayList<User>();
        users.add(new User((long) 11, "admin", "admin"));
        users.add(new User((long) 21, "pablo", "admin"));

        UserServiceImpl userService = new UserServiceImpl(users);
        List<User> usersFromTestClass = userService.getAllUsers();
        Assert.assertEquals(users, usersFromTestClass);
    }

    @Test
    public void testAddUser(){
        //is
        List<User> users = new ArrayList<User>();
        User user = new User(1l, "admin", "admin");
        users.add(user);
        //then
        UserServiceImpl userService = new UserServiceImpl();
        userService.addUser(user);
        List<User> usersFromTestClass = userService.getAllUsers();
        //expected
        Assert.assertEquals(users, usersFromTestClass);
    }

    @Test
    public void testRemoveUser(){
        List<User> users = new ArrayList<User>();
        User admin = new User(1l, "admin2", "qwerty");
        User pablo = new User(2l, "pablo", "admin");
        users.add(admin);
        users.add(pablo);

        UserServiceImpl userService = new UserServiceImpl();
        userService.addUser(admin);
        userService.addUser(pablo);
        userService.removeUserById(1l);
        users.remove(admin);
        List<User> usersFromTestClass = userService.getAllUsers();

        Assert.assertEquals(users, usersFromTestClass);


    }

}
