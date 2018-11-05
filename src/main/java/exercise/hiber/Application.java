package exercise.hiber;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Application {

    public static void main(String[] args) {

        Configuration configuration=new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory factory=configuration.buildSessionFactory();
        Session session=factory.openSession();
        Transaction transaction=session.beginTransaction();

        User user1=new User();
        user1.setName("Mike");
        session.save(user1);

        User user2=new User();
        user2.setName("Joanne");
        session.save(user2);

        User user3=new User();
        user3.setName("John");
        session.save(user3);

        City city1=new City();
        city1.setName("Cleveland");
        city1.getUsers().add(user1);
        city1.getUsers().add(user2);
        session.save(city1);

        City city2=new City();
        city2.setName("Birmingham");
        city2.getUsers().add(user3);
        session.save(city2);

        transaction.commit();
        session.close();
        System.out.println("SUCCESSFULLY");
    }
}
