package com.rainbow.demo.controller;


import com.rainbow.demo.model.PaintBrush;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.rainbow.demo.service.*;

import javax.validation.Valid;
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

   @PostMapping("/paint")
    public String paint(@Valid  @RequestBody PaintBrush brush){
        return service.saveColor(brush.getColor());
   }


}
