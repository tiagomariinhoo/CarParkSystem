
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ParkingSlotsMemento {
    private VehiclePrototype[] states = new VehiclePrototype[20];
    private List<Integer> states2;
    
    public ParkingSlotsMemento(){
    }
    
    public void setVehicleArray(VehiclePrototype[] vehicleArray, List<Integer> vehicleList){
        /*System.out.println("Vehicle array : ");
        System.out.println(Arrays.asList(vehicleArray));
        System.out.println("vehicle List : ");
        System.out.println(Arrays.asList(vehicleList));*/
        this.states = vehicleArray;
        this.states2 = vehicleList;
        /*System.out.println("States array : ");
        System.out.println(Arrays.asList(states));
        System.out.println("States2 List : ");
        System.out.println(Arrays.asList(states2));*/
    }
    
    public VehiclePrototype[] getUltimoSalvo(){
        System.out.println("Get ultimo array : ");
        System.out.println(Arrays.asList(states));
        return states;
    }
    
    public List<Integer> getUltimoInteger(){
        System.out.println("Get ultimo list : ");
        System.out.println(Arrays.asList(states2));
        return states2;
    }
    
}
