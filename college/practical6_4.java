import java.util.LinkedList;

public class practical6_4 {
    public static void main(String[] args) throws InterruptedException 
    {
        final Data data = new Data();
        Thread producerThread = new Thread(new Runnable() 
        {
            public void run() {
                try {
                    data.produceItems(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread consumerThread = new Thread(new Runnable() {
            public void run() {
                try {
                    data.consumeItems(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        producerThread.start();
        consumerThread.start();
        producerThread.join();
        consumerThread.join();
    }
    public static class Data {
        LinkedList<Integer> itemList = new LinkedList<>();
        int capacity = 2;
        public void produceItems(int times) throws InterruptedException {
            int value = 0;
            for (int i = 0; i < times; i++) {
                synchronized (this) {
                    while (itemList.size() == capacity)
                        wait();

                    System.out.println("Producer produced-" + value);
                    itemList.add(value++);
                    notify();
                    Thread.sleep(1000);
                }
            }
        }
        public void consumeItems(int times) throws InterruptedException {
            int count = 0;
            while (count < times) {
                synchronized (this) {
                    while (itemList.size() == 0)
                        wait();
                    int val = itemList.removeFirst();

                    System.out.println("Consumer consumed-" + val);
                    notify();
                    Thread.sleep(1000);
                    count++;
                }
            }
        }
    }
}