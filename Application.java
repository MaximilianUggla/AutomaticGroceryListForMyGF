package AutomaticGroceryListForMyGF;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        List<String[]> allRecipies = new ArrayList<>(); 

        File f = new File("Recipies.txt");
        Scanner scan = new Scanner(f);
        while (scan.hasNextLine()) {
            String in = scan.nextLine();
            allRecipies.add(in.split(" "));
        }
    }
}
