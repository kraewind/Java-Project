package Classes;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Activity {
    String name;

    @Id
    Long ID;

    String Description;

}
