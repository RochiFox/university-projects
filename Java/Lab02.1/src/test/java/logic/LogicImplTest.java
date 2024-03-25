/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.List;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 *
 * @author Flace
 */
public class LogicImplTest {
    private Logic logic;
    
    @BeforeClass
    public void beforeClass() {
        logic = new LogicImpl();
    }
    
    @BeforeMethod
    public void beforeMethod() {
        logic.add(new Apple("Антонівка", 25));
        logic.add(new Apple("Кортланд", 45));
        logic.add(new Apple("Семеренка", 37));
    }
    
    @AfterMethod
    public void AfterMethod() {
        logic = new LogicImpl();
    }
    
    @Test
    public void checkCount() {
        Assert.assertEquals(logic.getAll().size(), 3);
    }
    
    @Test 
    public void checkAllPriceMore() {
        List <Apple> list = logic.getAllPriceMore(41);
        
        SoftAssert asert = new SoftAssert();
        asert.assertEquals(list.size(), 1);
        asert.assertEquals(list.get(0).getName(), "Кортланд");
        asert.assertAll();
    }
    
    @Test
    public void testGetAllPriceLess() {
        List<Apple> list = logic.getAllPriceLess(40);

        Assert.assertEquals(list.size(), 2);
        Assert.assertEquals(list.get(0).getName(), "Антонівка");
        Assert.assertEquals(list.get(1).getName(), "Семеренка");
}


    @Test
    public void testGetByNumber() {
        Apple apple = logic.getByNumber(1);

        Assert.assertNotNull(apple);
        Assert.assertEquals(apple.getName(), "Кортланд");
        Assert.assertEquals(apple.getPrice(), 45);
    }
    
    @Test
    public void testRemoveAll() {
        logic.removeAll();

        List<Apple> list = logic.getAll();

        Assert.assertTrue(list.isEmpty());
    }
}
