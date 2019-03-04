package mx.com.axity.services.facade.impl;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.services.facade.IbecaFacade;
import mx.com.axity.services.service.IbecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class becaFacade implements IbecaFacade {

    @Autowired
    private IbecaService becaService;

    public List<UserTO> getAllUsers() {
        return this.becaService.getUsers();
    }

    @Override
    public int operation(int a, int b) {
        int c = becaService.sum(a,b);
        b = becaService.rest(c,a);
        int d = becaService.mul(b);
        return becaService.div(d);
    }
}
