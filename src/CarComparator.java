import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

    public int compare(Car a,Car b){

        if(a.getFuelConsumption()> b.getFuelConsumption())
            return 1;
        else if(a.getFuelConsumption()< b.getFuelConsumption())
            return -1;
        else
            return 0;
    }
}