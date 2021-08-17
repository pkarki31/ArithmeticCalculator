package com.session1.project;

import java.util.Scanner;

public class ArithmeticCalculator {


    static String operation = null;
    static int number1 = 0;
    static int number2 = 0;
    static String message = null;

    Scanner sc = new Scanner(System.in);


    public  void calculate(int num1,int num2,String ops){

        if(ops.equalsIgnoreCase("Addition")){


            message = "Your "+ops+" is "+(num1+num2);
            System.out.println(message);
        }

        else if(ops.equalsIgnoreCase("Subtraction")){

            if(num1 > num2){
                message = "Your "+ops+" is "+(num1-num2);
                System.out.println(message);
            }

            else {
                message = "Your "+ops+" is "+(num2-num1);
                System.out.println(message);
            }

             }
        else if(ops.equalsIgnoreCase("Multiplication")){

            message = "Your "+ops+" is "+(num1*num2);
            System.out.println(message);

        }

        else if(ops.equalsIgnoreCase("Division")){

            try {
                if (num1 > num2) {
                    int div = (num1 / num2);
                    message = "Your " + ops + " is " + div;
                    System.out.println(message);
                } else {

                    double div = (double) num1 / num2;
                    message = "Your " + ops + " is " + div;
                    System.out.println(message);
                }
            }
            catch (ArithmeticException ae){

                System.out.println("Exception message : "+ae.getMessage());
            }




        }





    }



    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose any one operation from Addition ,Subtraction ,Multiplication ,Division ");

        operation = sc.next();

        if(operation.equalsIgnoreCase("Addition") || operation.equalsIgnoreCase("Subtraction") ||
                operation.equalsIgnoreCase("Multiplication") || operation.equalsIgnoreCase("Division")){

            System.out.println("Enter first number : ");

            number1 = sc.nextInt();

            System.out.println("Enter second number : ");

            number2 = sc.nextInt();

            ArithmeticCalculator am = new ArithmeticCalculator();

            am.calculate(number1,number2,operation);

        }

        else {

            System.out.println(" Please enter correct operation like Addition ,Subtraction ,Multiplication ,Division");

        }





    }
}
