package com.rainbow.demo.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ColorService implements  IColorService {

    public static ArrayList<String> basicColors(){
        var colors = new ArrayList<String>();
        colors.add("Green");
        colors.add("Red");
        colors.add("Blue");

        return colors;
    }

    private final Set<String> colors = new HashSet<String>(basicColors());

    public List<String> allColors(){
        return new ArrayList<>(this.colors);
    }

    public String saveColor(String color){
        if(colors.contains(color)){
            return "To boring";
        }
        else {

            colors.add(color);
            return "Great color";
        }
    }

}
