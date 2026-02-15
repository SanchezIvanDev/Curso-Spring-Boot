package pildoras.proyecto1.Proyecto1.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MiRestController {

    @GetMapping("/")
    public String saludo (){

            return  "Hola Mundo";
    }



}
