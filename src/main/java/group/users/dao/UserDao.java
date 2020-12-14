package group.users.dao;

import group.users.model.User;

import java.util.List;

public interface UserDao {
    List<User> allUsers();

    void add(User user);

    void delete(User user);

    void edit(User user);

    User getById(Integer id);


}