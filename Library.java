import java.util.Hashtable; 

/* This is a stub for the Library class */
public class Library extends Building { // Extends the Building class 

//Attributes 
private Hashtable<String, Boolean> collection; 

//Constructor 
    public Library (String name, String address, int nFloors, Hashtable<String, Boolean > collection) {
        super(name, address, nFloors);
        collection = new Hashtable<>(); 
        System.out.println("You have built a library: 📖");
    }

//Methods 
    public void addTitle(String title){
        if (!this.collection.containsKey(title)) {
            this.collection.put(title, true); 
        }
       else{
            throw new RuntimeException("We can't duplicate titles!"); 
       } 
    }

    public String removeTitle(String title){
        if (!this.collection.containsKey(title)){
            throw new RuntimeException("This book is not in the collection!"); 
        }
        this.collection.remove(title); 
        return title; 
    }

    public void checkOut(String title){ 
        if (!this.collection.containsKey(title)) {
            this.collection.replace(title, false); 
        }
        else {
            throw new RuntimeException("This book is already checked out!");    
        }
    }

    public void returnBook(String title){
        if (!this.collection.containsKey(title)) {
            this.collection.replace(title, true); 
        }
        else {
            throw new RuntimeException("This book was not checked out!"); 
        }
    } 

        // returns true if the title appears as a key in the Libary's collection, false otherwise
    public boolean containsTitle(String title){ 
        return this.collection.containsKey(title);
        } 

        // returns true if the title is currently available, false otherwise
    public boolean isAvailable(String title){
        return this.collection.get(title); 
        } 

         // prints out the entire collection in an easy-to-read way (including checkout status)
    public void printCollection(String title){
        
        }
    

    public static void main(String[] args) {
      new Library();
    }
  
  }