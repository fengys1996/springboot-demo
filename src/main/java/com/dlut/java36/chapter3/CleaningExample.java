package com.dlut.java36.chapter3;

public class CleaningExample implements AutoCloseable
{
//    private static final Cleaner CLEANER = Cleaner.create(new copyonwrite(),new State());

    private final class State implements Runnable
    {
        int numJunkPiles;

        State(int numJunkPiles){
            this.numJunkPiles = numJunkPiles;
        }

        @Override
        public void run()
        {
            System.out.println("Cleaning room");
        }
    }


    @Override
    public void close() throws Exception
    {

    }

    public static void main(String[] args)
    {
        String s = "12";
        System.out.println(s == "12");
    }
}
