package com.hazi.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/API")
public class Controller {
    
    
    
    @GetMapping("/IPadd")
    public String IPadd(HttpServletRequest request){
        String ipAddress = request.getRemoteAddr();
        return "IP Address Kamu : " + ipAddress;
        
    }

   
    
}

