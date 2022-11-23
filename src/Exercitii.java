import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercitii {
    public static void main(String[] args) {
        int arr[] = {24, 36, 42, 48};
        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i] + " " + i);
            if (arr[i] == 48) {
                arr[i] = 54;
                System.out.println("Am intrat in IF cand i e egal cu " + i);
                System.out.println(arr[i] + " " + i);
            }

        }
        System.out.println();

        for (int j : arr) {
            System.out.println(j);
            if (j == 36) {
                System.out.println("Elementul e 36");
            } else {
                System.out.println("Elementul nu e 36 ");
            }
        }
        System.out.println();


        int[] myArray = {4, 7, 11};

        int biggestNr = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > biggestNr) {
                biggestNr = myArray[i];
            }
        }
        System.out.println(" The biggest nr is " + biggestNr);
        System.out.println();


        Scanner scan = new Scanner(System.in);
        System.out.println("Introdu un nr de la tast");
        int nrTast = scan.nextInt();
        System.out.println("Nr introdus de la tast e " + nrTast);
        System.out.println();


        int[] array = {3, 6, 32, 78, 44, 35, 21};
        int i = 5;
        System.out.println(i);
        System.out.println(array[i]);







    }

}
