package com.krithenmc.unnamedmod.entities.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum DemonEyeVariant {
    Base(0),
    Purple(1);

    private static final DemonEyeVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.comparingInt(
            DemonEyeVariant::getId)).toArray(DemonEyeVariant[]::new );
    private final int id;

    DemonEyeVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static DemonEyeVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
