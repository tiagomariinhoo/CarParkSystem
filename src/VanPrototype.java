public class VanPrototype extends VehiclePrototype{
    private double cargoVolume;
   
    public VanPrototype() {
        /*super(0, 0, new Date());
        this.cargoVolume = 0.0;*/
    }
    
    protected VanPrototype(VanPrototype vanPrototype){
        this.plateID = vanPrototype.getPlateID();
        //Continue
    }

    public String getPlateID() {
        return plateID;
    }

    public void setPlateID(String plateID) {
        this.plateID = plateID;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setEntryTime(DateTime entryTime) {
        this.entryTime = entryTime;
    }
    
    //setter for vehicle cargoVolume
    public void setCargoVolume(double volume){ 
        cargoVolume = volume;
    }
    
    //getter for vehicle cargoVolume
    public double getCargoVolume(){ 
        return cargoVolume;
    }

    @Override
    public VehiclePrototype clonar() {
        return new VanPrototype(this);
    }

}