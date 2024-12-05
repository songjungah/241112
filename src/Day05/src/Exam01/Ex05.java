package Exam01;

public class Ex05 {
    public static void main(String[] args) {
        int[] nums1 = {10, 20, 30, 40}; // num1은 배열 공간의 시작 주소
        int[] nums2 = nums1;    // nums1이 가지고 있는 값을 nums2 에 대입

        nums2[1] = 22;
        System.out.printf("nums1[1]=%d%n", nums1[1]);
        System.out.printf("nums2[1]=%d%n", nums2[1]);
    }
}
