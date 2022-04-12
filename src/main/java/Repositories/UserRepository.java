package Repositories;

import Classes.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUserID(Long userID);

    User findByName(String name);

}
