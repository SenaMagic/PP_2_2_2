package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {
    private CarService carService;
    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }
    @GetMapping("/cars")
    public String carlist(@RequestParam(value = "count", defaultValue = Integer.MAX_VALUE + "") int count, Model model) {
        model.addAttribute("result", carService.getCars(count));
        return "/cars";
    }
}