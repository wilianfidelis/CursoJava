import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Calender {

	public static void main(String[] args)throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));

		
	}

}
