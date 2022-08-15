package com.async.futureedu;

import java.time.LocalDateTime;
import java.util.concurrent.*;

public class Fu_edu02 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        CompletableFuture<Integer> future = new CompletableFuture<>();

        Executors.newCachedThreadPool().submit(()->{
            System.out.println(LocalDateTime.now()+"  Doing something");
            Integer sum = 1+1;
            Thread.sleep(3000);
            future.complete(sum);
            return null;
        });

        System.out.println(LocalDateTime.now()+" Waiting the task done");
        Integer result = future.get();
        System.out.println(LocalDateTime.now() + " result : " + result);

        //future.cancel(true);
    }

}
