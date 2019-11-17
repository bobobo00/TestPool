package Pool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName TestPool
 * @Description TODO
 * @Auther danni
 * @Date 2019/11/17 21:01]
 * @Version 1.0
 **/

public class TestPool {
    public static void main(String[] args) {
        ExecutorService pool= Executors.newFixedThreadPool(1);
        pool.execute(new Runnable() {
            @Override
            public void run() {
                while(true){
                    System.out.println("one");
                }
            }
        });
        pool.execute(new Runnable() {
            @Override
            public void run() {
                while(true){
                    System.out.println("two");
                }
            }
        });
    }
}
