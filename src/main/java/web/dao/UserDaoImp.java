package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> index() {
        return entityManager.createQuery("SELECT users FROM User users", User.class).getResultList();
    }

    @Override
    public User show(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public void update(int id, User userUpdated) {
        User updated = entityManager.find(User.class, id);
        updated.setId(userUpdated.getId());
        updated.setName(userUpdated.getName());
        updated.setSurname(userUpdated.getSurname());
        entityManager.merge(updated);

    }

    @Override
    public void delete(int id) {
        entityManager.remove(show(id)); //?
    }
}