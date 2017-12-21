package dinndr;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserProfileRepo extends CrudRepository<UserProfile, Long> {

}