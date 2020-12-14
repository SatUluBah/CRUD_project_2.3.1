//package group.users.dao;
//
//import group.users.model.User;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import java.util.List;
//
//
//@Repository
//public class UserDaoImpl implements UserDao {
//    private SessionFactory sessionFactory;
//
//    @Autowired
//    public void setSessionFactory(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }
//
//    @Override
//    @SuppressWarnings("unchecked")
//    public List<User> allUsers() {
//        Session session = sessionFactory.getCurrentSession();
//        return session.createQuery("from User").list();
//    }
//
//
//    @Override
//    public void add(User user) {
//        Session session = sessionFactory.getCurrentSession();
//        session.persist(user);
//    }
//
//    @Override
//    public void delete(User user) {
//        Session session = sessionFactory.getCurrentSession();
//        session.delete(user);
//    }
//
//    @Override
//    public void edit(User user) {
//        Session session = sessionFactory.getCurrentSession();
//        session.update(user);
//    }
//
//    @Override
//    public User getById(Integer id) {
//        Session session = sessionFactory.getCurrentSession();
//        return session.get(User.class, id);
//    }
//
//}
