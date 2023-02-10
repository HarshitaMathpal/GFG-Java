class Solution {
    public int maxInstance(String s) {
        // Code here
        int b = 0;
        int a = 0;
        int l = 0;
        int o = 0;
        int n = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'b') {
                b++;
            }
            else if (ch == 'a') {
                a++;
            }
            else if (ch == 'l') {
                l++;
            }
            else if (ch == 'o') {
                o++;
            }
            else if (ch == 'n') {
                n++;
            }
        }
        if (b == 0 || a == 0 || l == 0 || n == 0 || o == 0) {
            return 0;
        }
        int minSingleChar = Math.min(b, Math.min(a, n));
        int minDoubleChar = Math.min(l, o);
        minDoubleChar /= 2;
        return Math.min(minSingleChar, minDoubleChar);
    }
}
