package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.Exception.DomainException;
import model.entities.Reserva;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
		System.out.println("Room number: ");
		int roomNumber = sc.nextInt();
		System.out.println("Check-In date (dd/MM/yyyy)");
		Date checkIn = sdf.parse(sc.next());
		System.out.println("Check-Out date (dd/MM/yyyy)");
		Date checkOut = sdf.parse(sc.next());

		
		Reserva reserva = new Reserva(roomNumber, checkIn, checkOut);
		System.out.println("Reserva: "+reserva);
		
		System.out.println();
		System.out.println("Atualização da reserva");
		System.out.println("Check-In date (dd/MM/yyyy)");
		checkIn = sdf.parse(sc.next());
		System.out.println("Check-Out date (dd/MM/yyyy)");
		checkOut = sdf.parse(sc.next());
		
		reserva.updateDates(checkIn, checkOut);
		System.out.println("Reserva: "+reserva);
		}
		catch(ParseException e) {
			System.out.println("Data invalida");
		}
		catch (DomainException e) {
			System.out.println("Erro na reserva: "+e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Erro inesperado");
		}
}
		
		
	}
		


