import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;


public class GreeterTest {
    private Greeter greeter = new Greeter();
    private GettingCurrentTime gettingCurrentTime = new GettingCurrentTime();

    @Test
    public void greeterSaysHello() {

        assertThat("is not equals", greeter.sayHello(), containsString("Hello"));
    }

    @Test
    public void gettingCurrentTime() {
        gettingCurrentTime.getcurrentTime();
        gettingCurrentTime.getcurrentTimeString();
    }

    // mvn test
    // mnn test site
    // mvn clean test site
}
