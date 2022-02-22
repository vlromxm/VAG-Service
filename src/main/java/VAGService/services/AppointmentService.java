package VAGService.services;

import VAGService.entity.User;
import VAGService.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;

    public void createUser(String name, String surname, String phoneNumber,String email){
        User user = new User();
        user.setName(name);
        user.setSurname(surname);
        user.setPhoneNumber(phoneNumber);
        user.setEmail(email);
        appointmentRepository.save(user);
    }
}
