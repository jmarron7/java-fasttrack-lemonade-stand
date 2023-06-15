package com.jesusmarron.lemonadestand;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jesusmarron.lemonadestand.entity.Order;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ViewOrder {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (true) {

			File file = new File("./orders");
			System.out.println("Which order number would you like to view?");

			int orderNumber = 0;
			try {
				orderNumber = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Please enter a number between 1 and 2 billion");
			}
			
			ObjectMapper objectMapper = new ObjectMapper();
			try {
				Order order = objectMapper.readValue(new File(file + "/order" + orderNumber + ".json"), Order.class);
				System.out.println(order.getLemonades());
				System.out.println("Total: " + order.getTotal());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
