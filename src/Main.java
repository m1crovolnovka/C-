import java.util.*;

public class Main {


    public static void main(String[] args) {


        int buf;
        CarComparator ccomp = new CarComparator();
        List<Car> cars = new ArrayList<>();
        Economy ec = new Economy("",0,0,0);
        Comfort com = new Comfort("",0,0,0);
        Business bs = new Business("",0,0,0);

        cars.add(new Economy("Hyandai Solaris", 9800, 192, 7.0));
        cars.add(new Economy("Renault Logan", 10500, 180, 7.1));
        cars.add(new Comfort("Audi a4", 22000, 219, 8.8));
        cars.add(new Comfort("Chevrolet Malibu", 20000, 205, 6.3));
        cars.add(new Business("Audi a6", 31500, 250, 9.6));
        cars.add(new Business("Mercedes-Benz Maybach S-klasse", 65500, 286, 5.9));

        System.out.println(cars.equals((Car)ec));

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Что вы хотите сделать:\n1 - Вызвать такси.\n2 - Подсчитать стоимость автопарка.\n3 - Провести сортировку автомобилей парка по расходу топлива.\n4 - Найти автомобиль в компании, соответствующий заданному диапазону параметров скорости.\n5 - Добавить машины.\n6 - Просмотр таксопарка.\n7 - Выход. " );


            try {
                buf = scan.nextInt();
                if(buf <=0 || buf >7)
                    throw new UncorrectNumberException("Такого пункта не существует");
             switch (buf) {
                    case 1:
                        System.out.println("Какое такси вы хотите заказать:\n1 - Эконом.\n2 - Комфорт.\n3 - Бизнес.");
                        buf = scan.nextInt();
                        if(buf <=0 || buf >3)
                            throw new UncorrectNumberException("Такого пункта не существует");
                        switch (buf) {
                            case 1:
                                System.out.println("Выберете машину");
                                for (int i = 0; i < cars.size(); i++) {
                                    if (cars.get(i).getClass() == ec.getClass()) {
                                        System.out.println(i + " " + cars.get(i).getBrand());
                                    }
                                }
                                buf = scan.nextInt();
                                if(buf <0 || buf > cars.size() || cars.get(buf).getClass() != ec.getClass())
                                    throw new UncorrectNumberException("Такого пункта не существует");
                                System.out.println("Ваш автомобиль " + cars.get(buf).getBrand() + " на подходе");
                                break;
                            case 2:
                                System.out.println("Выберете машину");
                                for (int i = 0; i < cars.size(); i++) {
                                    if (cars.get(i).getClass() == com.getClass())
                                        System.out.println(i + " " + cars.get(i).getBrand());
                                }
                                buf = scan.nextInt();
                                if(buf <0 || buf > cars.size() || cars.get(buf).getClass() != com.getClass())
                                    throw new UncorrectNumberException("Такого пункта не существует");
                                System.out.println("Ваш автомобиль " + cars.get(buf).getBrand() + " на подходе");
                                break;
                            case 3:
                                System.out.println("Выберете машину");
                                for (int i = 0; i < cars.size(); i++) {
                                    if (cars.get(i).getClass() == bs.getClass())
                                        System.out.println(i + " " + cars.get(i).getBrand());
                                }
                                buf = scan.nextInt();
                                if(buf <0 || buf > cars.size() || cars.get(buf).getClass() != bs.getClass())
                                    throw new UncorrectNumberException("Такого пункта не существует");
                                System.out.println("Ваш автомобиль " + cars.get(buf).getBrand() + " на подходе");
                                break;
                        }
                        break;
                    case 2:
                        int cost = 0;
                        for (int i = 0; i < cars.size(); i++) {
                            System.out.print(cars.get(i).getCost());
                            cost += cars.get(i).getCost();
                            if (i < (cars.size() - 1)) {
                                System.out.print(" + ");
                            }
                        }
                        System.out.println(" = " + cost + "$");
                        break;
                    case 3:
                        cars.sort(ccomp);
                        for (int k = 0; k < cars.size(); k++) {
                            System.out.println(cars.get(k).toString());
                        }
                        break;
                    case 4:
                        int i = 0;
                        System.out.print("Введите параметры скорости которые вы хотите:\nОт ");
                        int from = scan.nextInt();
                        System.out.print("До ");
                        int before = scan.nextInt();
                        if( from <0 || before <0 || from >before)
                            throw new UncorrectNumberException("Вы ввели некорректные параметры скорости");
                        for (Car c : cars) {
                            if (c.getMaxSpeed() >= from && c.getMaxSpeed() <= before) System.out.println(c.toString());
                            else i++;
                            if (i == cars.size()) System.out.println("Таких машин нет!");
                        }
                        break;
                    case 5:
                        System.out.println("Сколько машин вы хотите добавить?");
                        int count = scan.nextInt();
                        if(count <= 0)
                            throw new UncorrectNumberException("Вы ввели отрицательное число");
                        for (int k = 0; k < count; k++) {
                            scan.nextLine();
                            System.out.println("Введите марку и модель машины");
                            String brand = scan.nextLine();
                            System.out.println("Введите стоимость машины");
                            int Cost = scan.nextInt();
                            if(Cost < 0)
                                throw new UncorrectNumberException("Вы ввели отрицательную стоимость");
                            System.out.println("Введите максимальную скорость");
                            int maxSpeed = scan.nextInt();
                            if(maxSpeed < 0)
                                throw new UncorrectNumberException("Вы ввели отрицательную скорость");
                            System.out.println("Введите расход топлива");
                            double fuelConsumption = scan.nextDouble();
                            if(fuelConsumption < 0)
                                throw new UncorrectNumberException("Вы ввели отрицательный расход топлива");
                            System.out.println("В какой класс вы хотите добавить машину?\n1 - Эконом.\n2 - Комфорт.\n3 - Бизнес.");
                            buf = scan.nextInt();
                            if(buf <=0 || buf >3)
                                throw new UncorrectNumberException("Такого пункта не существует");
                            switch (buf) {
                                case 1:
                                    cars.add(new Economy(brand, Cost, maxSpeed, fuelConsumption));
                                    break;
                                case 2:
                                    cars.add(new Comfort(brand, Cost, maxSpeed, fuelConsumption));
                                    break;
                                case 3:
                                    cars.add(new Business(brand, Cost, maxSpeed, fuelConsumption));
                                    break;
                            }
                        }
                        break;
                    case 6:
                        for (int k = 0; k < cars.size(); k++) {
                            System.out.println(cars.get(k).toString());
                        }
                        break;
                    case 7:
                        return;
                }

            }
            catch (NoSuchElementException ex){
                System.err.println("Неправильный тип вводимых данных");
                scan.nextLine();
            }
            catch (UncorrectNumberException ex){
                System.err.println(ex.getMessage());
            }

        }



        }
    }



