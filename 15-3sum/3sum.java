class Solution {
    public List<List<Integer>> threeSum(int[] arr) {

        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int j = i + 1; j < arr.length; j++) {

                int sum = -(arr[i] + arr[j]);

                // Check first
                if (map.containsKey(sum)) {

                    ArrayList<Integer> temp = new ArrayList<>();

                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(sum);

                    Collections.sort(temp);
                    set.add(temp);
                }

                // Add current element after checking
                map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            }
        }

        ans.addAll(set);

        return ans;
    }
}