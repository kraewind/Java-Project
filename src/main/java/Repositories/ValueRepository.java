package Repositories;

import Classes.Value;
import org.springframework.data.repository.CrudRepository;

public interface ValueRepository extends CrudRepository<User, Long> {

    User findByUserID(Long userID);

    User findByName(String name);

}
