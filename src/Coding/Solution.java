package Coding;

public class Solution {
    public int[] arrangeZeros(int[] arr) {
        int[] freq = new int[2];
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] <= 1) {
                freq[arr[i]]++;
            }
            else {
                count++;
            }
        }
        int[] ans = new int[arr.length - count];
        int ind = 0;
        int num = 0;
        while(num < 2) {
            for (int i = 0; i < freq[num]; i++) {
                ans[ind] = num;
                ind++;
            }
            num++;
        }
        return ans;
    }
}
