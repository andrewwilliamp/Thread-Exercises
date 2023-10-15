public class Minute extends Thread {
    @Override
    public void run() {
        int minutes = 1;
        while(true) {
            System.out.println("Minutes: " + minutes);
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            minutes++;
        }
    }
}
