import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

     /*

        //1. Printati "Hello" in consola, iar pe rand nou, printati numele vostru.

        String start = "Hello\n" + "Nico";
        System.out.println(start);


        //2. Printati rezultatul sumei a doua numere(orice numere)

        short MySumVar = 835 + 56;
        System.out.println(MySumVar);


        //3. Printati rezultatul impartirii a doua numere. Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula.

        int divideVariable = 9987/2;
        System.out.println(divideVariable);


        //4. Printati rezultatul urmatoarelor operatiuni:

        byte a = -5 + 8 * 6;
        byte b = (55+9) % 9;
        byte c = 20 + -3*5 / 8;
        byte d = 5 + 15 / 3 * 2 - 8 % 3;

        System.out.println(a + " " + b + " " + c + " " + d);

     */

        int x = 10;
        int y = 2;


        int z = division(x, y);
        System.out.println(z);

        int a = multiplication(x, y);
        System.out.println(a);

    }


    public static int division(int first, int second) {
        int result1 = first / second;
        return result1;
    }

    public static int multiplication(int first, int second){
        int result2 = first * second;
        return result2;
    }
}
