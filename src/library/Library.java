/*
 *Vilmos Feher
 *04/04/2019
 *A library simulation where the books in the library are stored in an external 
 *file and it will read the books from there, and output information of a specific
 *book, if book is not available then the information can be entered and added to 
 *said file
 */

package library;
import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author vifeh1685
 */
public class Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int books[] = new int[100];
        String output;
        String input = JOptionPane.showInputDialog("Welcome to the library, pick one of the following options: \n"
                + " 1 to see our top 100 books. \n"
                + " 2 to add a book to the library.");
        int message = Integer.parseInt(input);
      
        if(message == 1){
            
        BufferedReader readFile = new BufferedReader(
                new FileReader("database"));
        for(int i= 0; i < 100; i++){
            output = readFile.readLine();
            System.out.println(output);
           }
        } 
        else if(message == 2){
        String instructions = JOptionPane.showInputDialog("The format for adding a new book is: \n"
                + "Name of the Book (with capital letters) "
                + "\n First name, Last name of the author");
    }
        
    }
    public static int RandomBook(){
        int random = (int) (Math.random() * 100);
        
        return random;
         }
    }
