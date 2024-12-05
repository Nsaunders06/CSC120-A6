import java.util.ArrayList; 

/* This is a stub for the House class */
public class House extends Building { // Extends the building class 
// Attributes 
    private static ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
    private boolean hasDiningRoom; // hasDiningRoom assess if the house has a dining room 

//Constructor 
    public House ( String name, String address, int nFloors, Boolean hasDiningRoom) {
        super(name, address, nFloors);
        this.hasDiningRoom = hasDiningRoom; 
        House.residents= new ArrayList<String>(); 
        System.out.println("You have built a house: 🏠");
        }

//Getters 
    //Getter for hasDiningRoom 
    public Boolean gethasDiningRoom(){
        return this.hasDiningRoom;
    }
    //Getter for nResidents 
    public Integer nResidents(){
        return this.nResidents();
    }


//Methods 
    public static void moveIn(String resident) {
        residents.add(resident);

    }
        
    public static void moveOut(String resident) {
        residents.remove(resident); 
    }

    public boolean isResident(Boolean resident){
        residents.contains(resident); 
        return resident; 
    }

        public static void main(String[] args) {
          House capen = new House( "Capen", "26 prospect st", 3, false);
          System.out.println("You built a house at " + capen.address + ". It is " + capen.hasDiningRoom + " that there is a dining room in " + capen.name + " There are " + capen.residents.size() + " residents on the " + capen.nFloors + " floors. "); 
          moveIn("Nina"); 
          moveIn("Ada"); 
          System.out.println(residents);
        }
      
      }
