

public class ReverseInteger {

    public static int reverse(int x) {
        if (x == Integer.MIN_VALUE) {
            return 0;
        }
        int sign = 0;
        if (x < 0) {
            sign = -1;
        } else {
            sign = 1;
        }


        int imp = 0;
        x = Math.abs(x);
        while (x > 0) {
            int num = x % 10;
            if (imp > Integer.MAX_VALUE / 10 || (imp == Integer.MAX_VALUE / 10 && num > 7)) {
                return 0;
            }
            imp *= 10;
            imp = imp + num;
            x /= 10;
        }


        return imp * sign;

    }


    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
}
