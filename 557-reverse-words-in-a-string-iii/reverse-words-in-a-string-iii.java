// class Solution {
//     public String reverseWords(String s) {
//         StringBuilder sb = new StringBuilder();
//         String[] str = s.split(" ");
//         for (int i = 0; i < str.length; i++) {

//             char[] chArray = str[i].toCharArray();
//             int start = 0;
//             int end = chArray.length - 1;

//             while (start < end) {
//                 char temp = chArray[start];
//                 chArray[start] = chArray[end];
//                 chArray[end] = temp;
//                 start++;
//                 end--;
//             }
//             sb.append(new String(chArray));

//             if (i != str.length - 1) {
//                 sb.append(" ");
//             }
//         }
//         return sb.toString();
//     }
// }

class Solution {
    public String reverseWords(String s) {
        char[] chArray = s.toCharArray();
        int start = 0;
        for (int i = 0; i <= chArray.length; i++) {

            if (i == chArray.length || chArray[i] == ' ') {
                int end = i - 1;

                while (start < end) {
                    char temp = chArray[start];
                    chArray[start] = chArray[end];
                    chArray[end] = temp;
                    start++;
                    end--;
                }
                start = i + 1;
            }
        }
        return new String(chArray);
    }
}
