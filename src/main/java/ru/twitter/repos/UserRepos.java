package ru.twitter.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.twitter.domain.User;

public interface UserRepos extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
