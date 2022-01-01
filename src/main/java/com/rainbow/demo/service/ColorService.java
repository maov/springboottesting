package com.rainbow.demo.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ColorService implements  IColorService {
    public List<String> allColors(){
        var colors = new ArrayList<String>();
        colors.add("Green");
        colors.add("Red");
        return colors;
    }

}
