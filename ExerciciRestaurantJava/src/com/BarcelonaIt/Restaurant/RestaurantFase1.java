package com.BarcelonaIt.Restaurant;


public class RestaurantFase1{

	public static void main(String[] args) {
		// Fase 1
		
		
		int bill5,bill10,bill20,bill50,bill100,bill200,bill500,totalPrice ;
		
		bill5 = 5;
		bill10 = 10;
		bill20 = 20;
		bill50 = 50;
		bill100 = 100;
		bill200 = 200;
		bill500 = 500;
		
		
		int[] precio_platos = {10,8,7,14,9};
		String[] platos = {"Pasta", "Ensalada", "Pizza","Bife","Tortilla"};
		
		for(int i = 0; i< platos.length; i++) {
		System.out.println(platos[i] + " €" + precio_platos[i]);
		
		
		}
	}

}
