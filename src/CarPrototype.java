
public class CarPrototype extends VehiclePrototype{
	private int noOfDoors;
	private String carColor;
        
	/*public CarPrototype(String id, String brand, DateTime entryTime, int noOfDoors, String carColor) {
		super(id, brand, entryTime);
                this.noOfDoors = noOfDoors;
                this.carColor = carColor;
    
        }*/
        
        public CarPrototype(){
            //this.noOfDoors = 0;
            //this.carColor = "";
        }
        
        protected CarPrototype(CarPrototype car){
        }
        
        
        
	public int getNoOfDoors() {
		return noOfDoors;
	}
	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
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

    @Override
    public VehiclePrototype clonar() {
       
        return new CarPrototype(this);
    }
    
}
