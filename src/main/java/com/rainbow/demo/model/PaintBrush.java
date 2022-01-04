package com.rainbow.demo.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class PaintBrush {

    @NonNull
    private final String color;

    @NonNull
    private final int size;

}
