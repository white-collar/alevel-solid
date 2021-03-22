package dependency.inversion.good;

public class MobileDevice implements Notifier {
    public void alertWeatherConditions(String weatherConditions) {
        if (weatherConditions.equals("rainy"))
            System.out.print("It is rainy");
    }
}
