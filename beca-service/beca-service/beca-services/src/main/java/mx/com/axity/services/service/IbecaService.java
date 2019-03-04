package mx.com.axity.services.service;

import mx.com.axity.commons.to.UserTO;
import java.util.List;

public interface IbecaService {

    List<UserTO> getUsers();

    int sum(int sum1, int sum2);
    int rest(int rest1, int rest2);
    int mul(int mul1);
    int div(int div1);

}
