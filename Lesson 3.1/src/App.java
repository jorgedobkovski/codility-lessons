public class App {
    // public static int lesson3_1(int X, int Y, int D) {   //first try
    //     int jmp=0;
    //         while(X<Y){      
    //             X=X+D;
    //             jmp++;
    //         }
    //     return jmp;
    // }

    public static int lesson3_1(int X, int Y, int D) { //more efficient alg
        if (Y <= X) return 0;
        int jmps = 0;
        if((Y-X)%D == 0){
            jmps=(Y-X)/D;
        }else{
            jmps=(((Y-X)/D)+1);
        }
        return jmps;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(lesson3_1(10, 10, 30));
    }
}
