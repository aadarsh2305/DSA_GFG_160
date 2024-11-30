package Strings;

public class AddBinaryStrings {
    public String addBinary(String s1, String s2) {
        int s1_index = s1.length() - 1;
        int s2_index = s2.length() - 1;
        StringBuilder result = new StringBuilder();
        
        int carry = 0;
        
        while (s1_index >= 0 || s2_index >= 0 || carry > 0) {
            int bit1 = s1_index >= 0 ? s1.charAt(s1_index) - '0' : 0;
            int bit2 = s2_index >= 0 ? s2.charAt(s2_index) - '0' : 0;
            
            int sum = bit1 + bit2 + carry;
            result.append(sum % 2);
            carry = sum / 2;
            
            s1_index--;
            s2_index--;
        }
        
        String finalResult = result.reverse().toString();
        
        int i = 0;
        while (i < finalResult.length() && finalResult.charAt(i) == '0') {
            i++;
        }
        
        return i == finalResult.length() ? "0" : finalResult.substring(i);
    }

    public static void main(String[] args) {
        AddBinaryStrings solution = new AddBinaryStrings();
        
        // Example test cases
        String s1 = "1010"; // binary string 1
        String s2 = "1011"; // binary string 2
        
        String result = solution.addBinary(s1, s2);
        
        System.out.println("Sum of " + s1 + " and " + s2 + " is: " + result);
        
        // You can test with more examples
        String s1_2 = "1101"; // binary string 1
        String s2_2 = "100";  // binary string 2
        
        String result2 = solution.addBinary(s1_2, s2_2);
        
        System.out.println("Sum of " + s1_2 + " and " + s2_2 + " is: " + result2);
    }
}

