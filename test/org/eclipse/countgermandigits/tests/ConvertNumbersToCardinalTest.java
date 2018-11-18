package org.eclipse.countgermandigits.tests;

import static org.junit.Assert.assertEquals;

import org.eclise.countgermandigits.internal.ConvertNumbersToCardinal;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * Check right converting to CARDINAL numbers
 * 
 * @author Kyrellos Boutros 
 * @version 1.0
 * @ since 01.11.2018
 */
public class ConvertNumbersToCardinalTest {

	private static final String DEFAULT_REGEX = "^([-]?[1-9][0-9]{0,8}|0|1000000000|-1000000000)$";

	@Test
	public void convertFirstDigitsTest() {
		assertEquals("Check cardinal converting digit from -20 to 0", "Minus dreizehn",
				ConvertNumbersToCardinal.getNumberCardinal(-13));
		assertEquals("Check cardinal converting digit from 0 to 20", "fünf",
				ConvertNumbersToCardinal.getNumberCardinal(5));
		assertEquals("Check cardinal converting digit from 21 to 100", "zwanzig",
				ConvertNumbersToCardinal.getNumberCardinal(20));
	}

	@Test
	public void convertTillHundredDigitsTest() {
		assertEquals("Check cardinal converting digit from -99 to -21", "Minus vierundneunzig",
				ConvertNumbersToCardinal.getNumberCardinal(-94));
		assertEquals("Check cardinal converting digit from -99 to -21", "Minus siebenundfünfzig",
				ConvertNumbersToCardinal.getNumberCardinal(-57));
		assertEquals("Check cardinal converting digit from 21 to 99", "dreißig",
				ConvertNumbersToCardinal.getNumberCardinal(30));
		assertEquals("Check cardinal converting digit from 21 to 99", "einundachtzig",
				ConvertNumbersToCardinal.getNumberCardinal(81));
	}

	@Test
	public void convertTillThousendDigitsTest() {
		assertEquals("Check cardinal converting digit from -999 to -100", "Minus neunhundert'neunundneunzig",
				ConvertNumbersToCardinal.getNumberCardinal(-999));
		assertEquals("Check cardinal converting digit from -999 to -100", "Minus zweihundert'eins",
				ConvertNumbersToCardinal.getNumberCardinal(-201));
		assertEquals("Check cardinal converting digit from 100 to 999", "einhundert'",
				ConvertNumbersToCardinal.getNumberCardinal(100));
		assertEquals("Check cardinal converting digit from 100 to 999", "dreihundert'fünf",
				ConvertNumbersToCardinal.getNumberCardinal(305));
		assertEquals("Check cardinal converting digit from 100 to 999", "sechshundert'elf",
				ConvertNumbersToCardinal.getNumberCardinal(611));
	}

	@Test
	public void convertTillHundredThousandsDigitsTest() {
		assertEquals("Check cardinal converting digit from -999999 to -1000",
				"Minus dreihundert'zehntausend'einhundert'eins", ConvertNumbersToCardinal.getNumberCardinal(-310101));
		assertEquals("Check cardinal converting digit from -999999 to -1000",
				"Minus dreihundert'eintausend'einhundert'eins", ConvertNumbersToCardinal.getNumberCardinal(-301101));
		assertEquals("Check cardinal converting digit from -999999 to -1000", "Minus dreihundert'eintausend'eins",
				ConvertNumbersToCardinal.getNumberCardinal(-301001));
		assertEquals("Check cardinal converting digit from -999999 to -1000", "Minus einhundert'tausend'eins",
				ConvertNumbersToCardinal.getNumberCardinal(-100001));
		assertEquals("Check cardinal converting digit from -999999 to -1000", "Minus siebentausend'zweiundzwanzig",
				ConvertNumbersToCardinal.getNumberCardinal(-7022));
		assertEquals("Check cardinal converting digit from -999999 to -1000", "Minus viertausend'fünfhundert'sechs",
				ConvertNumbersToCardinal.getNumberCardinal(-4506));

		assertEquals("Check cardinal converting digit from 1000 to 9999", "zweitausend'eins",
				ConvertNumbersToCardinal.getNumberCardinal(2001));
		assertEquals("Check cardinal converting digit from 1000 to 9999", "neuntausend'neunhundert'neunzig",
				ConvertNumbersToCardinal.getNumberCardinal(9990));
		assertEquals("Check cardinal converting digit from 10000 to 999999", "dreihundert'tausend'",
				ConvertNumbersToCardinal.getNumberCardinal(300000));
		assertEquals("Check cardinal converting digit from 10000 to 999999", "dreihundert'tausend'einhundert'elf",
				ConvertNumbersToCardinal.getNumberCardinal(300111));
		assertEquals("Check cardinal converting digit from 10000 to 999999", "dreihundert'elftausend'eins",
				ConvertNumbersToCardinal.getNumberCardinal(311001));
		assertEquals("Check cardinal converting digit from 10000 to 999999", "dreihundert'elftausend'einhundert'eins",
				ConvertNumbersToCardinal.getNumberCardinal(311101));

	}

