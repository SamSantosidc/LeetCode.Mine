package leetCode;

class problem7 {
    public int reverse(int x) {
        int reverse = 0;

        while (x != 0) {
            int reminder = x % 10;

            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && reminder > 7)) return 0;
            if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && reminder < -8)) return 0;

            reverse = reverse * 10 + reminder;
            x = x / 10;
        }
        return reverse;
    }
}