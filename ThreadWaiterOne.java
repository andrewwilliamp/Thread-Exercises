public class ThreadWaiterOne implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(20000); // Delay for 20 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread Waiter One is done.");
    }
}
