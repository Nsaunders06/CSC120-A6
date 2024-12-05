/* This is a stub for the Cafe class */
public class Cafe extends Building { // Extends the Building class

// Attributes 
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory
//Constructor 
    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces; 
        this.nSugarPackets = nSugarPackets; 
        this.nCreams = nCreams; 
        this.nCups = nCups; 
        System.out.println("You have built a cafe: ☕");
    }
//Methods 
    public void sellCoffee(int size, int nSugarPackets, int nCreams, int nCups){
        nCoffeeOunces = nCoffeeOunces - size; 
        nSugarPackets = this.nSugarPackets - nSugarPackets; 
        nCreams = this.nCreams - nCreams; 
        nCups = this.nCups - 1; 
    }

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) { 
        
    }
    public static void main(String[] args) {
        new Cafe();
    }
    
}
