class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> compliment_index = new HashMap<Integer, Integer>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(compliment_index.containsKey(nums[i])){
                return new int[] { compliment_index.get(nums[i]) , i};
            }
            else{
                compliment_index.put(target - nums[i], i);
            }
        }
        throw new IllegalArgumentException("No soultion for two sum exists in the given array");
    }
}
