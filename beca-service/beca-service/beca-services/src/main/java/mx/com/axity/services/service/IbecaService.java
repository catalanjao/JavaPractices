package mx.com.axity.services.service;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.model.UserDO;
import mx.com.axity.model.UserDOpwd;

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
    UserDOpwd userpwdByID(int id);
    void newUserpwd(UserDOpwd userDOpwd);
    void updateUserpwd(UserDOpwd userDOpwd);
    void deleteUserpwdId(int id);

}
