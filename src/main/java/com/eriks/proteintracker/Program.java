package com.eriks.proteintracker;

import com.eriks.entity.User;
import com.eriks.entity.UserHistory;
import java.util.Date;
import java.util.Map.Entry;
import org.hibernate.Session;

public class Program {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Session session = HibernateUtilities.getSessionFactory().openSession();
        session.beginTransaction();

        User user = new User();
        user.setName("James Calder");
        user.getHistory().put("GL123",new UserHistory(new Date(), "Set name to James Calder"));
        user.getProteinData().setGoal(1337);
        user.getHistory().put("GL124",new UserHistory(new Date(), "Set the goal to 250"));
        session.save(user);

        session.getTransaction().commit();
        
        
        session.beginTransaction();
        
        User loadedUser = (User) session.load(User.class, 1);
        System.out.println(loadedUser.toString());
        for(Entry<String, UserHistory> history : loadedUser.getHistory().entrySet()){
            System.out.println("Key value: " + history.getKey());
             System.out.println(history.getValue().getEntryTime().toString() + " " + history.getValue().getEntry());
        }
        
        loadedUser.getProteinData().setTotal(loadedUser.getProteinData().getTotal() + 50);
        loadedUser.getHistory().put("GL125", new UserHistory(new Date(), "Added 50 protein"));
        
        session.getTransaction().commit();
        session.close();
        
        
        
        HibernateUtilities.getSessionFactory().close();
    }
}
