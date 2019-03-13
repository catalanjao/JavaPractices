package mx.com.axity.persistence;

import com.sun.xml.internal.bind.v2.model.core.ID;
import mx.com.axity.model.LoginDO;
import mx.com.axity.model.UserDO;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public interface FullDAO extends CrudRepository<LoginDO, Long> {
    Optional<UserDO> findById(ID var1);
}
