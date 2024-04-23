public class Comfort extends Car{
    public Comfort(String brand, int cost, int maxSpeed, double fuelConsumption){
        super(brand,cost,maxSpeed,fuelConsumption);
    }

    @Override
    public void displayInfo(){
        System.out.println("В комфорт-классе предъявляются требования не только к марке автомобиля, но и к году выпуска. Это машины с просторным салоном и большим багажником. Обязательное условие - наличие кондиционера. Такси класса комфорт подается быстрее. Выше уровень сервиса: водитель знает город, а не ездит по навигатору, а также он презентабельно одет, знает правила делового общения и этикет.");
    }
}