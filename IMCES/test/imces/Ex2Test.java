/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imces;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Owner
 */
public class Ex2Test {
    
    public Ex2Test() {
    }

    @Test
    public void testSomeMethod() {
        
        Ex2 ex = new Ex2();
        double altura ;
        double peso ;
        peso = ex.peso ;
        altura = ex.altura ; 
        Assert.assertEquals(ex.altura, altura);
        Assert.assertEquals(ex.peso, peso);
        Assert.assertEquals(ex.Calculo(), 200.00 , 0);
    }
    
}
