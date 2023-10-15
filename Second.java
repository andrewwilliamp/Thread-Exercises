public class Second extends Thread {
    @Override
    public void run() {
        int seconds = 1;
        while(true) {
            System.out.println("Seconds: " + seconds);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            seconds++;
        }
    }
}
