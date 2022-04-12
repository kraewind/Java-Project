package Classes;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    String name;

    @Id
    Long ID;

    String Password;
}
