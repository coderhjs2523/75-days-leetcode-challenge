// class Solution {
//     public String reverseWords(String s) {
//         StringBuilder sb = new StringBuilder();
//         String[] str = s.trim().split("\\s+");
//         for (int i = 0; i < str.length; i++) {
//             String temp = str[i];
//             sb.insert(0, temp);
//             sb.insert(0, ' ');
//         }
//         return sb.toString().trim();
//     }
// }


class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] str = s.trim().split("\\s+");

        for (int i = str.length - 1; i >= 0; i--) {
            sb.append(str[i]);

            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}