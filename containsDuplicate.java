public class containsDuplicate {

      public boolean containsDuplicate1(int[] nums) { // Brute force approach
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean containsDuplicate2(int[] nums) { // Sorting approach
        java.util.Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }

        return false;
    }

    public boolean containsDuplicate3(int[] nums) { // HashSet approach
        java.util.HashSet<Integer> seen = new java.util.HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }

        return false;
    }

    
    public boolean containsDuplicate4(int[] nums){ // HashSet Length Comparison
        return java.util.Arrays.stream(nums).distinct().count() < nums.length;
    }
}