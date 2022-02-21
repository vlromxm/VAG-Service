package VAGService.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServicesController {
    @GetMapping("/services")
    public String mainServices(Model model){
        model.addAttribute("services","Наши услуги");
        return "services";
    }

}
