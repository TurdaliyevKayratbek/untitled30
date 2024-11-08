import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input word; ");
        String word=scanner.nextLine();
        String res=checkforWord(word);

        System.out.println(res);

    }
    public static String checkforWord(String word){
        word=word.trim().toUpperCase();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'B') {
                return word.substring(0, i);
            }
        }
        return "No";
    }
}