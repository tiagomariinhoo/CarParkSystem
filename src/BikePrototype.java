
public class BikePrototype extends VehiclePrototype {
	protected int bikeEngineSize;

	/*BikePrototype(String id, String brand, DateTime entryTime, int size) {
		super(id, brand, entryTime);
		this.bikeEngineSize = size;
	}*/
        
        BikePrototype(){
            
        }

        BikePrototype(BikePrototype bike) {
          
        }

    public int getBikeEngineSize() {
        return bikeEngineSize;
    }

    public void setBikeEngineSize(int bikeEngineSize) {
        this.bikeEngineSize = bikeEngineSize;
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

   

	// setter for vehicle engineSize
	public void setEngineSize(int size) {
		bikeEngineSize = size;
	}

	// getter for vehicle engineSize
	public int getEngineSize() {
		return bikeEngineSize;
	}

    @Override
    public VehiclePrototype clonar() {
        return new BikePrototype(this);
    }

}
