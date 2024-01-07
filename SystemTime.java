import java.time.LocalTime;

public class SystemTime {
    public static void main(String[] args) {
        // Get the current system time
        LocalTime currentTime = LocalTime.now();

        // Display the current system time
        System.out.println("Current System Time: " + currentTime);
    }
}
