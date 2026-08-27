class Solution {

    public int reverse(int x) {

        long y = 0;
        int z = 0;
        int count = 0;

        int temp = x;

        if ( temp < 0 ) {
            temp = -temp;
        }

        while ( temp > 0 ) {
            temp = temp / 10;
            count++;
        }

        temp = x;

        if ( temp < 0 ) {
            temp = -temp;
        }

        while ( count > 0 ) {
            z = temp % 10;
            y += z * (long)Math.pow(10, count - 1);
            temp = temp / 10;
            count--;
        }

        if ( x < 0 ) {
            y = -y;
        }
        if ( y > Integer.MAX_VALUE || y < Integer.MIN_VALUE ) {
            return 0;
        }

        return (int)y;
    }
}