import org.w3c.dom.ls.LSOutput;

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
        System.out.println("Curs lab10");
        System.out.println();
        int x = 10;
        int y = 2;

        int z = op.division(x, y);
        System.out.println(z);

        int a = op.multiplication(x, y);
        System.out.println(a);
 */
        // Tema Lab11: Ex1 - am mutat toate operatiile in Calculator si am creat obiectul de mai jos:
        Calculator calc = new Calculator();
        // Tema Lab10
        System.out.println("Tema Lab10");
        System.out.println();

        System.out.println("Exercitiul 1");
        // 1.Pentru exercitiile din clasa main() de data trecuta, creati metode separate pentru fiecare, tot in clasa Main.java, si apoi apelati-le in metoda main().
        calc.start();
        calc.MySumVar();
        calc.divideVariable();
        System.out.println();

        System.out.println("Exercitiul 2");
        //2. Scrieti care o metoda java pentru fiecare din urmatoarele operatii matematice: adunare, scadere, inmultire, impartire.
        System.out.println("Rezultatul adunarii este: " + calc.adunare(70,68));
        System.out.println("Rezultatul scaderii este: " + calc.scadere(123,59));
        System.out.println("Rezultatul impartirii este: " + calc.impartire(1200,600));
        System.out.println("Rezultatul inmultirii este: " + calc.inmultire(56,3));
        System.out.println();

        System.out.println("Exercitiul 3");
        //2. Scrieti o metoda java, care sa afiseze urmatorul model
        calc.java();
        System.out.println();

        System.out.println("Exercitiul 4");
        //4.Scrieti o metoda java, care sa primeasca 3 parametrii de tip numar, si sa returneze media numerelor.
        System.out.println("Rezultatul mediei este: " + calc.media(6,8,2));
        System.out.println();

        System.out.println("Exercitiul 5");
        //5.Scrieti o metoda java, care sa afiseze urmatorul model
        calc.omulet();
        System.out.println();

        System.out.println("Exercitiul 6");
        //6.Scrieti o metoda java, care sa returneze restul impartirii a doua numere
        System.out.println("Rezultatul impartirii este: " + calc.divd(53,2));
        System.out.println();

        System.out.println("Exercitiul 7");
        //7.Scrieti o metoda java, care sa primeasca ca si parametru un numar, care sa reprezinte temperatura in Fahrenheit, si sa returneze temperatura in Celsius.
        System.out.println("Temperatura este: " + calc.temp(53) + "°C.");
        System.out.println();

        System.out.println("Exercitiul 8");
        //8.Scrieti o metoda java, care sa primeasca ca si parametru un numar real, care sa reprezinte distanta in inch, si sa returneze distanta in metrii
        System.out.println("Distanta este: " + calc.distanta(50) + " metrii.");
        System.out.println();

        System.out.println("Exercitiul 9");
        //9.Scrieti o metoda java, care primeste distanta (in metrii) si timpul (ca si 3 numere: ore, minute, secunde), si afiseaza viteza, in metrii pe secunda, kilometrii pe ora si mile pe ora. (Indiciu: 1 mila = 1609 metrii)
        calc.viteza(85678,2,30,50);
        System.out.println();
        System.out.println();



        //Tema Lab11: if / else
        System.out.println("Tema Lab11: if / else");
        System.out.println();

        LogicalOp op = new LogicalOp();

        System.out.println("Exercitiul 3");
        //3. In clasa LogicalOp, creati o metoda de tip int, care sa se numeasca checkBiggerNumber(), si sa primeasca doua int-uri ca si parametrii. Folosind if - else, verificati in interiorul metode care numar este mai mare, dintre cele doua valori care va vin ca si parametrii, si returnati numarul mai mare.
        int biggestNr = op.checkBiggerNumber(9,13);
        System.out.println("The bigger number is: " + biggestNr);
        System.out.println();

        System.out.println("Exercitiul 4");
        //4.Creati o metoda de tip String, care sa primeasca un parametru de tip String. Verificati daca textul ce vine ca si parametru este egal cu “FastTrackIT”. Daca da, atunci metoda sa returneze “Learning text comparison”. Daca nu, atunci metoda sa returneze “Got to try some more”.
        System.out.println(op.textComp1("oradea"));
        System.out.println();

        System.out.println("Exercitiul 5");
        //5.Creati o metoda de tip String, care sa primeasca un parametru de tip String, si un parametru de tip int. Daca textul primit ca si parametru este egal cu “FastTrackIT”, si numarul primit ca si parametru este mai mic sau egal cu 3, returnati textul si numarul, in ordinea asta. Daca textul nu este “FastTrackIT” si numarul este mai mare sau egal cu 4, returnati numarul si textul, in ordinea asta.
        System.out.println(op.textComp2("FastTrackIT", 3));
        System.out.println();

        System.out.println("Exercitiul 6");
        //6.Creati o metoda de tip String, care sa primeasca un parametru de tip int. Daca numarul primit este mai mare de 8, SAU egal cu 6, atunci sa se returneze “The amount of snow this winter was(cm): “ si numarul. Daca nu, sa printeze “The forecast snow is(cm):” si numarul.
        System.out.println(op.nrComp1(9));
        System.out.println();

        System.out.println("Exercitiul 7");
        //7.Creati o metoda de tip String, care sa primeasca un parametru de tip numar. Daca numarul e mai mare decat 3, SI nu egal cu 4, returnati “The number is greater than 3 and not equal to 4”. Daca numarul este egal cu 4, returnati “The number is equal to 4”, iar daca numarul este mai mic de 3 returnati “The number is lower than 3”.
        System.out.println(op.nrComp2(2));
        System.out.println();

        System.out.println("Exercitiul 8");
        System.out.println(op.switchCase(25));
        System.out.println();

        System.out.println("Exercitiul 9");
        //9.Creati o metoda care sa se numeasca isNumberEven. Metoda trebuie sa primeasca ca parametru un numar, si sa returneze adevarat sau fals. Daca numarul e par sa returneze true iar daca e impar sa returnese false.
        System.out.println(op.isNumberEven(3));
        System.out.println();

        System.out.println("Exercitiul 10");
        //10.Creati o metoda care sa se numeasca isEligibleToVote. Metoda sa primeasca ca si parametru un numar, care sa reprezinte varsta, iar metoda sa iti zica daca daca persoana are drept de vot. Daca varsta e peste 18, sa se returneze true iar daca nu, sa returneze false.
        System.out.println(op.isEligibleToVote(19));
        System.out.println();

        System.out.println("Exercitiul 11");
        //11.Creati o metoda care sa primeasca 3 numere ca si parametrii si sa returneze cel mai mare numar.
        System.out.println(op.returnBiggestNr(2,3,4));
        System.out.println();
        System.out.println();


        //Tema Lab12: for loop
        System.out.println("Tema Lab12: Java For Loops");

        System.out.println("Exercitiul 1");
        op.fromNrto100(96);
        System.out.println();

        System.out.println("Exercitiul 2");
        op.fromNrtoNegative100(-95);
        System.out.println();

        System.out.println("Exercitiul 3");
        op.nrBetweenXandY(11, 16);
        System.out.println();

        System.out.println("Exercitiul 4");
        op.nrFromXtoY(15,10);
        System.out.println();

        System.out.println("Exercitiul 5");
        op.evenNrFrom1to100(100);
        System.out.println();

        System.out.println("Exercitiul 6");
        op.notEvenNrFrom1to100(100);
        System.out.println();

        System.out.println("Exercitiul 7");
        System.out.println(op.sumUntil100(23));
        System.out.println();

        System.out.println("Exercitiul 8");
        System.out.println(op.sumandAverge(69));
        System.out.println();

        System.out.println("Exercitiul 9");
        op.design();
        System.out.println();





    }
}


