public class Economy extends Car{
    public Economy(String brand, int cost, int maxSpeed, double fuelConsumption){
        super(brand,cost,maxSpeed,fuelConsumption);
    }
    @Override
    public void displayInfo(){
        System.out.println("Эконом-такси - такси, оснащённое по минимуму, что позволяет клиенту не переплачивать за те услуги, которые ему не важны.");
    }
}
