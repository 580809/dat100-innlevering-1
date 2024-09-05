package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O2 {

	public static void main(String[] args) {

		for (int i = 1; i < 11;) {

			String poengmelding = (i + ". poengsum:");
			String feilmelding = "Ugyldig poengsum, tast inn en poengsum fra 0 til 100";
			int poeng = Integer.parseInt(showInputDialog(poengmelding));
			char karakter = 'F';

			if ((100 >= poeng) && (poeng >= 0)) {

				if ((100 >= poeng) && (poeng >= 90))
					karakter = 'A';
				else if ((89 >= poeng) && (poeng >= 80))
					karakter = 'B';
				else if ((79 >= poeng) && (poeng >= 60))
					karakter = 'C';
				else if ((59 >= poeng) && (poeng >= 50))
					karakter = 'D';
				else if ((49 >= poeng) && (poeng >= 40))
					karakter = 'E';
				else if ((39 >= poeng) && (poeng >= 0))
					karakter = 'F';

				String melding = (poeng + " poeng gir karakter " + karakter);
				showMessageDialog(null, melding);
				i++;
				poengmelding = (i + ". poengsum:");
			}

			else
				showMessageDialog(null, feilmelding);

		}

	}
}
