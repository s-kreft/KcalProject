package pl.educational.kcalproject.service;

import org.springframework.stereotype.Service;
import pl.educational.kcalproject.components.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class KcalProjectService {
    private List<User> db = new ArrayList<>();


    public void makeUser() {
        User user1 = new User(1, "user1", 90.5);
        db.add(user1);
    }

    public List<User> getUser() {
        makeUser();
        return db;
    }
}
