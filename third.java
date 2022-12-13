public class third {
    public static void main(String[] args) {
        int [] nums = {3,2,2,3};
        removeElement(nums, 2);
    }
    public static int []removeElement(int [] nums, int val) {
        int copyIndex = 0;
        for (int i = 0; i<nums.length; i++){
            while (nums[i]!=val){
                nums[copyIndex]=nums[i];
                copyIndex++;
            }
            while (copyIndex<nums.length){
                nums[copyIndex] = val;
                copyIndex++;
            }
        System.out.println(nums);
        }
    return nums;
    }
}
