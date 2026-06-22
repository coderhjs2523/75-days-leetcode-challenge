class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        if (check(digits)) {
            int[] arr = new int[n + 1];
            int newl = n + 1;
            for (int i = 1; i < newl; i++)arr[i] = digits[i - 1];
            arr[0] = 0;
            return add(arr);
        } else return add(digits);
    }
    public static int[] add(int[] arr){
        int n = arr.length;
        if (arr[n - 1] != 9) {
            arr[n - 1]++;
            return arr;
        } else {
            int carry = 1, num = 0;
            for (int i = n - 1; i >= 0; i--) {
                num = arr[i] + carry;
                carry = num / 10;
                arr[i] = num % 10;
            }
        }
        return arr;
    }

    public static boolean check(int[] brr) {
        for (int i = 0; i < brr.length; i++) {
            if (brr[i] != 9)
                return false;
        }
        return true;
    }
}