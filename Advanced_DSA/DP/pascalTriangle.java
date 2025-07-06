package Advanced_DSA.DP;

public class pascalTriangle {

    public static void main(String[] args) {

        int num = 3;
        int[][] pascal = pascal(num);
        for(int i = 0 ; i<num;i++){
            for(int j = 0 ; j<=i ; j++){
                System.out.print(pascal[i][j]+" ");
            }
            System.out.println();
        }
        
    }

    public static int[][] pascal(int n){

        int[][] dp = new int[n][n];

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j<=i ; j++){
                if(i==j||j==0){
                    dp[i][j]=1;
            }else{
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
            }
        }

        return dp;
    }
    
}
