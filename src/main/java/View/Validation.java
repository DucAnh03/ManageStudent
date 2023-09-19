package View;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Validation {
    public final Scanner in = new Scanner(System.in);

	
	public int checkInputIntLimit(int min, int max) {
		
		while (true) {
			try {
				int result = Integer.parseInt(in.nextLine().trim());
				if (result < min || result > max) {
					throw new NumberFormatException();

				}
				return result;
			} catch (NumberFormatException e) {
				System.err.println("Please input number in rage [" + min + ", " + max + "]");
				System.out.print("Enter again: ");
			}
		}
	}

	
	public String checkInputString() {
		// loop until user input correct
		while (true) {
			String result = in.nextLine().trim();
			if (result.isEmpty()) {
				System.err.println("Not empty");
				System.out.print("Enter again: ");
			} else {
				return result;
			}
		}
	}

	


	
	public boolean checkInputUD() {
		
		while (true) {
			String result = checkInputString();
			// return true if user input u/U
			if (result.equalsIgnoreCase("U")) {
				return true;
			}
			// return false if user input d/D
			if (result.equalsIgnoreCase("D")) {
				return false;
			}
			System.err.println("Please input u/U or d/D.");
			System.out.print("Enter again: ");
		}
	}

	
	public String checkInputCourse() {
		
		while (true) {
			String result = checkInputString();
			// check input course in java/ .net/ c/c++
			if (result.equalsIgnoreCase("java") || result.equalsIgnoreCase(".net")
					|| result.equalsIgnoreCase("c/c++")) {
				return result;
			}
			System.err.println("There are only three courses: Java, .Net, C/C++");
			System.out.print("Enter again: ");
                }
        }
}
    

