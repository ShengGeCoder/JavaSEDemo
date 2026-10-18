package day;

/**
 * @Auther: YS
 * @Date: 2026/10/10 17:00
 * @Description: IntelliJ IDEA
 * @Version: 1.0
 */
public class day8 {
    //    start
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] temp = new int[nums.length];
        int i = 0;
        int j = 0;

        for(i = 0; i < nums.length; i++){
            for(j = (i+1); j < nums.length; j++){
                if(target == (nums[i] + nums[j])){
                    temp[0] = i;
                    temp[1] = j;
                    System.out.println(temp[0] + " " + temp[1]);
                    break;
                }

            }
        }
    }
    //    end

    //    start
    //    end

    //    start
    //    end

    //    start
    //    end


}
