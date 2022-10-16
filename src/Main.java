import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

     /*
     System.out.println("Tema lab9");

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
        /*

        //curs lab10
        int x = 10;
        int y = 2;

        int z = division(x, y);
        System.out.println(z);

        int a = multiplication(x, y);
        System.out.println(a);
 */
        System.out.println("Tema lab10");
        System.out.println();

        System.out.println("Exercitiul 1");
        // 1.Pentru exercitiile din clasa main() de data trecuta, creati metode separate pentru fiecare, tot in clasa Main.java, si apoi apelati-le in metoda main().
        start();
        MySumVar();
        divideVariable();
        System.out.println();

        System.out.println("Exercitiul 2");
        //2. Scrieti care o metoda java pentru fiecare din urmatoarele operatii matematice: adunare, scadere, inmultire, impartire.
        System.out.println("Rezultatul adunarii este: " + adunare(70,68));
        System.out.println("Rezultatul scaderii este: " + scadere(123,59));
        System.out.println("Rezultatul impartirii este: " + impartire(1200,600));
        System.out.println("Rezultatul inmultirii este: " + inmultire(56,3));
        System.out.println();

        System.out.println("Exercitiul 3");
        //2. Scrieti o metoda java, care sa afiseze urmatorul model
        java();
        System.out.println();

        System.out.println("Exercitiul 4");
        //4.Scrieti o metoda java, care sa primeasca 3 parametrii de tip numar, si sa returneze media numerelor.
        System.out.println("Rezultatul mediei este: " + media(6,8,2));
        System.out.println();

        System.out.println("Exercitiul 5");
        //5.Scrieti o metoda java, care sa afiseze urmatorul model
        omulet();
        System.out.println();

        System.out.println("Exercitiul 6");
        //6.Scrieti o metoda java, care sa returneze restul impartirii a doua numere
        System.out.println("Rezultatul impartirii este: " + divd(53,2));
        System.out.println();

        System.out.println("Exercitiul 7");
        //7.Scrieti o metoda java, care sa primeasca ca si parametru un numar, care sa reprezinte temperatura in Fahrenheit, si sa returneze temperatura in Celsius.
        System.out.println("Temperatura este: " + temp(53) + "°C.");
        System.out.println();

        System.out.println("Exercitiul 8");
        //8.Scrieti o metoda java, care sa primeasca ca si parametru un numar real, care sa reprezinte distanta in inch, si sa returneze distanta in metrii
        System.out.println("Distanta este: " + distanta(50) + " metrii.");
        System.out.println();

        System.out.println("Exercitiul 9");
        //9.Scrieti o metoda java, care primeste distanta (in metrii) si timpul (ca si 3 numere: ore, minute, secunde), si afiseaza viteza, in metrii pe secunda, kilometrii pe ora si mile pe ora. (Indiciu: 1 mila = 1609 metrii)
        viteza(85678,2,30,50);
        System.out.println();
    }


/*
    // curs lab10
    public static int division(int first, int second) {
        int result1 = first / second;
        return result1;
    }

    public static int multiplication(int first, int second){
        int result2 = first * second;
        return result2;
    }

         */

     // Tema Lab10
    // Metodele pt exercitiul 1
    public static void start(){
        System.out.println("This is method start: " + "Hello Nico");
    }
    public static void MySumVar(){
        short MySumVar = 835 + 56;
        System.out.println("This is method MySumVar: " + MySumVar);
    }
    public static void divideVariable(){
        int divideVariable = 9987/2;
        System.out.println("This is method divideVariable: " + divideVariable);
    }

    // Metodele pt exercitiul 2
    public static int adunare(int nr1, int nr2){
        int rezultat = nr1 + nr2;
        return rezultat;
    }

    public static int scadere(int nr1, int nr2){
        int rezultat = nr1 - nr2;
        return rezultat;
    }

    public static int impartire(int nr1, int nr2){
        int rezultat = nr1 / nr2;
        return rezultat;
    }
    public static int inmultire(int nr1, int nr2){
        int rezultat = nr1 * nr2;
        return rezultat;
    }

    // Metoda pt exercitiul 3
    public static void java(){
        System.out.println("   J   a   v     v   a");
        System.out.println("   J  a a   v   v   a a");
        System.out.println("J  J aaaaa   v v   aaaaa");
        System.out.println(" JJ a     a   v   a     a");
    }

    // Metoda pt exercitiul 4
    public static double media(double nr1, double nr2, double nr3){
        double rezultat = (nr1 + nr2 + nr3) /3;
        return rezultat;
    }

    // Metoda pt exercitiul 5
    public static void omulet(){
        System.out.println("  +'''''+");
        System.out.println("[ | o o | ]");
        System.out.println("  |  ▲  |");
        System.out.println("  | '_' |");
        System.out.println("  +_____+");
    }
    // Metoda pt exercitiul 6
    public static int divd(int nr1, int nr2){
        int impartire = nr1 % nr2;
        return impartire;
    }

    // Metoda ex 7
    public static int temp(int fahrenheit){
        int celsius = ((fahrenheit-32)*5)/9;
        return celsius;
    }

    // Metoda ex 8
    public static double distanta(float inch){
        double meter = inch * 0.0254;
        return meter;
    }

    // Metoda ex 9
    public static void viteza(int mtr,int ora, int min, int sec){
        double mps = mtr / sec;
        double km = mtr / 1000;
        double kmo = km / ora;
        double mile = mtr / 1609;
        double mlo = mile / ora;

        System.out.println("Ai parcurs " + mtr + "metrii " + "in " + sec + "sec cu viteza de " + mps + " m/sec.");
        System.out.println("Ai parcurs " + km + "km " + "in " + ora + "ore cu viteza de " + kmo + " km/ora.");
        System.out.println("Ai parcurs " + mile + "mile " + "in " + ora + "ore cu viteza de " + mlo + " mile/ora.");

    }
}


