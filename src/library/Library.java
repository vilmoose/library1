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
        String numberOfBooks = "";
        int numOfBooks = 0;
        String bookName = "";
        String authorName = "";
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
        readFile.close();
        } 
        else if(message == 2){
            PrintWriter fileOut = new PrintWriter( new FileWriter("database", true));
           
            boolean error = true;
            
            while(error){
                try{
            numberOfBooks = JOptionPane.showInputDialog("How many books would you like to add?");
            numOfBooks = Integer.parseInt(numberOfBooks);
            error = false;
                } 
                catch (Exception a){
                    JOptionPane.showMessageDialog(null, "Please enter a value");
                }
            
            for(int j =0; j < numOfBooks; j++){
                bookName = JOptionPane.showInputDialog("Enter the name of the book:"  );
                authorName = JOptionPane.showInputDialog("Enter the name of the author" );
                String newBooks = bookName + " " + authorName;
            //print new added books
            System.out.println(newBooks);
            
            fileOut.append(newBooks);
            fileOut.print(newBooks);
            }           
        }
          fileOut.close();  
            JOptionPane.showMessageDialog(null, "Thanks for adding to the library!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Error");
        }
       
        }
    
    }
