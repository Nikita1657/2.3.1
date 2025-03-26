package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void create(User user);
    void update(User user);
    void delete(Long id);
    User getById(Long id);
    List<User> getAll();
}