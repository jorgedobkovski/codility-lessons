public class App {
        public static int[] lesson2(int[] A, int K) {
           int[] array = new int[A.length];
    
            for(int i = 0; i < K; i++){  
                for(int j=0; j < A.length;j++){
                        array[j]=A[j];
                }
                for(int k=1; k<A.length;k++){
                    if(k<(A.length-1)){
                        A[k]=array[k-1];
                    } else {
                        A[0]=array[k];
                        A[k]=array[k-1];
                    }
                }
            }
            for(int l = 0; l<A.length; l++){
                System.out.print(A[l]);
            }
            return A;
        }

    public static void main(String[] args) throws Exception {
        int[] A = {3, 8, 9, 7, 6};
        int K = 100;
        lesson2(A, K);
    }
}
