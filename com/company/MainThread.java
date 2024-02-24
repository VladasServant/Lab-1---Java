package com.company;

public class MainThread extends Thread{
    private final int id;
    private final BreakThread breakThread;

    public MainThread(int id, BreakThread breakThread) 
    {
        this.id = id;
        this.breakThread = breakThread;
    }

    @Override
    public void run() 
    {
        long sum = 0;
        int step = 1;
        int elements = 0;

        while (!breakThread.isCanBreak())
        {
            sum += elements * step;
            elements++;
        }
        System.out.println("Thread: - " + id + " Sum: " + sum + " Count: " + elements);
    }
}