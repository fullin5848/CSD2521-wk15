// Nathaniel Fullington
// 4/20/20

package ch13_ex1_nameparser;

public class Ch13_ex1_NameParser {

    // Use the .split() to separate a user entered name into an array and display it.
    public static void main(String[] args) {
        
        // Determine how many names the user entered and display a message accordingly.
        boolean isValid = false;
        while(isValid == false) {
            String name = Validator.getString("Enter a name: ");
            
            String[] names = name.split(" ");
            System.out.println("");
            
            if (names.length == 2) {
                System.out.println("First Name: " + names[0]);
                System.out.println("Last Name: " + names[1]);
                isValid = true;
            }
            else if (names.length == 3) {
                System.out.println("First Name: " + names[0]);
                System.out.println("Middle Name: " + names[1]);
                System.out.println("Last Name: " + names[2]);
                isValid = true;
            }
            else {
                System.out.println("Invalid entry, please enter a valid name. ");
            }
        }
    }
}
