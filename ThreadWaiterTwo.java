public class ThreadWaiterTwo implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(5000); // Delay for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread Waiter Two is done.");
    }
}
