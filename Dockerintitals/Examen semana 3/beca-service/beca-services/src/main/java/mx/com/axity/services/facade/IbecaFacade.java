package mx.com.axity.services.facade;

import mx.com.axity.commons.to.LoginTO;
import mx.com.axity.commons.to.UserTO;
import mx.com.axity.model.LoginDO;

import java.util.List;

public interface IbecaFacade {

    int operation(int num1, int sum2);
    List<UserTO> getAllUsers();
    UserTO getUserId(int id);
    void newUser(UserTO user);
    void updateUser(UserTO user);
    void deleteUserId(int id);
    boolean isUsrAndPwdCorrect(int usr,String pwd);
    boolean newSignUp(LoginTO login);
}
