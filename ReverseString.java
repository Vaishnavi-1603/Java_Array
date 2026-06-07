/* public class Strings {
    public static void main(String[] args) {
        String s = "Java";
        s.concat(" Programming");
        System.out.println(s); // Output: Java    
    }
    
}
 */

/* public class Strings {
    public static void main(String[] args) {
       String a = new String("Hello");
        String b = new String("Hello");

        System.out.println(a == b); // Output: false
        System.out.println(a.equals(b)); // Output: true  
    }
    
} */

/*     public class CountVowels {
    public static void main(String[] args) {
        String str = "Education";
        int count = 0;
  
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }

        System.out.println("Number of vowels in the string: " + count);
         
    }
} */


    public class ReverseString {
    public static void main(String[] args) {
        String str = "Kgisl";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);
    }
}

//palindrome strings, count words, anagrams, string compression, longest common prefix, longest palindromic substring, string permutations, string rotations, string matching algorithms (KMP, Rabin-Karp), string hashing, string tokenization, string manipulation (substring, replace, split), string formatting (printf, String.format), string immutability and memory management.