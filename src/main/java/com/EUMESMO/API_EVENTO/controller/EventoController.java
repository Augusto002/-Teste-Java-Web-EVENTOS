package com.EUMESMO.API_EVENTO.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/eventos")
public class EventoController {

    @GetMapping
    public String inserirEvento(){
        return "OLÁ MUNDO";
    }

}
