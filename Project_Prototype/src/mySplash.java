import java.awt.Color;

import com.thehowtotutorial.splashscreen.JSplash;
public class mySplash {

	public static void main(String[] args) {
		try {
			JSplash splash = new JSplash(mySplash.class.getResource("CEN Logo 7_Final_edited-2.png"), true, true, false,
					"V1", null, Color.BLUE, Color.BLACK);

			splash.splashOn(); // to display
			// call method

			splash.setProgress(20, "Loading"); // displays loading at 20%
			Thread.sleep(1000);
			splash.setProgress(50, "Configuring"); // displays loading at 40%
			Thread.sleep(1000);
			splash.setProgress(80, "Starting Application");
			Thread.sleep(1000);
			splash.splashOff();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
