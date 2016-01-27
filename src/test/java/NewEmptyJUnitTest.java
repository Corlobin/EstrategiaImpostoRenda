/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.exercicio4.cdp.ImpostoRenda;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ricardo
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testaImposto1() {
        ImpostoRenda imposto = new ImpostoRenda();
        double imp = imposto.calculaImposto(2000, 0);
        Assert.assertEquals(imp, 300);        
    }
    @Test
    public void testaImposto2() {
        ImpostoRenda imposto = new ImpostoRenda();
        double imp = imposto.calculaImposto(4000, 0);
        Assert.assertEquals(imp, 600);        
    }
    @Test
    public void testaImposto3() {
        ImpostoRenda imposto = new ImpostoRenda();
        double imp = imposto.calculaImposto(6000, 0);
        Assert.assertEquals(imp, 900);        
    }
    @Test
    public void testaImposto4() {
        ImpostoRenda imposto = new ImpostoRenda();
        double imp = imposto.calculaImposto(8000, 0);
        Assert.assertEquals(imp, 1200);        
    }
    
}
