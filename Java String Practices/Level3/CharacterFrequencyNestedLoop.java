/*
Write a program to find the frequency of characters in a string using nested loops and display the result
Hint => 
Create a method to find the frequency of characters in a string and return the characters and their frequencies in a 1D array. The logic used here is as follows:
Create an array to store the frequency of each character in the text and an array to store the characters in the text using the toCharArray() method
Loops to Find the frequency of each character in the text and store the result in a frequency array. For this use a Nested Loop with an Outer loop to iterate through each character in the text and initialize the frequency of each character to 1. And an Inner loop to check for duplicate characters. In case of duplicate increment the frequency value and set the duplicate characters to '0' to avoid counting them again.
Create a 1D String array to store the characters and their frequencies. For this Iterate through the characters in the text and store the characters and their frequencies 
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 
*/
import java.util.Scanner;
public class CharacterFrequencyNestedLoop {
    public static String[] charFrequencyNested(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
            for (int j = 0; j < i; j++) {
                if (chars[i] == chars[j]) {
                    freq[i] = 0;
                    break;
                }
            }
            if (freq[i] != 0) {
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        freq[i]++;
                        chars[j] = '0';
                    }
                }
            }
        }
        int count = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0 && chars[i] != '0') count++;
        }
        String[] result = new String[count];
        int idx = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0 && chars[i] != '0') {
                result[idx++] = chars[i] + " : " + freq[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String[] freq = charFrequencyNested(text);
        System.out.println("Character : Frequency");
        for (String s : freq) {
            System.out.println(s);
        }
        sc.close();
    }
}
