/* This is a stub for the Cafe class */
/**class that builds a Cafe */
public class Cafe extends Building {

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory
    /**
     * constuctor
     * @param name- name of the cafe
     * @param address- address of the cafe
     * @param nFloors- floors of the cafe
     * @param nCoffeeOunces- number of coffee
     * @param nSugarPackets- number of sugar packets
     * @param nCreams- number of creams
     * @param nCups- number of cups 
     */
    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams,int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups= nCups;
    }
    /**
     * a method that restocks the amount of things in the cafe
     * @param nCoffeeOunces- number of coffee to add
     * @param nSugarPackets- number of sugar packets to add
     * @param nCreams- number of creams to add
     * @param nCups- number of cups to add
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;
    } 
    /**
     * a method that decreases the amount of inventory by how is sold
     * @param size- amount of coffee to decrease
     * @param nSugarPackets- amount of sugar packets to decrease 
     * @param nCreams- amount of creams to decrease
     */

    private void sellCoffee(int size, int nSugarPackets, int nCreams) {
        if (this.nCoffeeOunces < 1){
            this.restock(100, nSugarPackets, nCreams, nCups);
        if (this.nSugarPackets < 1){
            this.restock(size, 100, nCreams, nCups);
        if (this.nCreams < 1) {
            this.restock(size, nSugarPackets, 100, nCups);
        if (this.nCups < 1);
            this.restock(size, nSugarPackets, nCreams, 100);
        }
            this.nCoffeeOunces =- size;
            this.nSugarPackets =- nSugarPackets;
            this.nCreams =- nCreams;
            this.nCups =- 1; 

        }
        }
    }

    public static void main(String[] args) {
        Cafe myCafe = new Cafe("Cookie Cafe", "Ben street", 4, 20, 20, 21, 23);
        myCafe.sellCoffee(20, 20, 20);
    }
    
}
