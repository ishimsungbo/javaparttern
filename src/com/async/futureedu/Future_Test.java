package com.async.futureedu;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Future_Test {


    public static void main(String[] args) throws InterruptedException, ExecutionException {

        int idx = 0;
        ExecutorService es = Executors.newSingleThreadExecutor();

        Future<String> future = es.submit(()->{
            Thread.sleep(2000);
            Future_Test future_test = new Future_Test();
            future_test.cal();
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

    public void cal(){
        int t = 0;
        for(int i=0; i < 1000000;i++){
            //System.out.println(i);
            t++;
        }

        System.out.println(t);
    }

}
