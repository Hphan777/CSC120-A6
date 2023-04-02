import java.util.ArrayList;

/* This is a stub for the House class */
/**class that creates houses available for residents */
public class House extends Building {

  private ArrayList<String> residents;
  private boolean hasDiningRoom; 
  /**
   * constructor
   * @param name- name of the house
   * @param address- address of the house
   * @param nFloors- amount of floors of the house
   * @param hasDiningRoom- whther it has dining room
   */
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }

  /** Accessor for hasDiningRoom 
   * @return boolean on whether it has dining room
  */
  public boolean hasDiningRoom() {
    return this.hasDiningRoom;

  }

  /** Accessor for number of residents 
   * @returns amount of residents 
  */
  public int nResidents() {
    return this.residents.size();
  }
  /**
   * a method that moves in residents
   * @param name- name of the residents
   */
  public void moveIn(String name) {
    // check if this.residents contains name
    if (this.residents.contains(name)) {
      //   if so: throw and exception
      throw new RuntimeException(name + " is already a resident of " + this.name);
    }
    // if we're good to go, add to roster
    this.residents.add(name);
    System.out.println(name + " has just moved into " + this.name + "! Go say hello :-)");
  }

  /**
   * a method that offers the description regarding the house 
   */
  public String toString() {
    String description = super.toString();
    description += " There are currently " + this.nResidents() + " people living in this house.";
    description += " This house ";
    if (this.hasDiningRoom) {
      description += "has";
    } else {
      description += "does not have";
    }
    description += " an active dining room.";
    return description;
  }


  public static void main(String[] args) {
    House morrow = new House("Morrow", "The Quad", 4, false);
    System.out.println(morrow);
    morrow.moveIn("Jordan");
    morrow.moveIn("Jordan");
    System.out.println(morrow);
    House king = new House("King", "The Quad", 3, true);
    System.out.println(king);
  }

}