package br.edu.ifpb.pps;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataSubject implements Subject{
	private List<WeatherDataObserver> observers;
	private WeatherData weatherData;
	
	public WeatherDataSubject(){
		this.observers = new ArrayList<WeatherDataObserver>();
	}
	
	public void attach(WeatherDataObserver observer) {
        observers.add(observer);
    }
 
    public void detach(WeatherDataObserver observer) {
        observers.remove(observer);
    }
    
    public void setState(WeatherData weatherData) {
        this.weatherData = weatherData;
        notifyObservers();
    }
     
    public void notifyObservers() {
        for (WeatherDataObserver observer : observers) {
            observer.update();
        }
    }
     
    public WeatherData getState() {
        return weatherData;
    }
}