	@Test
	public void convertTillHundredMillionDigitsTest() {
		assertEquals("Check cardinal converting digit from -999999999 to -1000000",
				"Minus siebenundsechzig Millionen'achthundert'neuntausend'zehn",
				ConvertNumbersToCardinal.getNumberCardinal(-67809010));
		assertEquals("Check cardinal converting digit from -999999999 to -1000000",
				"Minus vierundfünfzig Millionen'sechshundert'achtundsiebzigtausend'neunhundert'zwölf",
				ConvertNumbersToCardinal.getNumberCardinal(-54678912));
		assertEquals("Check cardinal converting digit from -999999999 to -1000000",
				"Minus drei Millionen'vierzigtausend'zweihundert'eins",
				ConvertNumbersToCardinal.getNumberCardinal(-3040201));
		assertEquals("Check cardinal converting digit from -999999999 to -1000000", "Minus zwei Millionen'",
				ConvertNumbersToCardinal.getNumberCardinal(-2000000));

		assertEquals("Check cardinal converting digit from 1000000 to 999999999",
				"dreihundert'einundzwanzig Millionen'achthundert'neunundsiebzig",
				ConvertNumbersToCardinal.getNumberCardinal(321000879));
		assertEquals("Check cardinal converting digit from 1000000 to 999999999",
				"fünfhundert'vier Millionen'dreißigtausend'zweihundert'eins",
				ConvertNumbersToCardinal.getNumberCardinal(504030201));
		assertEquals("Check cardinal converting digit from 1000000 to 999999999",
				"siebenhundert'neunundachtzig Millionen'fünfundsechzigtausend'dreiundvierzig",
				ConvertNumbersToCardinal.getNumberCardinal(789065043));
		assertEquals("Check cardinal converting digit from 1000000 to 999999999",
				"neunhundert'neunundneunzig Millionen'neunhundert'neunundneunzigtausend'neunhundert'neunundneunzig",
				ConvertNumbersToCardinal.getNumberCardinal(999999999));

	}

	@Test
	public void convertSpecialCaseTest() {
		assertEquals("Check cardinal converting digit 0", "null", ConvertNumbersToCardinal.getNumberCardinal(0));
		assertEquals("Check cardinal converting digit 6", "sechs", ConvertNumbersToCardinal.getNumberCardinal(6));
		assertEquals("Check cardinal converting digit 16", "sechzehn", ConvertNumbersToCardinal.getNumberCardinal(16));
		assertEquals("Check cardinal converting digit 26", "sechsundzwanzig",
				ConvertNumbersToCardinal.getNumberCardinal(26));
		assertEquals("Check cardinal converting digit 60", "sechzig", ConvertNumbersToCardinal.getNumberCardinal(60));
		assertEquals("Check cardinal converting digit -1000000", "Minus eine Million",
				ConvertNumbersToCardinal.getNumberCardinal(-1000000));
		assertEquals("Check cardinal converting digit 100000000", "einhundert' Millionen'",
				ConvertNumbersToCardinal.getNumberCardinal(100000000));
		assertEquals("Check cardinal converting digit -1000000000", "Minus eine Milliarde",
				ConvertNumbersToCardinal.getNumberCardinal(-1000000000));

	}

	@Test
	public void validateInputTest() {

		String doubleZero = "00";
		String zeroAtFirst = "0987";
		String empty = "";
		String text = "text";
		String sign = "/";
		String decimalPoint = "44.5";
		String decimalComma = "638,765";
		String digitAndText = "2z6";
		String digitAndSign = "6-9";
		String longDigit = "1000000001";
		String firstRightInput = "56";
		String secondRightInput = "1000000000";

		Assert.assertEquals(false, doubleZero.matches(DEFAULT_REGEX));
		Assert.assertEquals(false, zeroAtFirst.matches(DEFAULT_REGEX));
		Assert.assertEquals(false, empty.matches(DEFAULT_REGEX));
		Assert.assertEquals(false, text.matches(DEFAULT_REGEX));
		Assert.assertEquals(false, sign.matches(DEFAULT_REGEX));
		Assert.assertEquals(false, decimalPoint.matches(DEFAULT_REGEX));
		Assert.assertEquals(false, decimalComma.matches(DEFAULT_REGEX));
		Assert.assertEquals(false, digitAndText.matches(DEFAULT_REGEX));
		Assert.assertEquals(false, digitAndSign.matches(DEFAULT_REGEX));
		Assert.assertEquals(false, longDigit.matches(DEFAULT_REGEX));
		Assert.assertEquals(true, firstRightInput.matches(DEFAULT_REGEX));
		Assert.assertEquals(true, secondRightInput.matches(DEFAULT_REGEX));

	}
}
