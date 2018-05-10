package br.edu.ifpb.pps;

public interface Subject {
	public void attach(WeatherDataObserver observer);
	public void detach(WeatherDataObserver observer);
	public void notifyObservers();
}
