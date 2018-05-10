package br.edu.ifpb.pps;

public class Estatisticas implements WeatherDataObserver{
	private WeatherDataSubject weatherData;
	
	public Estatisticas(WeatherDataSubject weatherData) {
		super();
		this.weatherData = weatherData;
	}


	@Override
	public void update() {
		System.out.println("Estatisticas: \nTemperatura - " + weatherData.getState().getTemperatura() 
				+ "\nUmidade - " + weatherData.getState().getUmidade()
				+ "\nPressao - " + weatherData.getState().getPressao() + "\n");
		
	}


}
