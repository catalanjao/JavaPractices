package mx.com.axity.services.service.impl;

import mx.com.axity.model.UserDO;
import mx.com.axity.model.UserDOpwd;
import mx.com.axity.persistence.UserDAO;
import mx.com.axity.persistence.UserpwdDAO;
import mx.com.axity.services.service.IbecaService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IbecaServiceImpl implements IbecaService {

    static final Logger LOG = LogManager.getLogger(IbecaServiceImpl.class);

    @Autowired
    UserDAO userDAO;

    @Autowired
    UserpwdDAO userpwdDAO;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public int sum(int sum1, int sum2) {
        return sum1+sum2;
    }
    @Override
    public int rest(int rest1, int rest2) {
        return rest1-rest2;
    }
    @Override
    public int mul(int mul1) {
        return mul1*4;
    }
    @Override
    public int div(int div1) {
        return div1/4;
    }
    @Override
    public List<UserDO> getAllUsers() {
        return (List<UserDO>) this.userDAO.findAll();
    }
    @Override
    public UserDO userByID(int id) {
        /*if(this.userDAO.existsById((long) id)){
            return this.userDAO.findById((long) id).get();
        }
        return new UserDO("notfound","",0);*/
        return this.userDAO.findById((long) id).get();
    }
    @Override
    public void newUser(UserDO userDO) {
        this.userDAO.save(userDO);
    }
    @Override
    public void updateUser(UserDO userDO) {
        this.userDAO.findById(userDO.getId()).get();
        this.userDAO.save(userDO);
    }
    @Override
    public void deleteUserId(int id) {
        this.userDAO.deleteById((long) id);
    }

    @Override
    public UserDOpwd userpwdByID(int id) {
        this.userpwdDAO.findById((long) id).get();
        return null;
    }

    @Override
    public void newUserpwd(UserDOpwd userDOpwd) {

    }
    @Override
    public void updateUserpwd(UserDOpwd userDOpwd) {

    }

    @Override
    public void deleteUserpwdId(int id) {

    }

}
