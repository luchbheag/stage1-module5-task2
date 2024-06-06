package com.epam.mjc;

import java.util.stream.Collectors;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return list -> {
            return list.stream().map(x -> x/divider).collect(Collectors.toList());
        };
    }
}
