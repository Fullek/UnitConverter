import java.util.HashMap;

public class TemperatureConverter {

    InputManager inputManager;
    StringBuilder stringBuilder;

    public TemperatureConverter(InputManager inputManager, StringBuilder stringBuilder) {
        this.inputManager = inputManager;
        this.stringBuilder = stringBuilder;
    }

    private final HashMap<Integer, String> selectionList = new HashMap<>();

    private void putTemperatureOptions() {
        selectionList.put(1, "Celsius");
        selectionList.put(2, "Fahrenheit");
        selectionList.put(3, "Kelvin");
    }

    private void showTemperatureOptions() {
        selectionList.forEach((k, v) -> System.out.println(k + " -> " + v));
    }

    public void showCalculatedTemperature() {

        System.out.println("Which type of degree would you like to convert? ");
        putTemperatureOptions();
        showTemperatureOptions();
        int degreeType = inputManager.getIntegerInput();

        if (degreeType <= selectionList.size()) {
            System.out.println("How many degrees? ");
            float degrees = inputManager.getFloatInput();

            switch (degreeType) {
                case 1 -> System.out.println(stringBuilder.append(degrees).append(" Celsius degrees are ")
                                .append(convertCelsiusToFahrenheit(degrees)).append(" Fahrenheit degrees, and ")
                                .append(convertCelsiusToKelvin(degrees)).append(" Kelvins "));

                case 2 -> System.out.println(stringBuilder.append(degrees).append(" Fahrenheit degrees are ")
                                .append(convertFahrenheitToCelsius(degrees)).append(" Celsius degrees, and ")
                                .append(convertFahrenheitToKelvins(degrees)).append(" Kelvins "));

                case 3 -> System.out.println(stringBuilder.append(degrees).append(" Kelvins are ")
                                .append(convertKelvinsToCelsius(degrees)).append(" Celsius degrees, and ")
                                .append(convertKelvinsToFahrenheit(degrees)).append(" Fahrenheit degrees "));
            }
        } else {
            System.out.println("You must type one of " + selectionList.size() + " options above!");
            showCalculatedTemperature();
        }
    }

//    public void takeTempMenuException() {
//        try {
//            selectTempMenu();
//        } catch (Exception exception) {
//            System.out.println("You must type the number as follows above!");
//        }
//    }

    private float convertCelsiusToFahrenheit(float degrees) {
        return degrees * 9/5 + 32;
    }

    private float convertCelsiusToKelvin(float degrees) {
        return degrees + 273.15f;
    }

    private float convertFahrenheitToCelsius(float degrees) {
        return (degrees - 32) * 5/9;
    }

    private float convertFahrenheitToKelvins(float degrees) {
        return (degrees + 459.67f) * 5/9;
    }

    private float convertKelvinsToCelsius(float degrees) {
        return degrees - 273.15f;
    }

    private float convertKelvinsToFahrenheit(float degrees) {
        return degrees * 9/5 - 459.67f;
    }
}
