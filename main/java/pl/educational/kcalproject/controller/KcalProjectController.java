package pl.educational.kcalproject.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.educational.kcalproject.service.KcalProjectService;

@RestController
@RequestMapping("/kcal")
public class KcalProjectController {
    KcalProjectService kcalProjectService;

    public KcalProjectController(KcalProjectService kcalProjectService) {
        this.kcalProjectService = kcalProjectService;
    }
    @GetMapping("/user")
    public ResponseEntity<User> getUser() {
        return ResponseEntity.ok(kcalProjectService.getUser());
    }
}
