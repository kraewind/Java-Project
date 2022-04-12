package Classes;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Value {

    String name;

    @Id
    Long ID;
}
