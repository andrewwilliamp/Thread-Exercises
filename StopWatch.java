public class StopWatch {
    public static void main(String[] args) {
        Minute minuteThread = new Minute();
        Second secondThread = new Second();

        minuteThread.start();
        secondThread.start();
    }
}
