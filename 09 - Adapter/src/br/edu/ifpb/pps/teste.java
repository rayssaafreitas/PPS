package br.edu.ifpb.pps;

import java.util.Map;

public class teste {

	public static void main(String[] args) {
		Integer[][] matriz = new Integer[][] { { 2, 4, 6, 8, 10 }, { 4, 16, 36, 64, 100 } };

		Map<Integer, Integer> hashMap = new Adapter<Integer>(matriz);
		System.out.println("Elementos do HashMap");
		for (Integer key : hashMap.keySet()) {
			System.out.println(key + " : " + hashMap.get(key));
		}
	}
}