package auto;

import java.util.Arrays;

public class auto_proov {
    public static void main(String[] args) {
        //konstruktorisse numbrimärk, mark, värv, aasta
        //meetodid: ylevaatus(), accelerate(int), brake(int)
        Auto car = new Auto("123BCD", "BMW", "sinine", 2010);
        System.out.println(car);
        System.out.println("Sinu auto värv " + car.getColor());
        System.out.println("Auto valmistati " + car.getYear() + ". aastal - " + (2018 - car.getYear()) + " aastat vana.");
        System.out.println(car.ylevaatus());
        car.accelerate(20);
        car.accelerate(7);
        System.out.println("Auto kiirus: " + car.speed);
        car.brake(8);
        System.out.println("Auto kiirus: " + car.speed);

    }
}