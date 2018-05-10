package br.edu.ifpb.pps;

public class CondicoesAtuais implements WeatherDataObserver {
	private WeatherDataSubject weatherData;
	
	public CondicoesAtuais(WeatherDataSubject weatherData) {
		super();
		this.weatherData = weatherData;
	}

	@Override
	public void update() {
		System.out.println("Condicoes atuais: \nTemperatura - " + weatherData.getState().getTemperatura() 
				+ "\nUmidade - " + weatherData.getState().getUmidade()
				+ "\nPressao - " + weatherData.getState().getPressao() + "\n");
		
	}
}
