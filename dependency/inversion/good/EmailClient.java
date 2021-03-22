package dependency.inversion.good;

public class EmailClient implements Notifier{
    public void alertWeatherConditions(String weatherConditions) {
        if (weatherConditions.equals("sunny"));
        System.out.print("It is sunny");
    }
}
