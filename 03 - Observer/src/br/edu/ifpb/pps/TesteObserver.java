package br.edu.ifpb.pps;

public class TesteObserver {
	public static void main(String[] args){
		WeatherDataSubject weatherData = new WeatherDataSubject();
		weatherData.attach(new CondicoesAtuais(weatherData));
		weatherData.attach(new Estatisticas(weatherData));
		weatherData.attach(new Previsao(weatherData));
		
		weatherData.setState(new WeatherData(10.0, 10.0, 10.0));
		weatherData.setState(new WeatherData(5.0, 5.0, 5.0));
	}
}
