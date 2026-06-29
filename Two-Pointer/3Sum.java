import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        //-4,-1,-1,0,1,2
        List<List<Integer>> map = new ArrayList<>();
        for(int x = 0; x<nums.length; x++){
            int y=x+1; int z = nums.length-1;
            if (x > 0 && nums[x] == nums[x - 1]) continue;
            while(y<z){
                int sum = nums[x] + nums[y] + nums[z];
                if(sum==0){
                    // map.add(x);
                    // map.add(y);
                    // map.add(z);
                    map.add(List.of(nums[x],nums[y],nums[z]));
                    while (y < z && nums[y] == nums[y + 1]) y++;
                    while (z > y && nums[z] == nums[z - 1]) z--;
                    y++;
                    z--;
                }
                else if(sum<0){
                    y++;
                } else{
                    z--;
                }
            }
        }
        return new ArrayList<>(map);
    }
}