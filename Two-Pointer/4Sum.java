import java.util.*;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums.length<4){
            return new ArrayList<>();
        }
        long sum = 0;
        Arrays.sort(nums);
        List<List<Integer>> check = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
         for(int j=i+1; j<nums.length; j++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            if(j>i+1 && nums[j]==nums[j-1]) continue;
            int k=j+1;
            int l = nums.length-1;
            while(k<l){
                sum = (long) nums[i]+nums[j]+nums[k]+nums[l];
                if(sum==target){
                    if(sum<=Integer.MIN_VALUE || sum>=Integer.MAX_VALUE){
                        return new ArrayList<>();
                    }
                    check.add(List.of(nums[i],nums[j],nums[k],nums[l]));
                    while(k<l && j<k && nums[k]==nums[k+1]) k++;
                    while(l>k && l<nums.length && nums[l] == nums[l-1]) l--;
                    k++; l--;
                }
                else if(sum<target){
                    k++;
                } else {
                    l--;
                }

            }
         }
        }
        return new ArrayList<>(check);
    }
}