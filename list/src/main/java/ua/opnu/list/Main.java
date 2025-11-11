package ua.opnu.list;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog("Рекс");
        Animal myCat = new Cat("Мурчик");

        System.out.println(myDog.getName() + " каже: " + myDog.makeSound());
        System.out.println(myCat.getName() + " каже: " + myCat.makeSound());

        System.out.println("-------------------------------------");

        Movable p = new Point(1.0, 2.0);
        System.out.println("Початкова позиція: " + p);

        p.moveTo(5.5, 10.0);
        System.out.println("Нова позиція: " + p);

        System.out.println("Поточна X: " + p.getX());

        System.out.println("-------------------------------------");

        Smartphone myPhone = new Smartphone();

        double[] coords = myPhone.getCoordinates();
        System.out.println("Координати: " + coords[0] + ", " + coords[1]);

        myPhone.makeCall();
        myPhone.receiveCall();

        System.out.println("-------------------------------------");

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(20000, 2018, 150));
        cars.add(new Car(15000, 2020, 180));
        cars.add(new Car(20000, 2018, 140));
        cars.add(new Car(20000, 2019, 130));

        System.out.println("До сортування:");
        for (Car car : cars) {
            System.out.println(car);
        }

        Collections.sort(cars);

        System.out.println("\nПісля сортування (від 'більшого' до 'меншого'):");
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
