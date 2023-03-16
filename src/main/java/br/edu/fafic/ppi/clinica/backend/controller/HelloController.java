package br.edu.fafic.ppi.clinica.backend.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/test")
    public String helloWorld(){
        return "Hello World!!!";
    }

    @GetMapping("/user")
    public String helloUser(@RequestParam("user") String user){
        //http://localhost:8080/hello/user?user=Caio
        return "Hello " + user;
    }

    @GetMapping("/{usuario}")
    public String helloUsuario(@PathVariable("usuario") String usuario){ //modo seguro
        //http://localhost:8080/hello/Caio
        return "Olá " + usuario;
    }
}
