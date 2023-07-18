package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarContr {
    CarService carService = new CarServiceImpl();
    @GetMapping(value = "/cars")
    public String cars(Model model,  @RequestParam(value = "count", defaultValue = "5") int count) {
        model.addAttribute("cars", carService.getCarList(count));
        return "cars.html";

    }
}
