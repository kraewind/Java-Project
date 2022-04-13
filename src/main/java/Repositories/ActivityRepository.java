package Repositories;

import Classes.Activity;
import org.springframework.data.repository.CrudRepository;

public interface ActivityRepository extends CrudRepository<Activity, Long> {

    Activity findByActivityID(Long activityID);

    Activity findByDescription(String description);

}
