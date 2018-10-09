package com.eriks.proteintracker;

import com.eriks.entity.User;
import org.hibernate.Session;

public class Program {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Session session = HibernateUtilities.getSessionFactory().openSession();
        session.beginTransaction();

        User user = new User();
        user.setName("James Calder");
        user.setGoal(1337);
        session.save(user);

        session.getTransaction().commit();
        
        
        session.beginTransaction();
        
        User loadedUser = (User) session.load(User.class, 1);
        System.out.println(loadedUser.toString());
        
        loadedUser.setGoal(loadedUser.getGoal() + 50);
        
        session.getTransaction().commit();
        session.close();
        
        
        
        HibernateUtilities.getSessionFactory().close();
    }
}
