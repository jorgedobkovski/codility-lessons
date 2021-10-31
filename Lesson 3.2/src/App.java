public class App {
    // public static int solution(int[] A) {       // first try
    //     int missing= 0;
    //     boolean find = false;
    //     if(A.length<2) return 0;
    //     for(int i = 1; i<=A.length+1; i++){
    //         find=false;
    //         for(int j = 0; j<A.length; j++){
    //             if (i == A[j]){
    //                 find=true;
    //             }else{
    //                 missing=i;
    //             }
    //         }
    //         if (find==false){
    //             return missing;
    //         }
    //     }
    //     return missing;
    // }

    public static int lesson3_2(int[] A){
        int sum = 0;
        int sumTotal=0;        
        for(int i = 0; i<A.length; i++){ // sum all elements from array
            sum+=A[i];
        }
        for(int j = 0; j<=A.length+1; j++){ //sum all numbers between 1 and (A.length+1) <- last value from Array
            sumTotal+=j;
        }
        return sumTotal-sum; // the subtraction is the missing number;
    }
    public static void main(String[] args) throws Exception {
        int[] A = {2, 3, 1, 5};
        System.out.println(lesson3_2(A));
        
    }
}
