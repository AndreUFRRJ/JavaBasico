package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.UnsupportedTemporalTypeException;
import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Reservation;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		try {
			System.out.print("Informe o numero do quarto: ");
			int quarto=sc.nextInt();
			System.out.println("Data de checkin (DIA/MES/ANO)");
			sc.nextLine();
			LocalDate checkin=LocalDate.parse(sc.nextLine(), fmt);		
			System.out.println("Data de checkout (DIA/MES/ANO)");
			LocalDate checkout=LocalDate.parse(sc.nextLine(), fmt);		
			Reservation reserva = new Reservation(quarto,checkin,checkout);
			System.out.println(reserva);
			
		}
		catch(InputMismatchException e) {
			System.out.println("numero do quarto invalido");
		}
		catch(DateTimeParseException e) {
			System.out.println("Erro na leitura da data, verifique o formato DD/MM/YYYY");
		}
		catch(IllegalArgumentException e){
			e.getMessage();
		}
		catch(UnsupportedTemporalTypeException e) {
			e.printStackTrace();
		}

		
		finally {
			sc.close();
			System.out.println("programa encerrado com sucesso");
		}
	}

}
