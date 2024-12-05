package Exam01;

public class Ex06 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50, 60};

        System.out.printf("nums.length=%d%n", nums.length);

        for (int i = 0; i < nums.length; i++){  // 관례적으로 많이 쓰는 방식
            System.out.println(nums[i]);

        /*
        for (int i = 0; i <= nums.length - 1; i++){     // 배열 공간의 갯수
            System.out.println(nums[i]);
            }
         */

        /*
        for (int i = 0; i <= 3; i++){
            System.out.println(nums[i]);
        } */
        }
    }
}
