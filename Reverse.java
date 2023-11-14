import java.util.Scanner;
class Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the word you want to reverse: ");
        String Word = s.nextLine();
       int length = Word.length();
       StringBuilder reversed = new StringBuilder();
       for (int i = length - 1; i >= 0; i--)
       {reversed.append(Word.charAt(i));
       }
        System.out.println("Original String: " + Word );
        System.out.println(" Reversed String: " + reversed.toString());
       
    }
}
