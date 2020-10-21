import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void testCase1(){
        assertEquals(0, Fibonacci.getFibonacci(0));
    }

    @Test
    public void testCase2(){
        assertEquals(1, Fibonacci.getFibonacci(1));
    }

    @Test
    public void testCase3(){
        assertEquals(1, Fibonacci.getFibonacci(2));
    }

    @Test
    public void testCase4(){
        assertEquals(5, Fibonacci.getFibonacci(5));
    }
}
