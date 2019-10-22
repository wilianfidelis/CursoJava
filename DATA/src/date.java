import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sb01 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sb02 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date h01 = sb01.parse("25/06/2018");
		Date h02 = sb02.parse("25/06/2018 13:00:00");

		Date x = new Date();

		System.out.println(sb01.format(h01));
		System.out.println(h02);
		System.out.println("Hora atual " + sb02.format(x)); // Imprimir a data atual, utiliza o sb02.format//
		System.out.println("----------------------------------------");
		System.out.println();

	}

}
