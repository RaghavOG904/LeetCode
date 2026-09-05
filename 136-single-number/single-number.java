class Solution {
    public int singleNumber(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();
        for ( int i = 0 ; i < nums.length ; i++ ){
            map.put( nums[i] , map.getOrDefault( nums[i] , 0 ) + 1 );
        }
        for ( int keys : map.keySet() ){
            if ( map.get(keys) == 1 ){
                return keys;
            }
        }
        return -1;
    }
}