package UygulamaBaslat;

import java.io.IOException;

public class UygulamaBaslat {

	public static void main(String[] args) {

		Runtime runTime = Runtime.getRuntime();
		try {
			Process process = runTime.exec("gnome-calculator");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
