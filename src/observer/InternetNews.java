package observer;

public class InternetNews implements Observer {
    @Override
    public void updateWeatherForecast(WeatherForecast weatherForecast) {
        System.out.println(String.format("Internet - weather forecast updated. Temperature: %d, Pressure %d hp", weatherForecast.getTemperature(), weatherForecast.getPressure()));
    }
}
