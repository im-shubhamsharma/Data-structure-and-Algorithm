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
        
        ceilFloor(arr,d);


    }    

    public static void ceilFloor(int[] arr, int d){
        int left = 0;
        int right = arr.length-1;

        int floor = -1;
        int ceil = -1;

        while(left<=right){
            int mid = (left+right)/2;

            if(arr[mid]==d){
                ceil = floor = mid;
                System.out.println(arr[ceil]);
                System.out.println(arr[floor]);
                return;
            }else if(d>arr[mid]){
                floor = mid;
                left = mid+1;
            }else if(d<arr[mid]){
                right = mid-1;
                ceil = mid;
            }
        }

        System.out.println(arr[ceil]);
        System.out.println(arr[floor]);
    }
}
