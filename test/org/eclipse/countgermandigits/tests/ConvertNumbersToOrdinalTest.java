package org.eclipse.countgermandigits.tests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.eclise.countgermandigits.internal.ConvertNumbersToOrdinal;

/**
 * Check right converting to ORDINAL numbers
 * 
 * @author Kyrellos Boutros
 * @version 1.0 
 * @ since 01.11.2018
 */
public class ConvertNumbersToOrdinalTest {



	@Test
		public void convertTillTenTest() {
			assertEquals("Check ordinal converting digit from -10 to 0", "negative Zahlen haben keine Ordinalzahlen", ConvertNumbersToOrdinal.getNumberOrdinal(-9));
			assertEquals("Check ordinal converting digit from 0 to 10", "erst...", ConvertNumbersToOrdinal.getNumberOrdinal(1));
			assertEquals("Check ordinal converting digit from 0 to 10", "zweit...", ConvertNumbersToOrdinal.getNumberOrdinal(2));
			assertEquals("Check ordinal converting digit from 0 to 10", "dritt...", ConvertNumbersToOrdinal.getNumberOrdinal(3));
			assertEquals("Check ordinal converting digit from 0 to 10", "viert...", ConvertNumbersToOrdinal.getNumberOrdinal(4));
			assertEquals("Check ordinal converting digit from 0 to 10", "fünft...", ConvertNumbersToOrdinal.getNumberOrdinal(5));
			assertEquals("Check ordinal converting digit from 0 to 10", "sechst...", ConvertNumbersToOrdinal.getNumberOrdinal(6));
			assertEquals("Check ordinal converting digit from 0 to 10", "siebt...", ConvertNumbersToOrdinal.getNumberOrdinal(7));
			assertEquals("Check ordinal converting digit from 0 to 10", "acht...", ConvertNumbersToOrdinal.getNumberOrdinal(8));
			assertEquals("Check ordinal converting digit from 0 to 10", "neunt...", ConvertNumbersToOrdinal.getNumberOrdinal(9));
			assertEquals("Check ordinal converting digit from 0 to 10", "zehnt...", ConvertNumbersToOrdinal.getNumberOrdinal(10));
		}

	@Test
		public void convertTillTwentyTest() {
			assertEquals("Check ordinal converting digit from -20 to -10", "negative Zahlen haben keine Ordinalzahlen", ConvertNumbersToOrdinal.getNumberOrdinal(-13));
			assertEquals("Check ordinal converting digit from 0 to 10", "elft...", ConvertNumbersToOrdinal.getNumberOrdinal(11));
			assertEquals("Check ordinal converting digit from 0 to 10", "zwölft...", ConvertNumbersToOrdinal.getNumberOrdinal(12));
			assertEquals("Check ordinal converting digit from 0 to 10", "dreizehnt...", ConvertNumbersToOrdinal.getNumberOrdinal(13));
			assertEquals("Check ordinal converting digit from 0 to 10", "vierzehnt...", ConvertNumbersToOrdinal.getNumberOrdinal(14));
			assertEquals("Check ordinal converting digit from 0 to 10", "fünfzehnt...", ConvertNumbersToOrdinal.getNumberOrdinal(15));
			assertEquals("Check ordinal converting digit from 0 to 10", "sechzehnt...", ConvertNumbersToOrdinal.getNumberOrdinal(16));
			assertEquals("Check ordinal converting digit from 0 to 10", "siebzehnt...", ConvertNumbersToOrdinal.getNumberOrdinal(17));
			assertEquals("Check ordinal converting digit from 0 to 10", "achtzehnt...", ConvertNumbersToOrdinal.getNumberOrdinal(18));
			assertEquals("Check ordinal converting digit from 0 to 10", "neunzehnt...", ConvertNumbersToOrdinal.getNumberOrdinal(19));
			assertEquals("Check ordinal converting digit from 0 to 10", "zwanzigst...", ConvertNumbersToOrdinal.getNumberOrdinal(20));
		}

	@Test
		public void convertTillHundredDigitsTest() {
			assertEquals("Check ordinal converting digit from -99 to -21", "negative Zahlen haben keine Ordinalzahlen", ConvertNumbersToOrdinal.getNumberOrdinal(-57));
			assertEquals("Check ordinal converting digit from 21 to 99", "dreißigst...", ConvertNumbersToOrdinal.getNumberOrdinal(30));
			assertEquals("Check ordinal converting digit from 21 to 99", "einundachtzigst...", ConvertNumbersToOrdinal.getNumberOrdinal(81));
		}

