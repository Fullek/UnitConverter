package com.fullek.unitconverter;

import java.util.HashMap;

public class DistanceConverter {

    InputManager inputManager = new InputManager();
    StringBuilder stringBuilder = new StringBuilder();

    private final HashMap<Integer, String> selectionList = new HashMap<>();

    private void putDistanceOptions() {
        selectionList.put(1, "Metric");
        selectionList.put(2, "Imperial");
    }

    private void showDistanceOptions() {
        selectionList.forEach((k, v) -> System.out.println(k + " -> " + v));
    }

    public void showCalculatedDistance() {
        System.out.println("Which distance type would you like to convert?");
        putDistanceOptions();
        showDistanceOptions();
        int distanceType = inputManager.getIntegerInput();

        if (distanceType <= selectionList.size()) {
            System.out.println("How many? (You can also use decimals)");
            float distance = inputManager.getFloatInput();

            switch (distanceType) {
                case 1 -> System.out.println(stringBuilder
                        .append(distance)
                        .append(" meters are ")
                        .append(convertMetricToImperial(distance))
                        .append(" yards "));

                case 2 -> System.out.println(stringBuilder
                        .append(distance)
                        .append(" yards are ")
                        .append(convertImperialToMetric(distance))
                        .append(" meters "));
            }
        } else {
            System.out.println("You must type one of " + selectionList.size() + " options!");
            showCalculatedDistance();
        }
    }

    private float convertMetricToImperial(float distance) {
        return distance * 1.0936f;
    }

    private float convertImperialToMetric(float distance) {
        return distance * 0.9144f;
    }
}
