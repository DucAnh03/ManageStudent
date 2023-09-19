package View;
import java.util.Arrays;
        
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author HP
 */

    public abstract class Menu {
    public Scanner sc = new Scanner(System.in);
    public String title;
    public ArrayList<String> options = new ArrayList<>();

    public Menu(String title, String[] op) {
        this.title = title;
        this.options.addAll(Arrays.asList(op));
    }

    public void menuDisplay() {
        System.out.println(title);
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + " - " + options.get(i));
        }
    }

    public int getChoice() {
        menuDisplay();
        int choice = sc.nextInt();
        return choice;
    }

    public void run() {
        while (true) {
            int choice = getChoice();
            execute(choice);
            if (choice > options.size() - 1) break;
        }
    }

    public abstract void execute(int n);
    
    
}
