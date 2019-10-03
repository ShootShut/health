package org.health.model.impl;

import org.health.model.Animal;
import org.springframework.stereotype.Service;

@Service
public class Crocodile implements Animal {
    @Override
    public String getInfo() {
        return "Gena";
    }
}
