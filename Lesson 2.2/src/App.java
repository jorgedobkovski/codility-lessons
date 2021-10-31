public class App {
    public static int lesson2_2(int[] A) {
        int result = 0;
        int number = 0;
        boolean havePairs=false;

        for (int i = 0; i<A.length; i++){
        number= A[i];
        havePairs=false;
            for(int j = 0; j<A.length; j++){
                if(number == A[j] && j != i){ //verify
                    havePairs=true; // se o número aparecer mais de uma vez em um posição diferente da dele, então existem 2 ou mais.
                } 
            }
            if(havePairs==false){ //if the number appeared only once
                result = number;
            }     
        }
        return result;
    } 
    public static void main(String[] args) {
      int[] A = {9, 3, 9, 3, 9, 7, 9};
      System.out.println(lesson2_2(A));
    }
}

//correctness 80%
//performance 25%