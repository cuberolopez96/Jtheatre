package jteatre;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class prueba {

	public static void main(String[] args) {
		Calendar fecha = GregorianCalendar.getInstance();
		fecha.set(1996, 03, 23);
		System.out.println(fecha.getTime());
	}

}
