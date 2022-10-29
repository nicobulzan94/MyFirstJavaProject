public class LogicalOp {

    // Tema Lab11: if / else
    // Metoda pt exercitiul 3
    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }

    }

    // Metoda pt exercitiul 4
    public String textComp1 (String second) {
        String first = "FastTrackIT";
        String rezultat = " ";
        if ( first.equals(second) ) {
        rezultat= "Learning text comparison";

        } else if ( !first.equals(second) ) {
        rezultat = "Got to try some more!";
       }

        return rezultat;
    }

    // Metoda pt exercitiul 5
    public String textComp2 (String second, int x) {
       String first = "FastTrackIT";
       String rezultat = " ";
        if (first.equals(second) && x <= 3) {
            rezultat = "Conditia e true, deci " + second + " " + x;
        } else if (!first.equals(second) && x >=4) {
            rezultat = "Conditia e falsa, deci " + x + " " + second;
        }
        return rezultat;
    }

    // Metoda pt exercitiul 6
    public String nrComp1 (int x) {
        String rezultat = " ";
        if (x > 8 || x == 6) {
            rezultat = "The amount of snow this winter was(cm): " + x;
        } else {
            rezultat = "The forecast snow is(cm): " + x;
        }
        return rezultat;
    }

    // Metoda pt exercitiul 7
    public String nrComp2 (int x) {
        String rezultat = " ";
        if (x > 3 && x != 4) {
            rezultat = "The number is greater than 3 and not equal to 4.";
        } else if (x == 4) {
            rezultat = "The number is equal to 4.";
        } else if (x < 3) {
            rezultat = "The number is lower than 3.";
        }
        return rezultat;
    }

    //Metoda pt ex 8
    public String switchCase (int x) {
        System.out.println(x);
        String rezultat = " ";
        switch (x) {
            case 15:
                rezultat = "The number is: 15";
                break;
            case 25:
                rezultat = "The number is: 25";
                break;
            case 35:
                rezultat = "The number is: 35";
                break;
            default:
                rezultat = "Not 15, 25 or 35";
        }
        return rezultat;
    }

    //Metoda pt ex 9
    public boolean isNumberEven (int x) {
        boolean rezultat;
        if (x % 2 == 0) {
            rezultat = true;
        } else {
            rezultat = false;
        }
        return rezultat;
    }

    //Metoda pt ex 10
    public boolean isEligibleToVote (int age) {
        boolean rezultat;
        if (age > 18) {
            rezultat = true;
        } else {
            rezultat = false;
        }
        return rezultat;
    }

    //Metoda pt ex 11
    public int returnBiggestNr (int x, int y, int z) {
        int rezultat;
        if (x > y && x > z) {
            rezultat = x;
        } else if  (y > x && y > z) {
            rezultat = y;
        } else {
            rezultat = z;
        }
        return rezultat;

    }


    // Tema Lab12: for loops
    // Metoda pt ex 1
    public void forLoopFromNrto100 (int nr){
        for(int i = nr; i <= 100; i++){
            System.out.println(i);
        }
    }

    // Metoda pt ex 2
    public void forLoopFromNrtoNegative100 (int negnr) {
        for(int i = negnr; i >= -100; i--){
            System.out.println(i);
        }
    }

    // Metoda pt ex 3
    public void forLoopNrBetweenXandY(int x, int y){
        for (int i = x; i < y; i++){
            System.out.println(i);
            }
        }

    // Metoda pt ex 4
    public void forLoopNrFromXtoY(int x, int y){
        if(x < y){
            for(int i = x; i < y; i++){
                System.out.println(i);
            }
        } else {
            for(int i = y; i < x; i++){
                System.out.println(i);
            }
        }

    }
    // Metoda pt ex 5
    public void forLoopEvenNrFrom1to100(){
        for(int i = 1; i<= 100; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    // Metoda pt ex 6
    public void forLoopNotEvenNrFrom1to100(){
        for(int i = 1; i<= 100; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    // Metoda pt ex 7
    public int forLoopSumUntil100(int nr){
        int sum = 0;
        for(int i = nr; i <= 100; i++){
            sum = sum + i;//sau sum += i;
        }
        return sum;

    }

    // Metoda pt ex 8
    public float forLoopSumAndAverge(int nr){
        int sum = 0;
        int howmanynr = 100 - nr;
        for(int i = nr; i <= 100; i++){
            sum = sum + i;

        }
        return sum/howmanynr;
    }

    // Metoda pt ex 9
    public void forLoopDesign() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 7; j >= 1; j--) {
                if (j >= i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    // Tema Lab12: while loops
    // Metoda pt ex 1
    public void whileLoopFromNrto100(int nr) {
        while(nr <= 100){
            System.out.println(nr);
            nr++;
        }
    }

    // Metoda pt ex 2
    public void whileLoopFromNrtoNeg100(int negnr){
        while(negnr >= -100){
            System.out.println(negnr);
            negnr--;
        }
    }

    // Metoda pt ex 3
    public void whileLoopNrBetweenXandY(int x, int y){
        while(x <= y){
            System.out.println(x);
            x++;

        }
    }

    // Metoda pt ex 4
    public void whileLoopNrFromXtoY(int x, int y){
        if(x < y){
            while(x <= y){
                System.out.println(x);
                x++;
            }

        } else {
            while(y <= x){
                System.out.println(y);
                y++;
            }
        }
    }

    // Metoda pt ex 5
    public void whileLoopEvenNrFrom1to100(int number){
        while(number <= 100){
            if(number % 2 == 0){
                System.out.println(number);
            }
            number++;

        }
    }

    // Metoda pt ex 6
    public void whileLoopNotEvenNrFrom1to100(int number){
        while(number <= 100){
            if(number % 2 != 0){
                System.out.println(number);
            }
            number++;
        }
    }

    // Metoda pt ex 7
    public void whileLoopSumAndAverge(){
        int x = 111;
        int y = 8899;
        int sum = 0;
        int count = 0;
        while(x <= y){
            sum = sum +x;
            x++;
            count++;
        }

        System.out.println(sum/count);
    }

    // Metoda pt ex 8
    public float whileLoopNrdiv7(int x, int y){
        int sum = 0;
        int count = 0;

        while(x <= y) {
            if (x % 7 == 0) {
                sum = sum + x;
                count++;
                System.out.println(x + " e nr divizibil cu 7");
            }
            x++;
        }
        System.out.println("Sunt " + count + " nr divizibile cu 7");
        return sum/count;
    }











}
