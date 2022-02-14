package pl.educational.kcalproject.service;

import org.springframework.stereotype.Service;
import pl.educational.kcalproject.components.User;

import java.util.List;

@Service
public class KcalProjectService {
    private List<User> db;


    public void makeUser() {
        User user1 = new User(1, "user1", 90.5);
        db.add(user1);
    }

    public User getUser() {
        return db;
    }
}
