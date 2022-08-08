package JavaTry;
class Solution {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("adsad","sssss"));
    }
    public static String mergeAlternately(String word1, String word2) {
        int a = word1.length() > word2.length() ? word1.length() : word2.length();
        String result = "";
        for (int i = 0; i < a; i++) {
            if (i < word1.length()){
                result += word1.charAt(i);
            }
            if (i < word1.length()){
               result += word2.charAt(i);
            }
        }
    return result;
    }
    public String addBinary(String a, String b) {
            int x = a.length() - 1;
            int y = b.length() - 1;
            String result = "";
            int carry = 0;
            while (x >= 0 || y >= 0){
                int firstDigit = x >= 0 ? a.charAt(x--) - '0': 0;
                int secondDigit = y >= 0 ? b.charAt(y--) - '0': 0;
                int sum = firstDigit + secondDigit + carry;
                carry = sum / 2;
                result = sum % 2 + result;
              
            }
            if (carry == 1) result = 1 + result;
            return result;
        }
    public static int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
                result[i] = nums [nums[i]];
            }
        return result;
        }
    
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {
                if (n == 0) return;
                int last = m + n - 1;
                m = m - 1;
                n = n - 1;
                
                while (last >= 0) {
                    if (m >= 0 && n >= 0) {
                        if (nums1[m] > nums2[n]) {
                            nums1[last] = nums1[m--];
                        } else {
                            nums1[last] = nums2[n--];
                        }

                    } else if (m >= 0) {
                        nums1[last] = nums2[n--];
                    }
                    last--;
                }
            }
}
