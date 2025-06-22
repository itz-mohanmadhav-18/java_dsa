// package java_basics.Bitmasking;

public class countSetBit {

    public static void main(String[] args) {

        int n = 84;
        System.out.println(fastCountBit(n));
        
    }

    public static int countBit(int n){
        int count = 0 ; 
        while(n>0){
            if((n&1) !=0){
                count++;
            }
            n>>=1;
        }
        return count;
    }
    public static int fastCountBit(int n){
        int count = 0 ; 
        while(n>0){
            count++;
            n = (n&(n-1));
        }
        return count;
    }
}