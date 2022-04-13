package Repositories;

import Classes.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    static User findByID(Long userID);

    User findByName(String name);

}
