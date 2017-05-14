
import java.util.ArrayList;
import java.util.Arrays;


public class ParkingSlotsCareTaker {
    private ArrayList<VehiclePrototype[]> states;

    public boolean isEmpty() {
        return states.isEmpty();
    }
    
    
    public ParkingSlotsCareTaker(){
        states = new ArrayList<VehiclePrototype[]>();
    }
    
    public void adicionarMemento(VehiclePrototype[] vehicleArray){
        states.add(vehicleArray);
    }
    
    public VehiclePrototype[] getUltimoSalvo(){
        if(states.size()<=0){
            return new VehiclePrototype[20];
        } else {
            VehiclePrototype[] vehicleArray = states.get(states.size()-1);
            System.out.println("Primerio array : ");
            System.out.println(Arrays.asList(vehicleArray));
            
            states.remove(states.size()-1);
            return vehicleArray;
        }
    }
    
}
