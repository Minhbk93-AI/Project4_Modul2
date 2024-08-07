package exercise03;
import java.time.Instant;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch()
    {
        startTime = System.currentTimeMillis();
    }

    public void start()
    {
        startTime = System.currentTimeMillis();
    }

    public void stop()
    {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime()
    {
        System.out.println("startTime = "+ startTime);
        System.out.println("endTime = "+ endTime);

        return endTime - startTime;
    }

}

