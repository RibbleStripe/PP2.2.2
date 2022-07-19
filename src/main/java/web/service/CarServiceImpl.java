package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService{

    private CarDAO carDAO;
    @Override
    public List<Car> allCars(Integer amount) {
        return carDAO.allCars(amount);
    }

    public CarServiceImpl (CarDAO carDAO) {
        this.carDAO = carDAO;
    }
}
