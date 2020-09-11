package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2020-09-10T15:17:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal =  Calendar.getInstance(); // criando objeto para adcionar horas a mais 
		cal.setTime(d);
		int minutes = cal.get(Calendar.MINUTE);// pegando o minuto da hora 
		int month = 1 + cal.get(Calendar.MONTH);// pegando mes + para somar com mes  porque começa com 0 calendar 
		/*
		cal.add(Calendar.HOUR_OF_DAY, 4);// adcionando 4  horas á mais no horário 
		d = cal.getTime(); // passando valor para variavel formatada  para mostrar na tela 
		System.out.println(sdf.format(d));
		*/
		
		System.out.println("Minutes: " + minutes);
		System.out.println("Minutes: " + month);
		System.out.println("bom dia ");
		
	}

}
