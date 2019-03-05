package mx.com.axity.services.facade;

import mx.com.axity.commons.to.UserTO;

import java.util.List;

public interface IbecaFacade {

    int operation(int num1, int sum2);
    List<UserTO> getAllUsers();
    UserTO getUserId(int id);
    void newUser(UserTO user);
    void deleteUserId(int id);
}
