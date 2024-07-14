package com.example.q3.q11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        // シングルスレッドを生成する。
        ExecutorService exec = Executors.newSingleThreadExecutor();

        // futureクラスを生成する。
        List<Future<Boolean>> futures = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            // futuresクラスに実行する処理を記述する。
            futures.add(exec.submit(() -> {
                if (new Random().nextInt() % 2 != 0) {
                    throw new Exception("odd Number");
                }
                return true;
            }));
        }

        // 拡張for文で処理結果を判定し数える。
        int total = 0;
        for (Future<Boolean> future : futures) {
            Boolean result = false;

            try {
                result = future.get();

            } catch (ExecutionException e) {
                // 呼び出したスレッドで例外が発生した場合、
                // FutureのgetメソッドはExecutionExceptionをスローする。
                System.out.println(e.getMessage());
            }
            if (result) {
                total++;
            }
        }
        System.out.println(total);

    }
}
