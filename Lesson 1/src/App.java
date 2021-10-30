public class App { 
    public static int solution(int N) {
        int gapAtual = 0;
        int bigGap=0;
        int gap = 0;
        String binary = Integer.toBinaryString(N);
        char[] binChar = binary.toCharArray();

            for(int i = 0; i < binChar.length; i++){
                boolean comp = false;
                if (binChar[i] =='1'){
                    comp=true;
                } 
                if (comp=true){
                    for (int j = i; j<binChar.length; j++){
                        i++;
                        gap=0;
                        if (binChar[j] !='1'){
                            gapAtual++;
                        } else {
                            gap = gapAtual;
                            if(gap>bigGap){
                                bigGap=gap;
                                gap=0;
                                gapAtual=0;
                            } else {
                                gap=0;
                                gapAtual=0;
                            }
                        }
                    }
                }
            }
        return bigGap;      
    }
    public static void main(String[] args) throws Exception {
        System.out.println(solution(1376796946));
    }
}
