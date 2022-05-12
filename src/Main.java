public class Main {

    public static void main(String[] args) {
        ProgramStarter programStarter = new ProgramStarter(
                new DistanceConverter(new InputManager(), new StringBuilder()),
                new TemperatureConverter(new InputManager(), new StringBuilder())
        );

        programStarter.showMainOptions();
    }
}
