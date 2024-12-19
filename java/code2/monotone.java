public class monotone {
    public boolean isMonotonic(int[] nums) {

        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < nums.length; ++i) {
            increasing &= nums[i] >= nums[i - 1];
            decreasing &= nums[i] <= nums[i - 1];
        }

        return increasing || decreasing;
    }

    public static void main(String[] args) {
        boolean monotonic = new monotone().isMonotonic(new int[]{1,2,2,3});
        System.out.println(monotonic);
    }

}
