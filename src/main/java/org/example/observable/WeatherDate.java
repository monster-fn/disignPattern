package org.example.observable;

import java.util.Observable;

public class WeatherDate extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherDate() {
    }

    public void measurementsChanged(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
