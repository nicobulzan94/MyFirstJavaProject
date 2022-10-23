public class Calculator {

    // curs lab10
    public static int division(int first, int second) {
        int result1 = first / second;
        return result1;
    }

    public static int multiplication(int first, int second){
        int result2 = first * second;
        return result2;
    }


    // Tema Lab10
    // Metodele pt exercitiul 1
    public void start(){
        System.out.println("This is method start: " + "Hello Nico");
    }
    public void MySumVar(){
        short MySumVar = 835 + 56;
        System.out.println("This is method MySumVar: " + MySumVar);
    }
    public void divideVariable(){
        int divideVariable = 9987/2;
        System.out.println("This is method divideVariable: " + divideVariable);
    }

    // Metodele pt exercitiul 2
    public int adunare(int nr1, int nr2){
        int rezultat = nr1 + nr2;
        return rezultat;
    }

    public int scadere(int nr1, int nr2){
        int rezultat = nr1 - nr2;
        return rezultat;
    }

    public int impartire(int nr1, int nr2){
        int rezultat = nr1 / nr2;
        return rezultat;
    }
    public int inmultire(int nr1, int nr2){
        int rezultat = nr1 * nr2;
        return rezultat;
    }

    // Metoda pt exercitiul 3
    public void java(){
        System.out.println("   J   a   v     v   a");
        System.out.println("   J  a a   v   v   a a");
        System.out.println("J  J aaaaa   v v   aaaaa");
        System.out.println(" JJ a     a   v   a     a");
    }

    // Metoda pt exercitiul 4
    public double media(double nr1, double nr2, double nr3){
        double rezultat = (nr1 + nr2 + nr3) /3;
        return rezultat;
    }

    // Metoda pt exercitiul 5
    public void omulet(){
        System.out.println("  +'''''+");
        System.out.println("[ | o o | ]");
        System.out.println("  |  ▲  |");
        System.out.println("  | '_' |");
        System.out.println("  +_____+");
    }
    // Metoda pt exercitiul 6
    public int divd(int nr1, int nr2){
        int impartire = nr1 % nr2;
        return impartire;
    }

    // Metoda ex 7
    public int temp(int fahrenheit){
        int celsius = ((fahrenheit-32)*5)/9;
        return celsius;
    }

    // Metoda ex 8
    public double distanta(float inch){
        double meter = inch * 0.0254;
        return meter;
    }

    // Metoda ex 9
    public void viteza(int mtr,int ora, int min, int sec){
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
