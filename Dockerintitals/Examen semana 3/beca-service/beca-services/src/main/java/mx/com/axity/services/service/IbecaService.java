package mx.com.axity.services.service;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.model.LoginDO;
import mx.com.axity.model.UserDO;

import java.util.List;

public interface IbecaService {

    int sum(int sum1, int sum2);
    int rest(int rest1, int rest2);
    int mul(int mul1);
    int div(int div1);
    List<UserDO> getAllUsers();
    UserDO userByID(int id);
    void newUser(UserDO userDO);
    void updateUser(UserDO userDO);
    void deleteUserId(int id);
    boolean getLoginExist(int usr);
    boolean validateUserAndPassword(int usr,String pwd);
    boolean newSignUp(LoginDO loginDO);
    void updateLoginpass(LoginDO loginDO);
    void deleteLogin(int usr);
}
