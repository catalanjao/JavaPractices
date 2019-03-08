package mx.com.axity.web.rest;

import io.swagger.annotations.Api;
import mx.com.axity.commons.to.LoginTO;
import mx.com.axity.commons.to.UserTO;
import mx.com.axity.model.UserDO;
import mx.com.axity.services.facade.IbecaFacade;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.AbstractList;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
@RestController
@RequestMapping("beca")
@Api(value="beca", description="Operaciones con beca")
public class HelloController {

    static final Logger LOG = LogManager.getLogger(HelloController.class);

    //@Autowired
    //RestTemplate restTemplate;

    @Autowired
    IbecaFacade IbecaFacade;

    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<UserTO>> getAllUsers() {
        LOG.info("Se invoca /users");
        List<UserTO> users = this.IbecaFacade.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getUserId(@RequestParam (value = "id") int id) {
        LOG.info("Se invoca /userid");
        UserTO userid = this.IbecaFacade.getUserId(id);
        return new ResponseEntity<>(userid,HttpStatus.OK);
    }

    @RequestMapping(value = "/user", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity<UserTO> deleteUserId(@RequestParam (value = "id") int id) {
        LOG.info("Se invoca /userid");
        this.IbecaFacade.deleteUserId(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity saveUser(@RequestBody UserTO userTO) {

        LOG.info("User");
        LOG.info(userTO.getId());
        LOG.info(userTO.getName());
        LOG.info(userTO.getLastName());
        LOG.info(userTO.getAge());
        LOG.info("Se invoca /users para el guardado");
        this.IbecaFacade.newUser(userTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT, produces = "application/json")
    public ResponseEntity updateUser(@RequestBody UserTO userTO) {

        LOG.info("User");
        LOG.info(userTO.getId());
        LOG.info(userTO.getName());
        LOG.info(userTO.getLastName());
        LOG.info(userTO.getAge());
        LOG.info("Se invoca /users para el update");
        this.IbecaFacade.updateUser(userTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/users1", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity finduser(@RequestParam(value = "id") int id) {
        LOG.info("user");
        LOG.info(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity test() {
        LOG.info("Se invoca /test");
        return new ResponseEntity<>("Prueba Ok", HttpStatus.OK);
    }

    @RequestMapping(value = "/operation", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity operation() {
        LOG.info("Se invoca /operation");
        int resutl = this.IbecaFacade.operation(5,10);
        return new ResponseEntity<>(resutl, HttpStatus.OK);
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity login(@RequestParam(value = "usr") int usr,@RequestParam(value = "pwd") String pwd) {
        LOG.info("user");
        LOG.info(usr);
        boolean login = this.IbecaFacade.isUsrAndPwdCorrect(usr,pwd);
        if(login){
            return new ResponseEntity<>(HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }

    }

    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity saveLogin(@RequestBody LoginTO loginTO) {

        LOG.info("Login");
        LOG.info(loginTO.getUsr());
        LOG.info(loginTO.getPwd());
        LOG.info("Se invoca /login para el guardado");
        if(this.IbecaFacade.newSignUp(loginTO)){
            return new ResponseEntity<>(HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "/login", method = RequestMethod.PUT, produces = "application/json")
    public ResponseEntity updateLogin(@RequestBody LoginTO loginTO) {
        LOG.info("Login");
        LOG.info(loginTO.getUsr());
        LOG.info(loginTO.getPwd());
        LOG.info("Se invoca /login para el update");
        this.IbecaFacade.updateLoginPwd(loginTO);
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(value = "/login", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity deleteLoginId(@RequestParam (value = "usr") int usr) {
        LOG.info("Se invoca /login delete");
        this.IbecaFacade.deleteLogin(usr);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
