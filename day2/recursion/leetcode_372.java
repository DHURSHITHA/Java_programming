class Solution {

    int mod = 1337;

    int func(int a, long b) {
        a %= mod;

        if (b == 0) return 1;   // missing base case
        if (b == 1) return a;

        long half = func(a, b / 2)%mod;
        long full = (half * half) % mod;

        if (b % 2 != 0) {
            full = (full * a) % mod;   // multiply by a, not 2
        }

        return (int) full;
    }

    public int superPow(int a, int[] b) {
        a = a % mod;

        int result = 1;

        for (int digit : b) {
            // result = (result^10 * a^digit) % mod
            result = func(result, 10);    // your recursive power
            result = (result * func(a, digit)) % mod;
        }

        return result;
    }
}
