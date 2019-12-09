package com.example.Controller;

import com.example.Model.Pies;
import com.example.PiesRepository.PiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PiesController {
    @Autowired
    private  PiesRepository piesRepository;

@GetMapping ("/lista-psiakow")
public Iterable<Pies> listaPsiakkow(){
    return piesRepository.findAll();
}
}
