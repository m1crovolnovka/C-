import java.util.Comparator;
import java.util.*;

public abstract class Car {
    private String brand;
    private int cost;
    private int maxSpeed;
    private double fuelConsumption;

    public Car() {
    }

    public Car(String brand, int cost, int maxSpeed, double fuelConsumption) {
        this.cost = cost;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCost(){
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return getClass() .getName() + "[brand=" + brand + ",cost=" + cost + ",maxSpeed=" + maxSpeed + ", fuelConsumption="+ fuelConsumption+ "]";
    }
    @Override
    public int hashCode() {
        return Objects.hash(brand, cost, maxSpeed, fuelConsumption);
    }
    public abstract void displayInfo();

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null) {
            return false;
        }
        if ( getClass() != obj.getClass()) {
            return false;
        } else {
            Car tmp = (Car) obj;
            if (tmp.brand == this.brand && tmp.cost == this.cost && tmp.maxSpeed == this.maxSpeed && tmp.fuelConsumption == this.fuelConsumption) {
                return true;
            } else {
                return false;
            }
        }
    }
}

