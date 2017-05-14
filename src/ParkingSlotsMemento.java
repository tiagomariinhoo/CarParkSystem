
public class ParkingSlotsMemento {
    protected VehiclePrototype[] vehicleParkingSlots = new VehiclePrototype[20];
    
    public ParkingSlotsMemento(){
    
    }
    
    public void setVehicleArray(VehiclePrototype[] vehicleArray){
        this.vehicleParkingSlots = vehicleArray;
    }
    
    public VehiclePrototype[] getParkingSlots(){
        return vehicleParkingSlots;
    }
    
}
