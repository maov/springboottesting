package com.rainbow.demo.controller;


import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rainbow.demo.service.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class ColorController {
    @NonNull
    private final IColorService service;

    @GetMapping(value = "/colors")
    public List<String> getColors(){
        return service.allColors();
    }

}
