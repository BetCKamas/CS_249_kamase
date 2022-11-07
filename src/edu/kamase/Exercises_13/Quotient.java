package edu.kamase.Exercises_13;

//import java.io.IOException;
import java.util.*;
import java.io.*;

public class Quotient {
    public static void inputPanic() throws IOException{
       /*
        try{
            throw new IOException("Help");
        //throw new ArithmeticException();
        }
        catch(IOException e){
            System.err.println("Handled");
        }
        */
        throw new IOException("Help");
    }  
    
    public static int quotient(int a, int b){
        if( b == 0){
            //return 0;
            throw new ArithmeticException("Cannot divide by zero");
        }
        else{
            return a/b;
        }
    }
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        try{
            int x = input.nextInt();
            int y = input.nextInt();
            int q = quotient(x,y);
            System.out.println("Answer = " + q);
            inputPanic();

        }
        catch(ArithmeticException e){
            System.err.println(e);
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        catch(InputMismatchException e){
            System.err.println("cannot decipher");
        }
        catch(Exception ex){
            System.err.println("What ?" + ex);
        }
        System.out.println("Completed");
        input.close();
    }
    
}
