package com.company;

public class Main {

    public static void main(String[] args) 
    {
        BreakThread breakThread = new BreakThread();
        for (int i = 1; i < 5; i++)
        {
            new MainThread(i, breakThread).start();
        }
        new Thread(breakThread).start();
    }
}
