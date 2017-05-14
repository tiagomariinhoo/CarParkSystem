
public class CarStrategy implements CalcStrategy {

    @Override
    public double CalcHours(int hours) {
        return (hours*1.5);
    }
    
}
