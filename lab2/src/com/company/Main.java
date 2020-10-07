package com.company;
public class Main {

    public static void main(String[] args) {
 /*       try {
            for (int i = 5; i >= 0; i--) {
                System.out.println(10 / i);
            }

    } catch(Exception ex)

    {
        System.out.println("Exception Message: " + ex.getMessage());
        ex.printStackTrace();
    }
    System.out.println("After for loop");

    }
*/


        int array[] = {30, 40, 10};
        int numb1 = 20, numb2 = 2;
        int result = 2;
        try {
            result = numb1 / numb2;
            System.out.println("The value of the result is : " + result);
            for (int i = 5; i >= 0; i--) {
                System.out.println("The value of array is : " + array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array is out of bounds" + ex);
        } catch (ArithmeticException ex) {
            System.out.println("cant divide by Zero" + ex);
        }
    }
}



