package ScenarioBased;
import java.util.*;
public class DigitalWatchSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int hour = 0; hour < 24; hour++) {

            for (int minute = 0; minute < 60; minute++) {

                System.out.printf("%02d:%02d\n", hour, minute);

                
                if (hour == 13 && minute == 0) {
                    System.out.println("Power cut");
                    break;
                }
            }

           
            if (hour == 13) {
                break;
            }
        }
	}

}
