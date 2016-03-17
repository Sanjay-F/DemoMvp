package com.example.administrator.demomvp.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by Sanjay on 2016/3/17 on project DemoMvp.
 */
public class ThreadTaskExecutor {


    private static ThreadTaskExecutor mThreadTaskExecutor;

    private ThreadPoolExecutor threadPoolExecutor;
    private ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);

    public static ThreadTaskExecutor getInstance() {
        if (mThreadTaskExecutor == null) {
            synchronized (ThreadTaskExecutor.class) {
                if (mThreadTaskExecutor == null) {
                    mThreadTaskExecutor = new ThreadTaskExecutor();
                }
            }
        }
        return mThreadTaskExecutor;
    }


    private void executeTask(Runnable runnable) {
        fixedThreadPool.execute(runnable);
    }

}
