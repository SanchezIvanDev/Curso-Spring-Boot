package pildoras.proyecto1.Proyecto1.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MiRestController {

    @Value("${alumno.pildoras.nombre}")
    private String nombreAlumno;

    @Value("${alumno.pildoras.apellido}")
    private String apellidoAlumno;


    @GetMapping("/Datos")
    public String getDatos(){

        return "Nombre del alumno: " + nombreAlumno + "<br>" + "Apellido del alumno: " + apellidoAlumno;

    }


    @GetMapping("/")
    public String saludo (){

            return  "index";
    }

    @GetMapping("/info")
    public String informacion (){

        return  "Esta es la web del proyecto con Spring Boot";
    }


}
