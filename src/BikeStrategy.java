
public class BikeStrategy implements CalcStrategy{

    @Override
    public double CalcHours(int hours) {
        return (hours*0.5);
    }
    
}
