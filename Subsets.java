import java.util.ArrayList;  
import java.util.List;  

class Subsets {  
    public static List<List<Integer>> generateSubsets(int[] nums) {  
        List<List<Integer>> result = new ArrayList<>();  
        generateSubsetsHelper(nums, 0, new ArrayList<>(), result);  
        return result;  
    }  

    private static void generateSubsetsHelper(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {  
        if (index == nums.length) {  
            result.add(new ArrayList<>(current));  
            return;  
        }  
        current.add(nums[index]);  
        generateSubsetsHelper(nums, index + 1, current, result);  
        current.remove(current.size() - 1);  
        generateSubsetsHelper(nums, index + 1, current, result);  
    }  

    public static void main(String[] args) {  
        int[] nums = {1, 2, 3};  
        List<List<Integer>> subsets = generateSubsets(nums);  
        System.out.println(subsets);  
    }  
}
