import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calander_demo {
	public static void main(String args[]) {
		
		Calendar cad = Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat();
		System.out.println(sd.format(cad.getTime()));
		System.out.println(cad.getWeekYear());

	}
}
