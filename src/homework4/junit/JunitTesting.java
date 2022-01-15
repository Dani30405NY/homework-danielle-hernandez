package homework4.junit;
import org.junit.Assert;
import org.junit.Test;

public class JunitTesting {


    @Test
    public void math1() {
        int a = 11;
        int b = 12;
        int actualTotal;
        int expectedTotal = 24;
        actualTotal = a + b
        assertEquals(expectedTotal, actualTotal);
        System.out.println("pass!");


    }

    @Test
    public void math2() {

        int a = 11;
        int b = 12;

        int actualTotal;
        int expectedTotal = 1;

        actualTotal = b - a;
        Assert.assertEquals(expectedTotal, actualTotal);
        System.out.println("pass!");
    }


    @Test
    public void math3() {

        int a = 4;
        int b = 8;

        int actualTotal;
        int expectedTotal = 12;

        actualTotal = a + b;
        Assert.assertEquals(expectedTotal, actualTotal);
        System.out.println("pass!");
    }

    @Test
    public void math4() {

        int a = 4;
        int b = 8;

        int actualTotal;
        int expectedTotal = 4;

        actualTotal = b - a;
        Assert.assertEquals(expectedTotal, actualTotal);
        System.out.println("pass!");
    }

    @Test
    public void math5() {

        int a = 4;
        int b = 8;

        int actualTotal;
        int expectedTotal = 2;

        actualTotal = b - a;
        Assert.assertEquals(expectedTotal, actualTotal);
        System.out.println("pass!");
    }

    @Test
    public void math6() {

        int a = 4;
        int b = 8;

        int actualTotal;
        int expectedTotal = 7;

        actualTotal = b - a;
        Assert.assertEquals(expectedTotal, actualTotal);
        System.out.println("pass!");
    }

    @Test
    public void assert7() {
        Assertions.assertEquals(expected 1, actual 1);
    }

    @Test
    public void assert8() {
        Assertions.assertEquals(expected 1, actual 3);

    }

    @Test
    public void assert9() {
        Assertions.assertEquals(expected 7, actual 7);
    }

    @Test
    public void assert10() {
        Assertions.assertEquals(expected 7, actual 10);
    }
}





