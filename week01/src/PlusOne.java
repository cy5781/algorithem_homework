public class PlusOne {

    //力扣 one plus https://leetcode-cn.com/problems/plus-one/
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = (digits[i] + 1) % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[digits.length +1];
        digits[0] =1;
        return digits;
    }

//    public static void main(String[] args) {
//        int [] digits= {1,2,3};
//        System.out.println(plusOne(digits));
//    }
}
