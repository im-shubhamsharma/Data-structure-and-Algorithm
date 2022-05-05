/*
1. You are given a number n, representing the size of array a.

2. You are given n numbers, representing the height of bars in a bar chart.

3. You are required to find and print the area of largest rectangle in the histogram.
*/

import java.io.*;
import java.util.Stack;

public class LargestAreaHistogram {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());
        int heights[] = new int[n];
        for(int i=0;i<n;i++)heights[i] = Integer.parseInt(read.readLine());

        System.out.println(largestRectangleArea(heights));
        
    }


    public static int largestRectangleArea(int[] arr) {

        // array for nse index on right
        int[] rb = new int[arr.length]; 
        Stack<Integer> st = new Stack<>();
        rb[arr.length-1] = arr.length;
        st.push(arr.length-1);

        for(int i=arr.length-2; i>=0; i--){
            int num = arr[i];

            while(st.size()>0 && num <= arr[st.peek()]){
                  st.pop();
            }

            if(st.size() == 0){
                rb[i] = arr.length;
            }else{
               rb[i] = st.peek();
            }
           st.push(i);
        }

        // array for nse index on left
        int[] lb = new int[arr.length]; 
        Stack<Integer> str = new Stack<>();
        lb[0] = -1;
        str.push(0);

        for(int i=1; i<arr.length; i++){
            int num = arr[i];

            while(str.size()>0 && num <= arr[str.peek()]){
                  str.pop();
            }

            if(str.size() == 0){ 
                lb[i] = -1;
            }else{
               lb[i] = str.peek();
            }
           str.push(i);
        }

        //Area
        int maxArea = 0;
        for(int i=0; i<arr.length; i++){
            int width = rb[i] - lb[i] -1;
            int area = arr[i] * width;

            if(area > maxArea){
                maxArea = area;
            }
        }
        return maxArea;
    }
}
