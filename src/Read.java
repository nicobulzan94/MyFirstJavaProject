import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Read {


    //Tema 15: Error Handling
    //Exercitiul 1
    public int keyboardInt() {
        Scanner scan = new Scanner(System.in);
        int number = 0;
        boolean repeat = true;
        while(repeat) {
            try {
                System.out.print("Please enter a number: ");
                number = scan.nextInt();
                repeat = false;
            }catch(InputMismatchException e){
                System.out.println("The value ["+scan.nextLine()+"] is not a numeric value.Please try again!");
            }
        }
        return number;
    }

    //Exercitiul 2
    public float keyboardFloat() {
        Scanner scan = new Scanner(System.in);
        float number = 0;
        boolean repeat = true;
        while(repeat){
            try{
                System.out.print("Please enter a number: ");
                number = scan.nextFloat();
                repeat = false;
            }catch (InputMismatchException z) {
                System.out.println("The value ["+scan.nextLine()+"] is invalid.\n" + "Please try again!");
            }
        }
        return number;
    }

    public double keyboardDouble() {
        Scanner scan = new Scanner(System.in);
        double number = 0;
        boolean repeat = true;
        while(repeat){
            try{
                System.out.print("Please enter a number: ");
                number = scan.nextDouble();
                repeat = false;
            }catch (InputMismatchException z) {
                System.out.println("The value ["+scan.nextLine()+"] is invalid.\n" + "Please try again!");
            }
        }
        return number;
    }

    public short keyboardShort() {
        Scanner scan = new Scanner(System.in);
        short number = 0;
        boolean repeat = true;
        while(repeat){
            try{
                System.out.print("Please enter a number: ");
                number = scan.nextShort();
                repeat = false;
            }catch (InputMismatchException z) {
                System.out.println("The value ["+scan.nextLine()+"] is invalid.\n" + "Please try again!");
            }
        }
        return number;
    }

    public long keyboardLong() {
        Scanner scan = new Scanner(System.in);
        long number = 0;
        boolean repeat = true;
        while(repeat){
            try{
                System.out.print("Please enter a number: ");
                number = scan.nextLong();
                repeat = false;
            }catch (InputMismatchException z) {
                System.out.println("The value ["+scan.nextLine()+"] is invalid.\n" + "Please try again!");
            }
        }
        return number;
    }

    public String keyboardText() {
        Scanner scan = new Scanner(System.in);
        String textFromKeyboard = "";
        boolean repeat = true;
        while(repeat){
            try{
                System.out.print("Please enter a text: ");
                textFromKeyboard = scan.next();
                repeat = false;
            }catch(InputMismatchException z) {
                System.out.println("The value ["+scan.nextLine()+"] is invalid.\n" + "Please try again!");
            }
        }
        return textFromKeyboard;
    }


    //Exercitiul 3

    public int[] constructArray(int number) {
        Scanner scan = new Scanner(System.in);
        int[] myArray = new int[number];
        for(int i = 0; i < number; i++) {
            try{
                System.out.print("Please enter a number: ");
                int nrFromKeyboard = scan.nextInt();
                myArray[i] = nrFromKeyboard;
            }catch(InputMismatchException z) {
                System.out.println("The value ["+scan.nextLine()+"] is invalid." + "Please enter a number and try again!");
            }

        }
        System.out.println("My array has the length of  " + myArray.length);
        return myArray;

    }

    public void printConstructArray(int[] z) {
        System.out.print("This is my array [ ");
        for(int i = 0; i < z.length; i++) {
                System.out.print(z[i] + " ");
            }
        System.out.println("].");
        }


    //Exercitiul 4
    public List<Integer> constructList() {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        boolean flag = true;
        while(flag) {
            try {
                System.out.print("Write a number: ");
                int nrFromKeyboard = scan.nextInt();
                list.add(nrFromKeyboard);
            }catch(InputMismatchException z) {
                flag = false;
                System.out.println("While function stopped because you introduced something else than a number.");

            }
        }
        return list;

    }

    public void printConstructList(List<Integer> x) {
        System.out.print("This is my list [ ");
        for(int i = 0; i < x.size(); i++) {
            System.out.print(x.get(i) + " ");
        }
        System.out.println("].");
    }












}
