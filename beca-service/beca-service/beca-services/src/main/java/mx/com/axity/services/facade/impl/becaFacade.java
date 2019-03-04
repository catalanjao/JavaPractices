package mx.com.axity.services.facade.impl;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.model.UserDO;
import mx.com.axity.services.facade.IbecaFacade;
import mx.com.axity.services.service.IbecaService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Component
public class becaFacade implements IbecaFacade {

    @Autowired
    private IbecaService becaService;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public int operation(int a, int b) {
        int c = becaService.sum(a,b);
        b = becaService.rest(c,a);
        int d = becaService.mul(b);
        return becaService.div(d);
    }

    @Override
    public List<UserTO> getAllUsers() {
        List<UserDO> userDoList = this.becaService.getAllUsers();

        Type userTOType = new TypeToken<List<UserTO>>() {}.getType();
        List<UserTO> result = this.modelMapper.map(userDoList, userTOType);

        return result;
    }

    @Override
    public void newuser(UserTO user) {
        Type userDOType = new TypeToken<UserDO>() {}.getType();
        UserDO result = this.modelMapper.map(user,userDOType);
        this.becaService.newuser(result);

    }

}
