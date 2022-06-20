package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(squares(3,9));
        System.out.println(squares(17,24));
        System.out.println(squares(1,1000000000));
    }


    public static int squares(int a, int b) {
        double min = Math.sqrt(a);
        double max = Math.sqrt(b);
        int result = (int) (Math.floor(max) - Math.ceil(min)+1);
        return result;
    }
}
