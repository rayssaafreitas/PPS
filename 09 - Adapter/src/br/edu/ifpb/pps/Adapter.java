package br.edu.ifpb.pps;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("serial")
public class Adapter<Tipo> extends HashMap<Tipo, Tipo> implements Map<Tipo, Tipo>{

	public Adapter(Tipo[][] matriz) {
		super();
		for (int column = 0; column < matriz[0].length; column++) {
			put(matriz[0][column], matriz[1][column]);
		}
	}
}