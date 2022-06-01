package com.fullek.unitconverter;

public class Main {

    public static void main(String[] args) {

        ProgramStarter programStarter = new ProgramStarter(new DistanceConverter(), new TemperatureConverter());
        programStarter.showMainOptions();

    }
}
