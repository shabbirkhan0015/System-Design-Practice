package MultiThreading;

public class SharedResource {

    private int data;
    private boolean hasData = false;

    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println("Interrupted in producer " + ex);
            }
        }
        data = value;
        hasData = true;
        notifyAll();
    }

    public synchronized int consumer() {
        while (!hasData) {
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println("Interrupted in consumer " + ex);
            }
        }
        hasData = false;
        notifyAll();
        return data;
    }
}
