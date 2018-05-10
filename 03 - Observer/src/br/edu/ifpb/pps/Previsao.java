package br.edu.ifpb.pps;

public class Previsao implements WeatherDataObserver{
	private WeatherDataSubject weatherData;
	
	public Previsao(WeatherDataSubject weatherData) {
		super();
		this.weatherData = weatherData;
	}


	@Override
	public void update() {
		System.out.println("Previsao: \nTemperatura - " + weatherData.getState().getTemperatura() 
				+ "\nUmidade - " + weatherData.getState().getUmidade()
				+ "\nPressao - " + weatherData.getState().getPressao() + "\n");
		
	}

}
