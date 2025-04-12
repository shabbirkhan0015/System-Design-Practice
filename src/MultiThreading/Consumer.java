package MultiThreading;

public class Consumer implements Runnable {

    private SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int value = sharedResource.consumer();
            System.out.println("Consumed: " + value);
        }
    }
}
