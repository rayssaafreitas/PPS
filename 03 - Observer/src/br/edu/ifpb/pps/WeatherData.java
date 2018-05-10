package br.edu.ifpb.pps;

public class WeatherData {
	private double temperatura;
	private double umidade;
	private double pressao;
	
	public WeatherData(double temperatura, double umidade, double pressao) {
		super();
		this.temperatura = temperatura;
		this.umidade = umidade;
		this.pressao = pressao;
	}
	
	public double getTemperatura() {
		return temperatura;
	}
	
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	
	public double getUmidade() {
		return umidade;
	}
	
	public void setUmidade(double umidade) {
		this.umidade = umidade;
	}
	
	public double getPressao() {
		return pressao;
	}
	
	public void setPressao(double pressao) {
		this.pressao = pressao;
	}
	
	public void medicoesAlteradas(){
		
	}
}
