class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        boolean [] check = new boolean[128];
        char [] arr1 = jewels.toCharArray();

        for(int i=0;i<arr1.length;i++){
            check[arr1[i]] = true;
        }

        char [] arr2 = stones.toCharArray();
        int count =0;
        for(int i=0;i<arr2.length;i++){
            if(check[arr2[i]])count++;
        }

        return count;


    //     int count = 0;
    //     for (int i = 0; i < stones.length(); i++) {
    //         char ch = stones.charAt(i);
    //         if (jewels.indexOf(ch) != -1)
    //             count++;
    //     }
    //     return count;
    }
}