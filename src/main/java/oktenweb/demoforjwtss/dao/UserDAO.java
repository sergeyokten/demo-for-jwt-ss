package oktenweb.demoforjwtss.dao;

import oktenweb.demoforjwtss.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
