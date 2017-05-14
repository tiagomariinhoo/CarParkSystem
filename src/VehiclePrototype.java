
import java.util.logging.Level;
import java.util.logging.Logger;


abstract public class VehiclePrototype {
	protected String plateID;
	protected String brandName;
	protected DateTime entryTime;
        protected CalcStrategy calcStrategy;

	// constructor
	VehiclePrototype(String id, String brand, DateTime entryTime) {
		this.plateID = id;
		this.brandName = brand;
		this.entryTime = entryTime;
	}
        VehiclePrototype(){
            
        }
        
        public abstract VehiclePrototype clonar();

	public String getPlateID() {
		return plateID;
	}

        public CalcStrategy getStrategy() {
            return calcStrategy;
        }

        public void setStrategy(CalcStrategy calcStrategy) {
            this.calcStrategy = calcStrategy;
        }
        
        public double calcValue(int hours){
            return calcStrategy.CalcHours(hours);
        }


        
	// setter for vehicle idPlate
	public void setPlateID(String id) {
		this.plateID = id;
	}

	public String getBrandname() {
		return brandName;
	}

	// setter for vehicle brandName
	public void setBrandName(String brand) {
		this.brandName = brand;
	}

	public String getEntryTime() {
		return entryTime.getHours() + " : " + entryTime.getMins() + " " + entryTime.getDay() + " / " + entryTime.getMonth()
				+ " / " + entryTime.getYear();
	}

	public void setEntryTime(DateTime entryTime) {
		this.entryTime = entryTime;
	}

	public DateTime getEntryTimeObject() {
		return entryTime;
	}


}
