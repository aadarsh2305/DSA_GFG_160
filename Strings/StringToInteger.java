package Strings;

class StringToInteger {
    public int myAtoi(String s) {
        // Trim leading and trailing whitespaces
        s = s.trim();
        
        // If the string is empty, return 0
        if(s.isEmpty()) return 0;
        
        int sign = 1, start = 0, result = 0;
        
        // Check for a sign at the beginning
        if(s.charAt(0) == '-') {
            sign = -1;
            start = 1;
        } else if(s.charAt(0) == '+') {
            start = 1;
        }
        
        // Process each character
        for(int i = start; i < s.length(); i++) {
            char c = s.charAt(i);
            // Break if we encounter a non-digit character
            if(c < '0' || c > '9') break;
            
            // Convert character to its corresponding digit
            int digit = c - '0';
            
            // Check for overflow or underflow before adding the digit
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            // Accumulate the result
            result = result * 10 + digit;
        }
        
        // Return the result with the appropriate sign
        return result * sign;
    }

    public static void main(String[] args) {
        // Create an instance of StringToInteger
        StringToInteger converter = new StringToInteger();
        
        // Test cases
        System.out.println(converter.myAtoi("-123"));              // Output: -123
        System.out.println(converter.myAtoi("  -"));               // Output: 0
        System.out.println(converter.myAtoi(" 1231231231311133")); // Output: 2147483647 (overflow)
        System.out.println(converter.myAtoi("-999999999999"));    // Output: -2147483648 (underflow)
        System.out.println(converter.myAtoi("  -0012gfg4"));      // Output: -12
        System.out.println(converter.myAtoi("abc123"));           // Output: 0 (invalid input)
        System.out.println(converter.myAtoi("123abc456"));        // Output: 123 (ignores non-digit characters)
    }
}

