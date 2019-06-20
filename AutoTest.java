package auto;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.*;

public class AutoTest {

    Auto car = new Auto("123BCD", "BMW", "sinine", 2010);

    @Test
    public void tootja() {
        String result = car.getBrand();
        String expResult = "BMW";
        assertEquals(expResult, result);
    }

    @Test 
    public void autoVärv() {
        System.out.println(car.getColor());
        assertEquals("sinine", car.getColor());
    }

    @Test
    public void numbrimärk() {
        assertEquals("123BCD", car.getLicensePlate());
    }

    @Test
    public void kiirus(){
        assertThat(car.speed, is(0));
        car.accelerate(10);
        assertThat(car.speed, is(10));
        car.accelerate(20);
        car.brake(5);
        assertThat(car.speed, is(25));
        car.brake(25);
        assertThat(car.speed, is(0));

    }

}