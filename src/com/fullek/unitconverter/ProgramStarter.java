package com.fullek.unitconverter;

public class ProgramStarter {

    TemperatureConverter temperatureConverter;
    DistanceConverter distanceConverter;

    public ProgramStarter(DistanceConverter distanceConverter, TemperatureConverter temperatureConverter) {
        this.distanceConverter = distanceConverter;
        this.temperatureConverter = temperatureConverter;
    }

    void showMainOptions() {
        System.out.println("What would you like to convert? ");
        System.out.println("1 -> Temperature");
        System.out.println("2 -> Distance");
        getUserChoice();
    }

    private void getUserChoice() {
        int userChoice = distanceConverter.inputManager.getIntegerInput();
        switch (userChoice) {
            case 1 -> temperatureConverter.showCalculatedTemperature();
            case 2 -> distanceConverter.showCalculatedDistance();
            default -> {
                System.out.println("Wrong option selected. Try again.\n");
                getUserChoice();
            }
        }
    }
}
