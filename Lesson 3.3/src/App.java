public class App {
    // public static int lesson3_3(int[] A) {         //my first solution ( 100% correctness, but 0% in performance :/ )
    //     int sum1 = 0;
    //     int sum2 = 0;
    //     int minDif = 2147483647;  //MAX VALUE OF A INTEGER VAR TYPE 
    //     int dif = 0;
    //     for(int p = 1; p < A.length; p++){
    //         sum1=0;
    //         sum2=0;
    //         for(int i = 0; i < p; i++){
    //             sum1+=A[i];
    //         }
    //         for(int j = p; j < A.length; j++){
    //             sum2+=A[j];
    //         }
    //         dif=Math.abs(sum2 - sum1);
    //         minDif=Math.min(dif, minDif);
    //     }
    //     return minDif;
    // }
    public static int lesson3_3(int[] A) {
        int sum1 = 0;
        int sum2 = 0;
        int dif = 2147483647;        

        for(int i=1; i<A.length; i++){
            sum1 += A[i];          
        }

        sum2=A[0];

        dif=Math.abs(sum1-sum2);

        for(int j=1; j<A.length-1;j++){
            sum2+=A[j];
            sum1-=A[j];  
                   
            if(Math.abs(sum1-sum2)<dif){
                dif = Math.abs(sum2-sum1);
            }

        }
        return dif;
    }
    public static void main(String[] args) throws Exception {
        int[] A = {-1000,1000};
        System.out.println(lesson3_3(A));
    }
}
