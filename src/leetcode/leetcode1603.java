package leetcode;

/**
 * @Author ZhangKe
 * @Date 2021/3/19 10:45
 * @Version 1.0
 */
public class leetcode1603 {
    class ParkingSystem {
        int a[] = new int[4];
        public ParkingSystem(int big, int medium, int small) {
            a[1] = big;
            a[2] = medium;
            a[3] = small;
        }

        public boolean addCar(int carType) {
            if (a[carType] > 0) {
                a[carType] --;
                return true;
            }
            return false;
        }
    }
}
