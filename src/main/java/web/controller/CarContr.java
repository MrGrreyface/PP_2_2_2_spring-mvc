package web.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarContr {
   private final CarService carService;

    public CarContr(@Qualifier("carServiceImpl") CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String cars(Model model,  @RequestParam(value = "count", defaultValue = "5") int count) {
        model.addAttribute("cars", carService.getCarList(count));
        return "cars.html";

    }
}
