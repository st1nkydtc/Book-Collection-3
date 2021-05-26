import java.util.HashMap;
import ecs100.*;

/**
 * holds a collection of books in a hashmap.
 * allows user to add find print or edit from a menu.
 * delete if we have time
 * prevent the user from adding a duplicate?
 *
 * @author (13DTC 3)
 * @version (May 2021)
 */
public class Books
{
    // instance variables - replace the example below with your own
    private HashMap<Integer, Book> booksMap; // declaring the HashMap
    private int currBookId; // store the current id of book being added
    
    
    /**
     * Constructor for objects of class Books
     */
    public Books()
    {
        // initialise instance variables
        booksMap = new HashMap<Integer, Book>(); // initialise HashMap
        
        // creating Books
        Book b1 = new Book(1, "Pet Semetary", "Stephen King", 76);
        Book b2 = new Book(2, "1984", "George Orwell", 66);
        Book b3 = new Book(3, "The subtle knife", "Phillip Pullman", 42);
        Book b4 = new Book(4, "The Subtle Art of Not Giving a F*ck", "Mark Mason", 99);
        
        // Add books to HashMap
        booksMap.put(1, b1);
        booksMap.put(2, b2);
        booksMap.put(3, b3);
        booksMap.put(4, b4);
        
        this.currBookId = 4;    // initialise the book id
        
        this.menu();
        
    }

    /**
     * Adds a book to the map
     */
    public void addBook() {
        final int MAX_QUANTITY = 99;
        int quantity = -1;
        
        // ask the user for details
        String name = UI.askString("Title; ");
        String author = UI.askString("Author: ");
        
        // check boundaries for the number of books added to the stock
        do {
            quantity = UI.askInt("Quantity: ");
        }while (0 > quantity || quantity > MAX_QUANTITY);
        
        // Incriment the book ID counter and add book to hashmap
        this.currBookId++;
        booksMap.put(currBookId, new Book(currBookId, name, author, quantity));
    }
    
    /**
     * Finds a book based on the id
     * Should refactor to find on name
     */
    public void findBook() {
        int bookId = UI.askInt("Id: ");     // Finds book on Id - change to title
        UI.println(booksMap.get(bookId).getName());
        
        
    }
    
   
    
    /**
     * Prints all books
     */
    public void printAll(){
        // Taversing map
        for (int bookId : booksMap.keySet()) {
            UI.println(bookId + " Details: ");
            UI.println(booksMap.get(bookId).getName() + " "
                    + booksMap.get(bookId).getAuthor() + " "
                    + booksMap.get(bookId).getQuantity());
        }
    }
    
    
    /**
     * Menu to print and call apropriate methods
     */
    public void menu ()
    {
        // print menu and force choice
        String choice;
        do {
            UI.println("(A)dd a book");
            UI.println("(F)ind a book");
            UI.println("(P)rint all");
            UI.println("(Q)uit");
            
            choice = UI.askString("Enter a choice: ");
            
            if (choice.equalsIgnoreCase("A")) {
                addBook();
                
            } else if (choice.equalsIgnoreCase("F")) {
                findBook();
            }else if (choice.equalsIgnoreCase("P")) {
                printAll();
            }else if (choice.equalsIgnoreCase("Q")) {
                UI.println("Goodbye!");
                UI.quit();
            }else {
                UI.println("Thats is not a choice you knucklehead!");
            }
        } while (!choice.equalsIgnoreCase("Q"));
    }
}
