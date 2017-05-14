
interface CarParkManager {

	public abstract void addVehicle(); //public abstract methods held by the interface

	public abstract void deleteVehicle();

	public abstract void displayCurrentList();

	public abstract void printStatistics();

	public abstract void displayPerDayList();

	public abstract void displayParkingCharges();
        
        public abstract void CareTaker();
        
        public abstract void Undo();
}