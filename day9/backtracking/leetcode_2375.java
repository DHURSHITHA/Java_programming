class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder ans = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        // i goes from 1 to pattern.length()+1
        for (int i = 1; i <= pattern.length() + 1; i++) {
            st.push(i);
            // if end or pattern[i-1] is 'I'
            if (i == pattern.length() + 1 || pattern.charAt(i - 1) == 'I') {
                while (!st.isEmpty()) {
                    ans.append(st.pop());
                }
            }
        }
        return ans.toString();
    }
}
//push i into stack until we meet the I if we meet the I we pop all the existing elements in the stack pattern.charAt(i-1)==I this condittion is because we have additional 1 element at front and i==pattern.length is also the reason that over answer will have string.length+1 length
