package mx.com.axity.services.service;

import mx.com.axity.commons.aspects.RequestValidatorAspect;
import mx.com.axity.commons.to.UserTO;
import mx.com.axity.model.UserDO;
import mx.com.axity.services.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.constraints.AssertTrue;
import java.util.List;
import java.util.NoSuchElementException;

public class becaServiceTest extends BaseTest {
    static final Logger LOG = LogManager.getLogger(RequestValidatorAspect.class);
    /*@Test
    public void shouldReturnTheSumOfTwoNumbers(){
        int num1 = 5;
        int num2 =10;
        int result=this.becaService.sum(num1,num2);
        Assert.assertEquals(15, result);
    }

    @Test
    public void shouldReturnTheRestOfTwoNumbers(){
        int num1 =10;
        int num2 =5;
        int result=this.becaService.rest(num1,num2);
        Assert.assertEquals(5, result);
    }
    @Test
    public void shouldReturnTheMultiplicationOfTheNumberFourTimes(){
        int num1 =10;
        int result=this.becaService.mul(num1);
        Assert.assertEquals(40, result);
    }
    @Test
    public void shouldReturnTheDisionOfTheNumberBetweenFour(){
        int num1 =20;
        int result=this.becaService.div(num1);
        Assert.assertEquals(5, result);
    }*/
    @Autowired protected IbecaService ibecaService;

    @Test public void updateUser(){
        UserDO userDO=this.ibecaService.userByID(7);
        Assert.assertTrue(userDO!=null);
        Assert.assertTrue(new Long(7).equals(userDO.getId()));
        Assert.assertTrue("User7".equals(userDO.getName()));
    }

    @Test public void shouldNotFound(){
        try{
            UserDO userDO = this.ibecaService.userByID(100);
            //Assert.assertTrue(userDO!=null);
            Assert.assertTrue(new Long(6).equals(userDO.getId()));
            //Assert.assertTrue("User6".equals(userDO.getName()));
        }catch (Throwable e){
            if(e instanceof NoSuchElementException){
                LOG.info("Elemento no encontrado");
                Assert.assertTrue(true);
           }else{
                LOG.info("Error desconocido");
            }

        }

    }
}
