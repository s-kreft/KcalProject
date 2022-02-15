package pl.educational.kcalproject.components;

import org.springframework.data.jpa.repository.JpaRepository;

public interface KcalProjectRepository extends JpaRepository<User, Integer> {
}
