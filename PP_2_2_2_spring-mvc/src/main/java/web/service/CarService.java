package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class CarService {
    private List<Car> carsList;
    {
        carsList = new ArrayList<>();
        carsList.add(new Car("Nissan", "Teana", 2007));
        carsList.add(new Car("Kia", "Optima", 2017));
        carsList.add(new Car("Peugeot", "107", 2009));
        carsList.add(new Car("Skoda", "Yeti", 2016));
        carsList.add(new Car("Honda", "Civic Type R", 2008));
    }
    public List<Car> getCars(int count) {
        return carsList.stream().limit(count).collect(Collectors.toList());
    }
}
