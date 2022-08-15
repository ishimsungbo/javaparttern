package com.async.futureedu;

import java.time.LocalDateTime;
import java.util.concurrent.*;

public class Fu_edu01 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println("1. 쓰레드 명 : " + Thread.currentThread().getName());
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<Integer> future = executorService.submit(()->{
            System.out.println(LocalDateTime.now() + " 시작 합니다." + Thread.currentThread().getName());

            Integer sum = 1+1;
            Thread.sleep(3000);

            return sum;
        });

        System.out.println(LocalDateTime.now() + " 기다립니다. 작업이 끝나길...");
        Integer result = future.get();
        System.out.println(LocalDateTime.now() + " Result  : " + result);

        System.out.println("죵료합니다.");

        executorService.shutdown();
    }

}
