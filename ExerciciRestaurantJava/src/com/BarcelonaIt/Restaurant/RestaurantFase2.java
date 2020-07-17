package com.BarcelonaIt.Restaurant;

import java.util.*;

public class RestaurantFase2{

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
		
		
		String[] precio_platos = {"10","8","7","14","9"};
		String[] platos = {"Pasta", "Ensalada", "Pizza","Bife","Tortilla"};
		
		String[][] menu = new String[2][5];
		
		for(int i = 0; i< 2; i++) {
			for(int j = 0 ; j < platos.length; j++) {
				if(i == 0) {
					menu[i][j] = platos[j];
				} else {
					menu[i][j] = precio_platos[j];
				  }				
			}
		}
		for(int x = 0 ; x < platos.length; x++) {
		System.out.println(menu[0][x] + " €" + menu[1][x]);
		}
		Scanner order = new Scanner(System.in);
		String platoPedido;
		boolean seguirPidiendo = true;
		List<String> listaPedido = new ArrayList<String>();
		
		while(seguirPidiendo) {
			System.out.println("Enter your order,or type 'stop': ");

			platoPedido = order.nextLine();
			
			if(platoPedido.contentEquals("stop")) {
				seguirPidiendo = false;
			} else {
				listaPedido.add(platoPedido);
			}
		}
		
	}
		
}