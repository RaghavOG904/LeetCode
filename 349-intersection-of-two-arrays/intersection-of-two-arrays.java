import java.util.Arrays;

class Solution {
    public int[] intersection(int[] arr, int[] arr1) {

        int n1 = arr.length;
        int n2 = arr1.length;


        Arrays.sort(arr);
        Arrays.sort(arr1);

        int[] intersection = new int[Math.min(n1, n2)];

        int i = 0;
        int j = 0;
        int x = 0;

        while (i < n1 && j < n2) {

            if (arr[i] < arr1[j]) {
                i++;
            }
            else if (arr[i] > arr1[j]) {
                j++;
            }
            else {

                intersection[x] = arr[i];
                x++;

                int value = arr[i];

                while (i < n1 && arr[i] == value) {
                    i++;
                }

                while (j < n2 && arr1[j] == value) {
                    j++;
                }
            }
        }

        return Arrays.copyOf(intersection, x);
    }
}