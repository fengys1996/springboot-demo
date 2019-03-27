package com.dlut.java36.chapter3;

import sun.misc.Cleaner;

public class CleaningExample implements AutoCloseable
{
    private static final Cleaner CLEANER = null;

    @Override
    public void close() throws Exception
    {

    }
}
