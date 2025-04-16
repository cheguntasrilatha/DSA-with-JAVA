//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class HouseRob {
    public static void main(String args[]) throws IOException {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        Solution s=new Solution();
       int res= s. maximizeMoney(N,K);
    System.out.println(res);
sc.close();}}
        
class Solution extends HouseRob{
    static int maximizeMoney(int N , int K) {
        // code here
        int count=0;
        for(int i=1;i<=N;i+=2){
            count++;}
            return count*K;
            
        
    }
};
