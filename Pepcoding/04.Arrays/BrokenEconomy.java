import java.util.*;

public class BrokenEconomy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int d = sc.nextInt();
        // System.out.println(ceil(arr,d));
        System.out.println(floor(arr,d));

    }    

    public static int floor(int[] arr, int d){
        int left = 0;
        int right = arr.length-1;

        int floor = -1;

        while(left<=right){
            int mid = (left+right)/2;

            if(arr[mid]==d){
                return arr[mid];
            }else if(d>arr[mid]){
                floor = arr[mid];
                left = mid+1;
            }else if(d<arr[mid]){
                right = mid-1;
            }
        }

        return floor;
    }
}
