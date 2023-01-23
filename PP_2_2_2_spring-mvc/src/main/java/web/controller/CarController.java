package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceInterface;

@Controller
public class CarController {
    private CarServiceInterface carService;
    @Autowired
    public CarController(CarServiceInterface carService) {
        this.carService = carService;
    }
    @GetMapping("/cars")
    public String getCarList(@RequestParam(value = "count", defaultValue = Integer.MAX_VALUE + "") int count, Model model) {
        model.addAttribute("result", carService.getCars(count));
        return "/cars";
    }
}
