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





}
