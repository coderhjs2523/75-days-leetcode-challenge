class Solution {
    public boolean isPalindrome(int x) {
        int copy = x,num=0;
        if(x>=0){
        while(x!=0){
            int rem = x%10;
            num = num *10+rem;
            x=x/10;
        }
        if(copy==num)return true;
        }
        return false;
    }
}