public class PalindromeChecker {
    // Attribute
    private String text;
    
    // Constructor
    public PalindromeChecker(String text) {
        this.text = text;
    }
    
    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        // Remove spaces and convert to lowercase for comparison
        String cleanedText = text.replaceAll("\\s+", "").toLowerCase();
        
        int left = 0;
        int right = cleanedText.length() - 1;
        
        while (left < right) {
            if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    // Method to display the result
    public void displayResult() {
        System.out.println("Text: \"" + text + "\"");
        if (isPalindrome()) {
            System.out.println("Result: The text is a palindrome.");
        } else {
            System.out.println("Result: The text is not a palindrome.");
        }
        System.out.println("------------------------");
    }
    
    // Main method to test the class
    public static void main(String[] args) {
        // Creating palindrome checker objects
        PalindromeChecker checker1 = new PalindromeChecker("racecar");
        PalindromeChecker checker2 = new PalindromeChecker("hello");
        PalindromeChecker checker3 = new PalindromeChecker("A man a plan a canal Panama");
        PalindromeChecker checker4 = new PalindromeChecker("madam");
        
        // Displaying results
        checker1.displayResult();
        checker2.displayResult();
        checker3.displayResult();
        checker4.displayResult();
    }
}