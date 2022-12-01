package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    public List<User>index();
    public User show(int id);
    public void save(User user);
    public void update(int id, User userUpdated);
    public void delete(int id);
}