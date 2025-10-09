
import java.util.HashMap;

public class FigletStyle {
    // main function that gets the ASCII value joins them and prints it...
    static HashMap<Character, String[]> alphabetMap = new HashMap<>();

    public static void main(String[] args) {

        loadAlphabet();

        if (args.length == 0) {
            System.out.println("Use: java FigletStyle <your_word>");
            return;
        }

        String input = String.join(" ", args).toUpperCase();

        printAscii(input);
    }

    // Function for all the letters that loads in the Hashmap
    static void loadAlphabet() {
        alphabetMap.put('A', new String[]{
            "  #  ",
            " # # ",
            "#   #",
            "#####",
            "#   #",
            "#   #",
            "#   #"
        });

        alphabetMap.put('B', new String[]{
            "#### ",
            "#   #",
            "#   #",
            "#### ",
            "#   #",
            "#   #",
            "#### "
        });

        alphabetMap.put('C', new String[]{
            " ####",
            "#    ",
            "#    ",
            "#    ",
            "#    ",
            "#    ",
            " ####"
        });

        alphabetMap.put('H', new String[]{
            "#   #",
            "#   #",
            "#   #",
            "#####",
            "#   #",
            "#   #",
            "#   #"
        });

        alphabetMap.put('E', new String[]{
            "#####",
            "#    ",
            "#    ",
            "#### ",
            "#    ",
            "#    ",
            "#####"
        });

        alphabetMap.put('L', new String[]{
            "#    ",
            "#    ",
            "#    ",
            "#    ",
            "#    ",
            "#    ",
            "#####"
        });

        alphabetMap.put('O', new String[]{
            " ### ",
            "#   #",
            "#   #",
            "#   #",
            "#   #",
            "#   #",
            " ### "
        });
    }

    // Function that print ASCII letters
    static void printAscii(String text) {
        int height = 7; 

        for (int row = 0; row < height; row++) {
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);

                if (ch == ' ') {
                    System.out.print("     ");
                } else {
                    String[] pattern = alphabetMap.get(ch);
                    if (pattern != null) {
                        System.out.print(pattern[row] + "  ");
                    } else {
                        System.out.print("?????  "); 
                    }
                }
            }
            System.out.println();
        }
    }
}
