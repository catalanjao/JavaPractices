package mx.com.axity.persistence;

import mx.com.axity.model.UserDO;
import org.springframework.data.repository.CrudRepository;


public interface UserDAO extends CrudRepository<UserDO, Long> {

}
