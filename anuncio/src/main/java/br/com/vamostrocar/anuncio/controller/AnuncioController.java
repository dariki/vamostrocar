package br.com.vamostrocar.anuncio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnuncioController {

    @GetMapping("/helloworld")
    public String helloWorld(){
        return "Hello World Anuncio";
    }
}
