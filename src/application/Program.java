package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reserva;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Room number: ");
		int roomNumber = sc.nextInt();
		System.out.println("Check-In date (dd/MM/yyyy)");
		Date checkIn = sdf.parse(sc.next());
		System.out.println("Check-Out date (dd/MM/yyyy)");
		Date checkOut = sdf.parse(sc.next());

		if (!checkOut.after(checkIn)) {
			System.out.println("Erro na reserva: A data de Check-Out deve ser depois do check-in");
		} else {
			Reserva reserva = new Reserva(roomNumber, checkIn, checkOut);
			System.out.println("Reserva: "+reserva);
			
			System.out.println();
			System.out.println("Atualização da reserva");
			System.out.println("Check-In date (dd/MM/yyyy)");
			checkIn = sdf.parse(sc.next());
			System.out.println("Check-Out date (dd/MM/yyyy)");
			checkOut = sdf.parse(sc.next());
			
			String error = reserva.updateDates(checkIn, checkOut);
			if (error != null) {
				System.out.println("Error na reserva"+ error);
				
			} else {
			System.out.println("Reserva: "+reserva);
	}
	

		}
		
		
		
		
	}


