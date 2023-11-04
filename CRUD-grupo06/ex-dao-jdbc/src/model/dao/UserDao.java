package model.dao;

import model.entities.User;

import java.util.List;

public interface UserDao {

    int insert(User obj);
    void update(User obj);
    void deleteById(Integer id);
    User findById(Integer id);
    List<User> findAll();

}
