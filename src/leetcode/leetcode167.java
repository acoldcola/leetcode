package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/4/22 22:40
 * @Version 1.0
 * 两数之和 II - 输入有序数组
 */
public class leetcode167 {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length -1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                return new int[] {i+1,j+1};
            }else if(numbers[i] + numbers[j] < target) {
                i++;
            }else {
                j--;
            }
        }
        return new int[0];
    }
}
