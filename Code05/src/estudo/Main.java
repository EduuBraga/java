package estudo;

import java.time.LocalDate;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		HashMap<String, String> estados = new HashMap<String, String>();		

		estados.put("CE", "Ceara");
		
		Iterator it = estados.entrySet().iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
