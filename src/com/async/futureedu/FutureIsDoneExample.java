package com.async.futureedu;

import java.util.concurrent.*;

public class FutureIsDoneExample {


    public static void main(String[] args) throws InterruptedException, ExecutionException {

        int idx = 0;
        ExecutorService es = Executors.newSingleThreadExecutor();

        Future<String> future = es.submit(()->{
            Thread.sleep(2000);
            return "비동기 프로그램이 실행/종료 되었습니다";
        });

        while (!future.isDone()){
            System.out.println("작업이 진행중 입니다");
            idx++;
            Thread.sleep(200);
        }

        System.out.println("비동기 프로그램이 완료 되었습니다.");
        String result = future.get();
        System.out.println(result);

        es.shutdown();
        System.out.println("기다린 카운트 : "+idx);
    }

}
