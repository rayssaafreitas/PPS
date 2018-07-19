package br.edu.ifpb.pps.state;

public interface SemaforoState {
	public SemaforoState tick();
	public SemaforoState panic();
	public SemaforoState off();
	public SemaforoState on();
}
