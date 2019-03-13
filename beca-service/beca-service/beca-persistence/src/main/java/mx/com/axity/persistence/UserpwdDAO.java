package mx.com.axity.persistence;

import mx.com.axity.model.UserDOpwd;
import org.springframework.data.repository.CrudRepository;

public interface UserpwdDAO extends CrudRepository<UserDOpwd, Long> {
}
