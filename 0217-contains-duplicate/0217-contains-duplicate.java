class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> set=new HashSet();
        for(int ele:nums){
            set.add(ele);
        }
        if(nums.length==set.size()) return false;
        
        return true;
    }
}