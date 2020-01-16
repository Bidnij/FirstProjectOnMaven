import org.junit.Test;


import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;


public class FibanachiNumberTest {
    FibanachiNumber fibanachiNumber = new FibanachiNumber();


    @Test
    public void testFibanachiLength() {
        assertTrue(fibanachiNumber.masFibanachi.length < 5); //проверка длины массива позитивный кейс
        assertFalse(fibanachiNumber.masFibanachi.length > 5);//Проверка длинны массива негативный кейс
    }

    @Test
    public void testFirstNumbFibanachi() {
        assertTrue(fibanachiNumber.masFibanachi[0] < 1); //проверка первого элемента массива позитивный кейс
        assertFalse(fibanachiNumber.masFibanachi[3] < 1); //проверка первого элемента массива негативный кейс
    }

    @Test
    public void testEqualsNumbFibanaci() {
        assertEquals(0, fibanachiNumber.masFibanachi[0]); //проверка первого элемента массива позитивный кейс
        assertNotEquals(1, fibanachiNumber.masFibanachi[0]); ////проверка первого элемента массива негативный кейс
        assertArrayEquals(new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987}, fibanachiNumber.masFibanachi);
    }

    @Test
    public void testNumbFibaciMas() {
        assertThat(fibanachiNumber.masFibanachi[2], is(1));
        assertThat(fibanachiNumber.masFibanachi[1], is(not(2)));
    }

    @Test
    public void testAllNumb() {
        for (int i = 2; i < fibanachiNumber.masFibanachi.length; i++) {
            assertThat(fibanachiNumber.masFibanachi[i], is(fibanachiNumber.masFibanachi[i - 1] + fibanachiNumber.masFibanachi[i - 2]));
        }
    }

}
