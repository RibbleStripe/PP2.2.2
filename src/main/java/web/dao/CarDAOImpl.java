package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAOImpl implements CarDAO{
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(1,"Opel", "white"));
        cars.add(new Car(2,"BMW", "black"));
        cars.add(new Car(3,"Renault", "red"));
        cars.add(new Car(4,"Volvo", "brown"));
        cars.add(new Car(5,"Nissan", "green"));
    }
    @Override
    public List<Car> allCars(Integer count) {
        if(count == null || count > cars.size()){
            return cars;
        }
        else {
            List<Car> countCars = new ArrayList<>();
            for(int i = 0; i < count; i++){
                countCars.add(cars.get(i));
            }
            return countCars;
        }
    }
}
