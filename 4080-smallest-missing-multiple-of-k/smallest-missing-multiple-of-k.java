class Solution {
    public int missingMultiple(int[] arr, int k) {

        int x = k;

        while (true) {

            boolean found = false;

            for (int i = 0; i < arr.length; i++) {

                if (arr[i] == x) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return x;
            }

            x = x + k;
        }
    }
}