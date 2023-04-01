import java.util.Hashtable;

/* This is a stub for the Library class */ 
public class Library extends Building {

      private Hashtable<String, Boolean> collection;

      public Library() {
      this.collection = new Hashtable<String, Boolean>();

      }

      public void addTitle(String title) {
      collection.put(title, true); 

      }

      public String removeTitle(String title) {
      return 
      }


      System.out.println("You have built a library: 📖");
    }


  
    public static void main(String[] args) {
      new Library();
    }


  
  }