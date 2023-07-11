import java.util.Arrays;

public class terceiroDesafio {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 2};
        int k = 2;
        System.out.println(countPairsWithDiffK(arr, k));
    }

    static int countPairsWithDiffK(int arr[], int k) {
        int n = arr.length;
        Arrays.sort(arr);
        int count = 0;
        int l = 0;
        int r = 0;
        while (r < n) {
            if (arr[r] - arr[l] == k) {
                count++;
                l++;
                r++;
            } else if (arr[r] - arr[l] > k) {
                l++;
            } else { // arr[r] - arr[l] < k
                r++;
            }
        }
        return count;
    }
}
