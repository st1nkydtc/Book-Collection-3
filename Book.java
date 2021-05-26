    import ecs100.*;
    /**
     * Support class for book
     * A book contains an id, name, quantity, image
     *
     * @author 13DTC 3
     * @version May 2021
     */
    public class Book
    {
        // instance variables - replace the example below with your own
        private int id;
        private String name;
        private String author;
        private int quantity;
        private String image;
        static final String DEFAULT_IMAGE = "book.png";
        
        private double locX, locY;
        
        /**
         * Constructor for objects of class Book
         */
        public Book(int id, String nm, String auth, int qty, String img)
        {
            // initialise instance variables
            this.id = id;
            this.name = nm;
            this.author = auth;
            this.quantity = qty;
            this.image = img;
            
        }
        
        /**
         * Constructor overloading
        */
        public Book(int id, String nm, String author, int qty) {
           this(id, nm, author, qty, DEFAULT_IMAGE);
        }
        
    
        /**
         * Getter for id
         *
         * @param  y  a sample parameter for a method
         * @return    the int id
         */
        public int getID()
        {
            return(this.id);
        }
        
        /**
         * Getter for name
         *
         * @param  y  a sample parameter for a method
         * @return    the name string
         */
        public String getName()
        {
            return(this.name);
        }
        
        /**
         * Getter for author
         *
         * @param  y  a sample parameter for a method
         * @return    the author
         */
        public String getAuthor()
        {
            return(this.author);
        }
        
        /**
         * Getter for quantity
         *
         * @param  y  a sample parameter for a method
         * @return    the int quantity
         */
        public int getQuantity()
        {
            return(this.quantity);
        }
        
        /**
         * Display our image on our GUI
         * 
         */
        public void displayBook() {
            final double WIDTH = 100;
            final double HEIGHT = 100;
        
            UI.drawImage(this.image, locX, locY, WIDTH, HEIGHT);
        
    }
}
