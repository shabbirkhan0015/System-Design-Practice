package MultiThreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadRunner {

    public static void main(String[] args) {
//        SharedResource sharedResource=new SharedResource();
//
//        Thread thread1= new Thread(new Producer(sharedResource));
//        Thread thread2 = new Thread(new Consumer(sharedResource));
//
//        thread1.start();
//        thread2.start();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        long starttime = System.currentTimeMillis();
        executorService.submit(()->{

            System.out.println("Thread running");
        });
        executorService.shutdown();
        System.out.println(System.currentTimeMillis()-starttime);
    }
}
