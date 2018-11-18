package org.eclise.countgermandigits.internal;

/**
 * convert given digits to CARDINAL and return the output
 * @author Kyrellos Boutros
 * @version 1.0
 * @ since 24.10.2018
 */
public class ConvertNumbersToCardinal {

	public static final String[] unitsCardinal = { "", "ein", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht",
			"neun", "zehn", "elf", "zwölf", "dreizehn", "vierzehn", "fünfzehn", "sechzehn", "siebzehn", "achtzehn",
			"neunzehn" };

	public static final String[] bigNumCardinal = { "", "zehn", "zwanzig", "dreißig", "vierzig", "fünfzig", "sechzig",
			"siebzig", "achtzig", "neunzig" };

	// return the cardinal output
	public static String getNumberCardinal(int n) {
		if (n < 0) {
			return "Minus " + getNumberCardinal(-n);
		}
		if (n == 0) {
			return "null";
		} else if ((n % 100) == 1) {
			return convert(n) + "s";
		} else
			return convert(n);
	}

	// convert digits to cardinal
	public static String convert(final int n) {

		if (n < 0) {
			return convert(-n);
		}
		if (n < 20) {
			return unitsCardinal[n];
		}
		if (n >= 20 && n < 100) {
			if ((n % 10) == 0) {
				return bigNumCardinal[n / 10] + ((n % 10 != 0) ? "" : "");
			} else
				return unitsCardinal[n % 10] + "und" + bigNumCardinal[n / 10] + ((n % 10 != 0) ? "" : "");
		}
		if (n < 1000) {
			if ((n % 100) == 00) {
				return unitsCardinal[n / 100] + "hundert'";
			} else
				return unitsCardinal[n / 100] + "hundert'" + ((n % 100 != 0) ? "" : "") + convert(n % 100);
		}
		if (n < 1000000) {
			return convert(n / 1000) + "tausend'" + ((n % 1000 != 0) ? "" : "") + convert(n % 1000);
		}
		if (n == 1000000) {
			return "eine Million";
		}
		if (n == 1000000000) {
			return "eine Milliarde";
		}
		if (n < 1000000000) {
			return convert(n / 1000000) + " Millionen'" + ((n % 1000000 != 0) ? "" : "") + convert(n % 1000000);
		}
		String output = convert(n / 1000000000) + "eine Milliarde" + ((n % 1000000000 != 0) ? "" : "")
				+ convert(n % 1000000000);
		return output;
	}
}
