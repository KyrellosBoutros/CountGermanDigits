package org.eclise.countgermandigits.internal;

/**
 * convert given digits to ORDINAL and return the output
 * @author Kyrellos Boutros 
 * @version 1.0
 * @ since 24.10.2018
 */
public class ConvertNumbersToOrdinal {

	public static String getNumberOrdinal(int n) {

		int firstDigit = n % 10;
		int secondDigit = Math.abs((n % 100) / 10);

		// return the ordinal output
		if (n < 0) {
			return "negative Zahlen haben keine Ordinalzahlen";
		}
		if (n == 0) {
			return "Für 'NULL' gibt's keine Ordinalzahl";
		} else if (n == 1000000) {
			return ConvertNumbersToCardinal.getNumberCardinal(n) + "ste";
		} else if (n == 1000000000) {
			return "eine Milliardste";
		} else if ((secondDigit) == 0 && (firstDigit) == 1) {
			return ConvertNumbersToCardinal.getNumberCardinal(n).substring(0,
					ConvertNumbersToCardinal.getNumberCardinal(n).length() - 4) + "erst...";
		} else if ((secondDigit) == 0 && (firstDigit) == 3) {
			return ConvertNumbersToCardinal.getNumberCardinal(n).substring(0,
					ConvertNumbersToCardinal.getNumberCardinal(n).length() - 4) + "dritt...";
		} else if ((secondDigit) == 0 && (firstDigit) == 7) {
			return ConvertNumbersToCardinal.getNumberCardinal(n).substring(0,
					ConvertNumbersToCardinal.getNumberCardinal(n).length() - 6) + "siebt...";
		} else if ((secondDigit) == 0 && (firstDigit) == 8) {
			return ConvertNumbersToCardinal.getNumberCardinal(n) + "...";
		} else if ((secondDigit) == 0 && (firstDigit) == 0) {
			return ConvertNumbersToCardinal.getNumberCardinal(n) + "st...";
		} else if ((n % 100) <= 19) {
			return ConvertNumbersToCardinal.getNumberCardinal(n) + "t...";
		} else
			return ConvertNumbersToCardinal.getNumberCardinal(n) + "st...";
	}
}
