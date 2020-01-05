package com.pphac;

import com.pphac.threadcore.createthreads.RunnableStyle;
import com.pphac.threadcore.createthreads.ThreadStyle;

public class Main {

    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableStyle());

        thread.start();
        new ThreadStyle().start();
        System.out.println("mian");

    }
}
