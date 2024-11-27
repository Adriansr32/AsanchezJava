package Operadors;
import java.time.LocalTime;

public class Operadors_2 {
    public static void main(String[] args) {
 	LocalTime now = LocalTime.now();
	int hour = now.getHour();
	int min = now.getMinute();
	int sec = now.getSecond();
	int mitjaNit = now.toSecondOfDay();
	int secDays = 24 * 60 * 60;
	int finDay = secDays - mitjaNit;
	double PassetDay = (mitjaNit / (double) secDays) * 100;
	

	System.out.println("Hora actual: " + hour + ":" + min + ":" + sec );
	System.out.println("Segons des de mitja nit: " + mitjaNit );
	System.out.println("Segons fins a final del dia: " + finDay );
	System.out.printf("Ha passat el %.6f%% del dia\n", PassetDay);
    }
}