package Demo;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadFactory;

public class CountDownLatchTest {

    private static CountDownLatch mCountDownLatch;

    public static void main(String[] args) {
        mCountDownLatch = new CountDownLatch(3);

        for (int i = 0;i <3;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"  count1:"+mCountDownLatch.getCount());
                    mCountDownLatch.countDown();//实现门闩锁减一的效果
                    System.out.println(Thread.currentThread().getName()+"  count2:"+mCountDownLatch.getCount());
                }
            }).start();
        }

        try {
            mCountDownLatch.await();//让当前线程进入等待
            System.out.println("countdown await");
        } catch (InterruptedException e) {
            System.out.println("Exception");
            e.printStackTrace();
        }

        final CountDownLatch latch = new CountDownLatch(1);
        for (int i = 0;i<1000;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        latch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(CountDownLatcher.getInstance().hashCode());
                }
            }).start();
        }
        latch.countDown();


        System.out.println("finish");
    }




}
