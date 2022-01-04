package com.rainbow.demo.service;

import java.util.List;

public interface IColorService {
    List<String> allColors();
    String saveColor(String color);
}
