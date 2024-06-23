package ec.edu.ups.tdd.calculator;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator = null;

    @BeforeClass
    public static void setupClass(){
        System.out.println("setUpClass()");
    }
    @Before
    public void setUp(){
        calculator = new Calculator();
        System.out.println("setUp()");
    }
    @Test
    public void givenTwoIntegersWhenAdditionThenOk(){
        System.out.println("Test 1");
        assertEquals(6, calculator.addition(4,2));
    }
    @Test
    public void givenTwoIntegersWhenSubstractionThenOk(){
        System.out.println("Test 2");
        assertEquals(2, calculator.substraction(4,2));
    }
    @Test(expected = ArithmeticException.class)
    public void givenTwoIntegersWhenDivisionThenException(){
        System.out.println("Test 3");
        assertEquals(3, calculator.division(6, 0));
    }
    @Test(timeout = 150)
    public void givenTwoIntegersWhwnMultiplicationThenTimeout(){
        System.out.println("Test 4");
        assertEquals(8, calculator.multiplication(4, 2));
    }

    @After
    public void tearDown(){
        System.out.println("tearDown()");
        calculator.setAns(0);
    }

    @AfterClass
    public static void tearDownClass(){
        System.out.println("tearDownClass()");
    }
}