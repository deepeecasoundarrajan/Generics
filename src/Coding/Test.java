package Coding;

//

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[] {0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 2, 2, 2, 1, 1, 3, 4, 5, 6, 7, 11, 2, 3, 1, 0, 0};
        Solution sol = new Solution();
        int[] ans= sol.arrangeZeros(arr);
        for(int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }


    }

}
