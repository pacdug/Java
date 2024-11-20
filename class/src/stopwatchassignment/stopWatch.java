package stopwatchassignment;

public class stopWatch {
    private long startTime;
    private long stopTime;

    public stopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getStopTime() {
        return stopTime;
    }

    public void Start() {
        this.startTime = System.currentTimeMillis();
    }

    public void Stop() {
        this.stopTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return stopTime - startTime;
    }
}
