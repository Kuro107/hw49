import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        HashMap<Integer,String> cars = new HashMap<>();

        for (int i=0; i<10; i++){
            Car car = new Car(i,random.toString());
            cars.put(car.getID(),car.getName());
        }
        for (Integer i : cars.keySet()
             ) {
            System.out.println(i+ " "+cars.get(i));

        }


        }
    }
