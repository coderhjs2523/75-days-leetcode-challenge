class Solution {
    public int gcdOfOddEvenSums(int n) {
        int i = 1;
        int EvenNum = 2;
        int OddNum = 1;
        int EvenSum = 0;
        int OddSum = 0;
        while (i < n) {
            EvenNum += 2;
            OddNum += 2;
            EvenSum += EvenNum;
            OddSum += OddNum;
            i++;
        }
        int num = (EvenSum > OddSum) ? OddSum : EvenSum;
        for (int k = num; k >= 1; k--) {
            if (EvenSum % k == 0 && OddSum % k == 0)
                return i;
        }
        return 1;
    }
}