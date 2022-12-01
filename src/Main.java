import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

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
        op.forLoopFromNrto100(96);
        System.out.println();

        System.out.println("Exercitiul 2");
        op.forLoopFromNrtoNegative100(-95);
        System.out.println();

        System.out.println("Exercitiul 3");
        op.forLoopNrBetweenXandY(11, 16);
        System.out.println();

        System.out.println("Exercitiul 4");
        op.forLoopNrFromXtoY(15,10);
        System.out.println();

        System.out.println("Exercitiul 5");
        op.forLoopEvenNrFrom1to100();
        System.out.println();

        System.out.println("Exercitiul 6");
        op.forLoopNotEvenNrFrom1to100();
        System.out.println();

        System.out.println("Exercitiul 7");
        System.out.println(op.forLoopSumUntil100(23));
        System.out.println();

        System.out.println("Exercitiul 8");
        System.out.println(op.forLoopSumAndAverge(69));
        System.out.println();

        System.out.println("Exercitiul 9");
        op.forLoopDesign();
        System.out.println();

        //Tema Lab12: while loop
        System.out.println("Tema Lab12: Java While Loops");

        System.out.println("Exercitiul 1");
        op.whileLoopFromNrto100(97);
        System.out.println();

        System.out.println("Exercitiul 2");
        op.whileLoopFromNrtoNeg100(-97);
        System.out.println();

        System.out.println("Exercitiul 3");
        op.whileLoopNrBetweenXandY(6, 9);
        System.out.println();

        System.out.println("Exercitiul 4");
        op.whileLoopNrFromXtoY(8, 6);
        System.out.println();

        System.out.println("Exercitiul 5");
        op.whileLoopEvenNrFrom1to100(1);
        System.out.println();

        System.out.println("Exercitiul 6");
        op.whileLoopNotEvenNrFrom1to100(1);
        System.out.println();

        System.out.println("Exercitiul 7");
        op.whileLoopSumAndAverge();
        System.out.println();

        System.out.println("Exercitiul 8");
        System.out.println(op.whileLoopNrdiv7(0, 14));
        System.out.println();

        System.out.println("Exercitiul 9");
        op.whileLoopFibonacci();
        System.out.println();

        System.out.println("Exercitiul 10");
        op.CozaLozaWoza();
        System.out.println();


        //Tema Lab13: Java Arrays
        System.out.println("Tema Lab13: Java Arrays");

        System.out.println("Exercitiul 2");
        int[] myArray = op.arrayfrom1to100(100);
        op.printArray(myArray);
        System.out.println();

        System.out.println("Exercitiul 3");
        int[] x = new int[100];
        int[] arrayEven = op.arrayOfEvenNr1to100(x);
        op.printEvenArray(arrayEven);
        System.out.println();
        System.out.println();

        System.out.println("Exercitiul 4");
        int[] arrayWithValues = {71, 22};
        int arraySumAvg = op.arraySumandAverage(arrayWithValues);
        System.out.println(arraySumAvg);
        System.out.println();

        System.out.println("Exercitiul 5");
        String socialPlatform = "Facebook";
        String[] socialMedia = {"Instagram", "Facebook", "Telegram", "What's Up"};
        boolean compareString = op.stringArrayTF(socialMedia,socialPlatform);
        System.out.println(compareString);
        System.out.println();

        System.out.println("Exercitiul 6");
        int nrx = 8;
        int[] nrsArray = {2, 4, 6, 8, 10};
        int showPositioninArray = op.arrayReturnPosition(nrsArray, nrx);
        op.printReturnArrayPosition(showPositioninArray);
        System.out.println();

        System.out.println("Exercitiul 7");
        String[] arrayofLines = {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-",};
        op.designGrila(arrayofLines);
        System.out.println();


        //Tema Lab14: Java Lists
        System.out.println("Tema Lab14: Java Lists");

        System.out.println("Exercitiul 1");
        List<String> listEx1 = new ArrayList<>();
        listEx1.add("Nico");
        listEx1.add("Marius");
        listEx1.add("DenisaP");
        op.printList(listEx1);
        System.out.println();

        System.out.println("Exercitiul 2");
        List<Integer> listEx2 = new ArrayList<>();
        listEx2.add(34);
        listEx2.add(6);
        listEx2.add(91);
        listEx2.add(13);
        op.listOfNr(listEx2, 22);
        System.out.println();

        System.out.println("Exercitiul 3");
        listEx2.add(99);
        listEx2.add(87);
        listEx2.add(58);
        //exemplu care merge cu succes
        op.listStartFromNr(listEx2, 3);
        //exemplu cu eroare
        op.listStartFromNr(listEx2, 10);
        System.out.println();

        System.out.println("Exercitiul 4");
        op.printListBackwards(listEx1);
        System.out.println();

        System.out.println("Exercitiul 5");
        op.complexListof3(listEx1, 1, "Damaris");
        System.out.println();

        System.out.println("Exercitiul 6");
        List<String> listEx6 = new ArrayList<>();
        listEx6.add("NewYorker");
        listEx6.add("Berska");
        listEx6.add("Zara");
        op.insertElemInList(listEx6, "Stradivarius");
        System.out.println();

        System.out.println("Exercitiul 7");
        op.printElemandPosition(listEx2);
        System.out.println();

        System.out.println("Exercitiul 8");
        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(10);
        myList.add(30);
        int maxValue = op.listBiggestNr(myList);
        System.out.println("The biggest number is " + maxValue);
        System.out.println();


        //Tema Lab15: Java Error Handling
        System.out.println("Tema Lab15: Java Error Handling");
        Read read = new Read();

        System.out.println("Exercitiul 1");
        System.out.println("Numarul introdus este: " + read.keyboardInt());
        System.out.println();

        System.out.println("Exercitiul 2");
        System.out.println("Numarul introdus este: " + read.keyboardDouble());
        System.out.println();
        System.out.println("Textul introdus este: " + read.keyboardText());
        System.out.println();

        System.out.println("Exercitiul 3");
        int[] constructArray = read.constructArray(4);
        read.printConstructArray(constructArray);
        System.out.println();

        System.out.println("Exercitiul 4");
        List<Integer> ex4List = read.constructList();
        read.printConstructList(ex4List);
        System.out.println();

        System.out.println("Exercitiul 5");
        int[] myArrayofInt = {23, 67, 34, 89};
        op.tryCatch(myArrayofInt, 2);
        System.out.println();

        System.out.println("Exercitiul 6");
        op.wait(8);
































    }
}


