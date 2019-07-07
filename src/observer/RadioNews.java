package observer;

public class RadioNews implements Observer {
    @Override
    public void updateWeatherForecast(WeatherForecast weatherForecast) {
        System.out.println(String.format("RadioNews - weather forecast updated. Temperature: %d, Pressure %d hp", weatherForecast.getTemperature(), weatherForecast.getPressure()));
    }
}
