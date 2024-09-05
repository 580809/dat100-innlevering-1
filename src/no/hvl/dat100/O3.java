package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O3 {

	public static void main(String[] args) {

		int n = 0;
		int nFakultet = 1;
		String melding = "Tall må være postitivt";

		do {

			n = Integer.parseInt(showInputDialog("Tall: "));
			nFakultet = n;

			if (n > 0) {
				for (int i = n - 1; i > 0; i--) {

					nFakultet *= i;
				}
				melding = ("Svaret er " + nFakultet);
			}
			showMessageDialog(null, melding);
		} while (n < 1);
	}
}
