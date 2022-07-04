import java.time.LocalDate;
import java.time.ZoneId;

public class Main {
	public static void main(String[] args) {		
		LocalDate now = LocalDate.now(ZoneId.of("UTC+9"));
		System.out.println(now);
	}
}