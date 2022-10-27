public class Exercitii {
    public static void main(String[] args){
        int arr[] = {24,36,42,48};
        for(int i = 0; i < 4; i++){
            System.out.println(arr[i] + " " + i);
            if(arr[i] == 48){
                arr[i] = 54;
                System.out.println("Am intrat in IF cand i e egal cu " + i);
                System.out.println(arr[i] + " " + i);
            }

        }
        System.out.println();

        for(int j:arr){
            System.out.println(j);
            if(j == 36){
                System.out.println("Elementul e 36");
            } else {
                System.out.println("Elementul nu e 36 ");
            }
        }


    }
}
