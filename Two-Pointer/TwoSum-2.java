import java.util.*;
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int last = numbers.length-1;
        ArrayList<Integer> i = new ArrayList<>();
        while(numbers[start] + numbers[last] != target){
            if(numbers[start] + numbers[last] < target){
                start++;
            }
            else if(numbers[start] + numbers[last] > target){
                last--;
            }
        }
        i.add(start+1);
        i.add(last+1);
        int[] result = new int[i.size()]; 
        for(int j=0; j<result.length; j++){
            result[j] = i.get(j);
        }
        return result;
    }
}