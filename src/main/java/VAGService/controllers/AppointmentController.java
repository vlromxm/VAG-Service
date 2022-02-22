package VAGService.controllers;

import VAGService.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppointmentController {

    @Autowired
    AppointmentRepository appointmentRepository;
    @GetMapping("/home#appointment")
    public String login(Model model){
        model.addAttribute("appointment","Записаться");
        return "appointment";
    }
}
