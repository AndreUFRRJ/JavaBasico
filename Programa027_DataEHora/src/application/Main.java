package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		//Data Local
		LocalDate d01 = LocalDate.now();
		
		//Horario Local com horario
		LocalDateTime d02 = LocalDateTime.now();
		
		//horario global GTM+0
		Instant d03 = Instant.now();
		
		//inserindo data e horario manualmente
		LocalDate d04 = LocalDate.parse("1992-07-24");
		LocalDateTime d05 = LocalDateTime.parse("1992-07-24T03:50:30");
		Instant d06 = Instant.parse("1992-07-24T03:50:30Z");
		Instant d07 = Instant.parse("1992-07-24T03:50:30-03:00");
		
		
		//Inserindo mascara de formatação
		DateTimeFormatter fmt=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d08 =LocalDate.parse("24/07/1992",fmt);

		DateTimeFormatter fmt2=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d09=LocalDateTime.parse("24/07/1992 01:30",fmt2);
		
		
		//local data of
		LocalDateTime d10=LocalDateTime.of(1992, 07, 24, 01, 30);
		LocalDate d11=LocalDate.of(1992,07,24);
		
		
		//Formatando INSTANT importante! Inserir fuso
		DateTimeFormatter fmt3 =DateTimeFormatter.ofPattern("dd/MM/yyyy").withZone(ZoneId.systemDefault());
		
		
		
		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04);
		System.out.println(d05);
		System.out.println(d06);
		System.out.println(d07);
		System.out.println(d08);
		System.out.println(d09);
		System.out.println(d10);
		System.out.println(d11);
		System.out.println(fmt3.format(d06));
		
		//pegando partes especificas de uma data
		
		System.out.println(d04.getDayOfMonth());
		System.out.println(d04.getMonthValue());
		System.out.println(d04.getYear());
		System.out.println(d05.getHour());
		System.out.println(d05.getMinute());
		System.out.println(d05.getSecond());
		
		
		
		/*
		 * DURAÇÃO - deve conter hora e minuto, para usar o duration
		 * se não tiver usar o .atTime(hora,Minuto)
		 * */
		
		
		Duration t1 = Duration.between(d05,d01.atTime(0,0));
		System.out.println(t1.getSeconds());
		
		Duration t2=Duration.between(LocalDateTime.parse("1992-07-24T03:30:30"),LocalDateTime.parse("1992-07-27T02:30:30"));
		long allseconds = t2.toSeconds();
		int seconds =(int)(allseconds%60);
		int minuts =(int) (allseconds/60)%60;
		int hours=(int)(allseconds/60/60)%24;
		int days=(int)(allseconds/60/60/24)%365;
		System.out.println(seconds);
		System.out.println(minuts);
		System.out.println(hours);
		System.out.println(days);
	}

}
