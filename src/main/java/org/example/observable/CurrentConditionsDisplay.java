package org.example.observable;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer,DisplayElement {
    Observable observable;//主题
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);//将当前对象登记为观察者
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherDate){
            WeatherDate weatherDate = (WeatherDate) o;
            this.temperature = weatherDate.getTemperature();
            this.humidity = weatherDate.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("current conditions: " + temperature + ";" + humidity);
    }
}
