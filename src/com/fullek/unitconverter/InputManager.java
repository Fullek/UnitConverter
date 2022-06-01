package com.fullek.unitconverter;

import java.util.Scanner;

public class InputManager {

    Scanner scanner = new Scanner(System.in);

    int getIntegerInput() {
        return scanner.nextInt();
    }

    float getFloatInput() {
        return scanner.nextFloat();
    }
}
