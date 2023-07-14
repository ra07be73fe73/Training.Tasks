import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println("Hello Uxo!");
    }

    public static int[] twoSum(int[] nums, int target){
        int primeiro = 0;
        int segundo = 0;
        int[] devolve = new int[2];

        for (int i = 0; i < nums.length; i++ ){
            for(int j = i+1 ; j< nums.length; j++)
            {
                if(nums[i] + nums[j] == target){
                    primeiro = i;
                    segundo = j;
                }
            }
        }

        devolve[0]=primeiro;
        devolve[1]=segundo;

        return devolve;
    }

    public static int[] twoSumHash(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0 ; i < nums.length ; i++){
            int diferenca = target - nums[i];
            if (map.containsKey(diferenca)) {
                return new int[] {map.get(diferenca), i};
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("OH NHAO");
    }
}
