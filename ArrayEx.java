
import java.util.ArrayList;
import java.util.Collections;

 class ArrayEx {
    
        //right to left method which is Optimized solution
        static ArrayList<Integer> leaders(int[] arr) {
        ArrayList<Integer> res=new ArrayList<>();
        //int arr[]={12,3,29,4,2,1};
        int n=arr.length;
        int max=arr[n-1];
         res.add(max);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
                res.add(arr[i]);
            }
    }  Collections.reverse(res);
            return res;
            
        }
        public static void main(String args[]){
            int arr[]={1,2,45,23,2,4,1};
            ArrayList<Integer> res1=leaders(arr);
           
           for (int res : res1) {
            System.out.print(res + " ");
        }
        System.out.println();
        }
    }
/* 
//left to right approach which is more time and space complexity
// Function to find the leaders in an array
static ArrayList<Integer> leaders(int[] arr) {
    ArrayList<Integer> result = new ArrayList<>();
    int n = arr.length;
    
    for (int i = 0; i < n; i++) {
        int j;
      
        // Check elements to the right
        for (j = i + 1; j < n; j++) {
          
            // If a larger element is found
            if (arr[i] < arr[j])
                break;
        }
        
        // If no larger element was found
        if (j == n)
            result.add(arr[i]);
    }
    
    return result;
}

public static void main(String[] args) {
    int[] arr = { 16, 17, 4, 3, 5, 2 };
    ArrayList<Integer> result = leaders(arr);
    
    for (int res : result) {
        System.out.print(res + " ");
    }
    System.out.println();
}
}*/