	@Test
		public void convertTillThousendDigitsTest() {
			assertEquals("Check ordinal converting digit from -999 to -100", "negative Zahlen haben keine Ordinalzahlen", ConvertNumbersToOrdinal.getNumberOrdinal(-999));
			assertEquals("Check ordinal converting digit from 100 to 999", "einhundert'st...", ConvertNumbersToOrdinal.getNumberOrdinal(100));
			assertEquals("Check ordinal converting digit from 100 to 999", "dreihundert'fünft...", ConvertNumbersToOrdinal.getNumberOrdinal(305));
			assertEquals("Check ordinal converting digit from 100 to 999", "sechshundert'elft...", ConvertNumbersToOrdinal.getNumberOrdinal(611));
		}

	@Test
		public void convertTillHundredThousandsDigitsTest() {
		
			assertEquals("Check ordinal converting digit from -999999 to -1000", "negative Zahlen haben keine Ordinalzahlen", ConvertNumbersToOrdinal.getNumberOrdinal(-4506));

			assertEquals("Check ordinal converting digit from 1000 to 9999", "zweitausend'erst...", ConvertNumbersToOrdinal.getNumberOrdinal(2001));
			assertEquals("Check ordinal converting digit from 1000 to 9999", "neuntausend'neunhundert'neunzigst...", ConvertNumbersToOrdinal.getNumberOrdinal(9990));
			assertEquals("Check ordinal converting digit from 10000 to 999999", "dreihundert'tausend'st...", ConvertNumbersToOrdinal.getNumberOrdinal(300000));
			assertEquals("Check ordinal converting digit from 10000 to 999999", "dreihundert'tausend'einhundert'elft...", ConvertNumbersToOrdinal.getNumberOrdinal(300111));
			assertEquals("Check ordinal converting digit from 10000 to 999999", "dreihundert'elftausend'erst...", ConvertNumbersToOrdinal.getNumberOrdinal(311001));
			assertEquals("Check ordinal converting digit from 10000 to 999999", "dreihundert'elftausend'einhundert'erst...", ConvertNumbersToOrdinal.getNumberOrdinal(311101));


		}

	@Test
		public void convertTillHundredMillionDigitsTest() {
			assertEquals("Check ordinal converting digit from -999999999 to -1000000", "negative Zahlen haben keine Ordinalzahlen", ConvertNumbersToOrdinal.getNumberOrdinal(-67809010));

			assertEquals("Check ordinal converting digit from 1000000 to 999999999", "dreihundert'einundzwanzig Millionen'achthundert'neunundsiebzigst...", ConvertNumbersToOrdinal.getNumberOrdinal(321000879));
			assertEquals("Check ordinal converting digit from 1000000 to 999999999", "fünfhundert'vier Millionen'dreißigtausend'zweihundert'erst...", ConvertNumbersToOrdinal.getNumberOrdinal(504030201));
			assertEquals("Check ordinal converting digit from 1000000 to 999999999", "siebenhundert'neunundachtzig Millionen'fünfundsechzigtausend'dreiundvierzigst...", ConvertNumbersToOrdinal.getNumberOrdinal(789065043));
			assertEquals("Check ordinal converting digit from 1000000 to 999999999", "neunhundert'neunundneunzig Millionen'neunhundert'neunundneunzigtausend'neunhundert'neunundneunzigst...", ConvertNumbersToOrdinal.getNumberOrdinal(999999999));

		}

	@Test
		public void convertSpecialCaseTest() {
			assertEquals("Check ordinal converting digit 0", "Für 'NULL' gibt's keine Ordinalzahl", ConvertNumbersToOrdinal.getNumberOrdinal(0));
			assertEquals("Check ordinal converting digit 1000000", "eine Millionste", ConvertNumbersToOrdinal.getNumberOrdinal(1000000));
			assertEquals("Check ordinal converting digit 100000000", "einhundert' Millionen'st...", ConvertNumbersToOrdinal.getNumberOrdinal(100000000));
			assertEquals("Check ordinal converting digit 1000000000", "eine Milliardste", ConvertNumbersToOrdinal.getNumberOrdinal(1000000000));
			
		}
}
