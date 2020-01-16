import org.joda.time.LocalTime;

public class GettingCurrentTime {
    LocalTime currentTime = new LocalTime();

    public void getcurrentTime () {
        System.out.println("The current local time is: " + currentTime);
    }

    public String getcurrentTimeString(){
        return String.valueOf(currentTime);
    }

}
