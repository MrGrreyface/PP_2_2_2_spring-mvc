package web.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class CarServiceImpl implements CarService{
    @Autowired
    public CarServiceImpl() {

}
    private final List<Car> carList = Arrays.asList(new Car("BMW", "X6", 1),
            new Car("Lada", "Granta", 2),
            new Car("Mercedes","W168", 3),
            new Car("Chevrolet", "Tahoe", 4),
            new Car("Ford", "Focus", 5));
    @Override

    public List<Car> getCarList(int count) {

        if (count < 5) {
            return carList.stream().limit(count).collect(Collectors.toList());
        }
        return carList;
    }
}
