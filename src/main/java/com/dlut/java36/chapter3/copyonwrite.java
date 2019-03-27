package com.dlut.java36.chapter3;


/**
 * copy on write
 */
public class copyonwrite
{
    final int a[];

    /**
     * wrong
     * copyonwrite(int b[])
     * {
     *     a = b;
     * }
     */
    copyonwrite(int b[])
    {
        a = b.clone();
    }
    public void print()
    {
        for(int i =0 ; i<a.length ; i++)
        {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args)
    {
        int[] a = {1,2,3};
        copyonwrite c3 = new copyonwrite(a);
        c3.print();
        a[0] = 0;
        c3.print();

    }
}
