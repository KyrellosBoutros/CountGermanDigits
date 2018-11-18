package org.eclise.countgermandigits.internal;

import java.text.NumberFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;

/**
 * prog print a given int from one million (minus to plus) in letters
 * 
 * @author Kyrellos Boutros 
  * @version 1.0
 * @ since 24.10.2018
 */
public class Interface {

	private static final String DEFAULT_REGEX = "^([-]?[1-9][0-9]{0,8}|0|1000000000|-1000000000)$";

	public static int inputDigitTypeLetter(String inputDigit) {

		int n = Integer.parseInt(inputDigit);

		// showResult();
		JOptionPane.showMessageDialog(null,
				"<html>" + "Deine Zahl " + "<font size='5' color='black'>" + NumberFormat.getInstance().format(n)
						+ "</font>" + " lautet: \n\n" + "ordinal:\n"
						+ "<html><div width=300px align=center><font face='Calibri' size='6' color='red'>"
						+ ConvertNumbersToCardinal.getNumberCardinal(n) + "\n\n" + "kardinal:\n"
						+ "<html><div width=300px align=center><font face='Calibri' size='6' color='green'>"
						+ ConvertNumbersToOrdinal.getNumberOrdinal(n),
				"Ergebnis", JOptionPane.PLAIN_MESSAGE);

		// askForInputAgain();
		int answer = JOptionPane.showConfirmDialog(null,
				"Noch eine Zahl von minus eine Milliarde bis plus eine Milliarde?", "Bestätigung",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (answer == JOptionPane.YES_OPTION) {
		} else if (answer == JOptionPane.NO_OPTION) {
			// end the program
			JOptionPane.showOptionDialog(null, "Danke für die Verwendung 'Zahlen zaehlen'-Programm ", "Ende",
					JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[] {}, null);
			System.exit(0);
		} else {
		}
		return n;
	}

	static void displayJFrame() {

		JFrame jframe = new JFrame("JFrame Size Example");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// set the jframe size and location, and make it visible
		jframe.setPreferredSize(new Dimension(400, 300));
		jframe.pack();
		jframe.setLocationRelativeTo(null);
		jframe.setVisible(true);
	}

	public static void main(String[] args) {

		UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Verdana", Font.BOLD, 14)));
		UIManager.put("OptionPane.messageForeground", Color.blue);

		// showWelcome();
		JOptionPane.showMessageDialog(null, "Willkommen zu 'Zahlen zaehlen'-Programm", "",
				JOptionPane.INFORMATION_MESSAGE);

		while (true) {

			Pattern inputPatternInvalid = Pattern.compile(DEFAULT_REGEX);
			// askForInput();
			String inputDigit = JOptionPane.showInputDialog(null,
					"Gib bitte eine Zahl von minus eine Milliarde bis plus eine Milliarde an: \n\n");

			if (inputDigit != null) {
			} else {
				System.exit(0);
			}

			Matcher matcherValid = inputPatternInvalid.matcher(inputDigit);

			if (!matcherValid.find()) {
				// show error message, if input does not match pattern
				JOptionPane.showMessageDialog(null, "Deine Angabe passt nicht, versuche es nochmal", "Error",
						JOptionPane.ERROR_MESSAGE);
				continue;
			}
			inputDigitTypeLetter(inputDigit);
		}
	}

}
