package com.proyectoFinalBootcampServer.Endpoint;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@Component
@RestControllerEndpoint(id ="proyectoEndPoint")
public class Endpoint {
    @GetMapping("/proyectoEndpoint")
    public @ResponseBody ResponseEntity<String> customEndPoint(){
        return  new ResponseEntity<>("", HttpStatus.OK);
    }
}
	


