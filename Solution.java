
    import java.util.*;
class Solution {
    // Function to reimportmove duplicates from the given array
    public static int removeDuplicates(int[] arr) {
    int n = arr.length;
    if (n <= 1)
        return n;
        Arrays.sort(arr);
    
      // Start from the second element
    int idx = 1; 
  
    for (int i = 1; i < n; i++) {
        if (arr[i] != arr[i - 1])
            arr[idx++] = arr[i];
        }
    
    return idx;}
    
        public static void main(String args[]){
            int arr[]={1,2,2,3,3,4};
            
            int res=removeDuplicates(arr);
            for(int i=0;i<res;i++){
                System.out.println(arr[i]+" ");
            }
            //System.out.println(" ");
        }
    }


