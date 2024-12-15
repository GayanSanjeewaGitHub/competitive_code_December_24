import java.util.HashMap;

  class Goodpair {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> numCount = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            if (numCount.containsKey(num)) {
                count += numCount.get(num);
                numCount.put(num, numCount.get(num) + 1);
            } else {
                numCount.put(num, 1);
            }
        }
        return count;
    }


    public static void main(String[] args) {
       int count =  new Goodpair().numIdenticalPairs(new int[]{1,2,3,1,1,3});
        System.out.println(count);
    }
}
