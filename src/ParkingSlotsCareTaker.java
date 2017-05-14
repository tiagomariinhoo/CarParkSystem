
import java.util.ArrayList;
import java.util.Arrays;


public class ParkingSlotsCareTaker {
    private ArrayList<VehiclePrototype[]> states;
    private ArrayList<ArrayList<Integer>> states2;

    public boolean isEmpty() {
        return states.isEmpty();
    }

    public int size() {
        return states.size();
    }
    
    
    public ParkingSlotsCareTaker(){
        states = new ArrayList<VehiclePrototype[]>();
        states2 = new ArrayList<ArrayList<Integer>>();
    }
    
    public void adicionarMemento(VehiclePrototype[] vehicleArray){
       // System.out.println("vehicleArray adicionar memento 1 : ");
       // System.out.println(Arrays.asList(vehicleArray));
        states.add(vehicleArray);
    }
    
    public void adicionarMemento2(ArrayList<Integer> value){
       // System.out.println("Value adicionar memento 2 : ");
       // System.out.println(Arrays.asList(value));
        states2.add(value);
    }
    
    public VehiclePrototype[] getUltimoSalvo(){
        if(states.size()<=0){
            return new VehiclePrototype[20];
        } else {
            VehiclePrototype[] vehicleArray = states.get(states.size()-2);
            
            states.remove(states.size()-2);
            return vehicleArray;
        }
    }
    
    public ArrayList<Integer> getUltimoInteger(){
        if(states2.size()<=0){
            return new ArrayList<Integer>();
        } else {
            
            ArrayList<Integer> value = states2.get(states2.size()-2);
           // System.out.println(Arrays.asList(value));
            states2.remove(states2.size()-2);
            return value;
        }
    } 
    
}
