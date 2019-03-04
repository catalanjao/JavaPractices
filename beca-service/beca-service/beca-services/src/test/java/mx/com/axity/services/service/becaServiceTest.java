package mx.com.axity.services.service;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.services.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class becaServiceTest extends BaseTest {

    @Test
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
    }
}
