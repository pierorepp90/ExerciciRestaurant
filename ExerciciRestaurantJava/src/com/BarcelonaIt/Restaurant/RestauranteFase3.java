package com.BarcelonaIt.Restaurant;

import java.util.*;

public class RestauranteFase3{

	public static void main(String[] args) {
		// Fase 3
		
		
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
		order.close();
		int priceOfOrder = 0;
		List<String> listaEntendible = new ArrayList<String>();
		
		for(int i = 0 ; i < platos.length; i++) {
			for(int j = 0; j < listaPedido.size() ; j++)  {
				if(listaPedido.get(j).equalsIgnoreCase(platos[i])){
					priceOfOrder += Integer.parseInt(menu[1][i]);
					listaEntendible.add(menu[0][i]);
					listaPedido.remove(j);
				}

			}			
		}
		int payBill = 0;
		 if(priceOfOrder <= 5){
	            payBill = bill5;
	        }else if(priceOfOrder > 5 && priceOfOrder <=10){
	            payBill = bill10;
	        }else if(priceOfOrder > 10 && priceOfOrder <= 20){
	            payBill = bill20;
	        }else if(priceOfOrder > 20 && priceOfOrder <= 50){
	            payBill = bill50;
	        }else if(priceOfOrder > 50 && priceOfOrder <= 100){
	            payBill = bill100;
	        }else if(priceOfOrder > 100 && priceOfOrder <= 200){
	            payBill = bill200;
	        }else if(priceOfOrder > 200 && priceOfOrder <= 500){
	            payBill = bill500;
	        }
		System.out.println("Unfortunately we don't have  " + listaPedido);
		System.out.println("Your order is " + listaEntendible + " and cost: " + priceOfOrder + "€");
		System.out.println("Please pay with " + payBill + "€.And we will return: " + (payBill - priceOfOrder) + "€" );
	}
		
}


	

