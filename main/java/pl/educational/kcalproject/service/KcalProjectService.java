package pl.educational.kcalproject.service;

import org.springframework.stereotype.Service;
import pl.educational.kcalproject.components.KcalProjectRepository;
import pl.educational.kcalproject.components.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class KcalProjectService {
    private KcalProjectRepository repository;

    public KcalProjectService(KcalProjectRepository repository) {
        this.repository = repository;
    }

    public List<User> makeUser() {
        User user1 = new User(1, "user1", 90.5);
        User user2 = new User(2, "user2", 85 );
        List<User> users = List.of(user1,user2);
        return users;
    }

    public User saveUser() {
        return repository.save(User user);
    }
}
