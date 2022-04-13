package Controllers;

import Classes.User;
import Repositories.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

public class UserController {

    @GetMapping("/users/{id}")
    public Optional<User> getUserByID(@PathVariable(value = "id") Long ID){
        return Optional.ofNullable(UserRepository.findByID(ID));
    }

}
