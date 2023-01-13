package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Mazda", 5, "Red"));
        cars.add(new Car("Honda", 3, "Black"));
        cars.add(new Car("Toyota", 105, "White"));
        cars.add(new Car("Mercedes", 1, "Yellow"));
        cars.add(new Car("BMW", 6, "Pink"));
    }

    @Override
    public List<Car> getCountCars(int count) {
        List<Car> carsList = cars;

        if (count == 0 || count < 0 || count > carsList.size()) {
            count = carsList.size();
        }

        return cars.stream().limit(count).toList();
    }


}
