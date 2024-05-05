public class StringPlayground {
    public static int countParentheses(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] testStrings = {
                "((3 + 7) * 2)", // Balanced
                "((3 + 7) * 2))", // Unbalanced
                "((3 + 7) * 2))(", // Unbalanced
                "", // Empty
                "((((((", // Unbalanced
                "))))))", // Unbalanced
                "()" // Balanced
        };

        for (String s : testStrings) {
            int result = countParentheses(s);
            System.out.println("String: \"" + s + "\", Parentheses Count: " + result);
        }
    }
}
