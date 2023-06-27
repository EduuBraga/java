package estudo;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {
	public static void main(String[] args) {
		LocalDate dataAgora = LocalDate.now();
		
		System.out.println(dataAgora);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy - EEEE");
		System.out.println(dataAgora.format(formatador));
	}
}
