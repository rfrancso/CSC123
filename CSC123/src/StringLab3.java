//Francisco Rodriguez (frodriguez127@toromail.csudh.edu)

public class StringLab3 {
   public static void main(String[] args) {
      // Creating a string object
      String str = "Hello, World!";
      
      // Length of the string
      int len = str.length();
      System.out.println("Length of the string: " + len);
      
      // Concatenating two strings
      String str2 = str.concat(" How are you?");
      System.out.println("Concatenated string: " + str2);
      
      // Checking if a string contains another string
      boolean contains = str.contains("World");
      System.out.println("Does the string contain 'World'? " + contains);
      
      // Converting string to lower-case
      String lowerStr = str.toLowerCase();
      System.out.println("Lower-case string: " + lowerStr);
      
      // Replacing a substring with another string
      String replacedStr = str.replace("World", "Universe");
      System.out.println("Replaced string: " + replacedStr);
   }
}
