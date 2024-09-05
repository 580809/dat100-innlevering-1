package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O1 {

	public static void main(String[] args) {

		int inntekt = Integer.parseInt(showInputDialog("Inntekt: "));
		int skatt = 0;

		while (inntekt > 208050) {

			if (208051 <= inntekt && inntekt <= 292850) {
				skatt += (inntekt - 208050) * 0.017;
				inntekt = 208050;
			}

			else if (292851 <= inntekt && inntekt <= 670000) {
				skatt += (inntekt - 292850) * 0.040;
				inntekt = 292850;
			}

			else if (670001 <= inntekt && inntekt <= 937900) {
				skatt += (inntekt - 670000) * 0.136;
				inntekt = 670000;
			}

			else if (937901 <= inntekt && inntekt <= 1350000) {
				skatt += (inntekt - 937900) * 0.166;
				inntekt = 937900;
			}

			else if (inntekt >= 1350001) {
				skatt += (inntekt - 1350000) * 0.176;
				inntekt = 1350000;
			}

		}
		String melding = ("Trinnskatt du må betale er: kr " + skatt);
		showMessageDialog(null, melding);
	}

}
