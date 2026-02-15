class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0; // The carry from the previous addition

        // Loop from the end of both strings towards the beginning
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            // Add the bit from the first string if available
            if (i >= 0) {
                // Subtract '0' to convert the character '1' or '0' to its integer value (1 or 0)
                sum += a.charAt(i--) - '0';
            }

            // Add the bit from the second string if available
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }

            // Append the current bit of the result (sum % 2 gives the remainder)
            result.append(sum % 2);

            // Update the carry for the next iteration (sum / 2 gives the carry)
            carry = sum / 2;
        }

        // The result is built in reverse order, so it needs to be reversed
        return result.reverse().toString();
    }
}
