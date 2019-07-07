package observer;

public class TvNews implements Observer {
    @Override
    public void updateWeatherForecast(WeatherForecast weatherForecast) {
        System.out.println(String.format("TvNews - weather forecast updated. Temperature: %d, Pressure %d hp", weatherForecast.getTemperature(), weatherForecast.getPressure()));
    }
}
