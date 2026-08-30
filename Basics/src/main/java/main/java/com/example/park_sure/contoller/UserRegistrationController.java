package main.java.com.example.park_sure.contoller;


import com.example.park_sure.ErrorHandling.ParkingUserException;
import com.example.park_sure.ErrorHandling.UserNotFoundException;
import com.example.park_sure.dto.UserRegistrationDTO;
import com.example.park_sure.dto.user_registration;
import com.example.park_sure.service.UserRegistrationApplicationService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/park-sure")
public class UserRegistrationController {

    @Autowired
    UserRegistrationApplicationService userRegistrationApplicationService;

    @PostMapping(value = "/registerUser")
    public UserRegistrationDTO registerUser(@RequestBody UserRegistrationDTO userRegistrationDTO)
    {
        userRegistrationApplicationService.registerUser(userRegistrationDTO);
        return userRegistrationDTO;
    }


    @GetMapping(value = "/getUser", params = "user_id")
    public UserRegistrationDTO getUser(String user_id)
    {

            return userRegistrationApplicationService.getUserDetails(user_id);

    }

    @GetMapping(value = "/getUser/{user_id}")
    public UserRegistrationDTO getUserById(@PathVariable String user_id)
    {
        UserRegistrationDTO userRegistrationDTO = userRegistrationApplicationService.getUserDetails(user_id);
        if(null == userRegistrationDTO.getUser_id())
        {
            throw new UserNotFoundException("User not found "+user_id);
        }

        return userRegistrationDTO;
    }

    @GetMapping(value = "/filter", params = "user_name")
    public List<user_registration> filterUser(String user_name)
    {
        List<user_registration> user_registrations = new ArrayList<>();
        try {

             user_registrations = userRegistrationApplicationService.filter(user_name);
        }catch (Exception exception)
        {
            exception.printStackTrace();
        }
        return user_registrations;
    }

    @PutMapping("/updateUser")
    public user_registration updateUser(@RequestBody user_registration userRegistrationDTO)
    {
        return userRegistrationApplicationService.updateUser(userRegistrationDTO);

    }


    @DeleteMapping("/deleteUser")
    public String deleteUser(@RequestParam String user_id)
    {
        userRegistrationApplicationService.deleteUser(user_id);
        return "SUCCESS";
    }

}
