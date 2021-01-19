package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = new Date();
				
		System.out.println(sdf.format(d));
		System.out.println("Primeira Modificação!");
		System.out.println("Segunda Modificação!");
		System.out.println("Terceira Modificação!");
			
	}	
	
}
