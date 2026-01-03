package com.epam;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapWithDuplicateHandling {
    public static Map<String, Integer> countUsers(List<String> users) {
        return users.stream()
                .collect(Collectors.toMap(
                        u -> u,
                        u -> 1,
                        Integer::sum
                ));
    }
}
