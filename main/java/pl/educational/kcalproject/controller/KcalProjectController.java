package pl.educational.kcalproject.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.educational.kcalproject.components.User;
import pl.educational.kcalproject.service.KcalProjectService;

import java.util.List;

@RestController
@RequestMapping("/kcal")
public class KcalProjectController {
    KcalProjectService kcalProjectService;

    public KcalProjectController(KcalProjectService kcalProjectService) {
        this.kcalProjectService = kcalProjectService;
    }
    @GetMapping("/user")
    public ResponseEntity<List<User>> getUser() {
        return ResponseEntity.ok(kcalProjectService.getUser());
    }

}
