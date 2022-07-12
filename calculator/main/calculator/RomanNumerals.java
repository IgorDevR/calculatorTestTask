package calculator;
import java.util.*;

class RomanNumerals
{
	
	
	static boolean isRomanNumeralsAndCheckRange(String firstNumStr,String secondNumStr )
	{				
		if(allowedRomanNumeralsAndRangeMap.getOrDefault(firstNumStr, null)==null || 
				allowedRomanNumeralsAndRangeMap.getOrDefault(secondNumStr, null)==null)
		{
			return false;
		}		
		
		return true;
	}
		
	static int convertRomanNumeralsStringToInt(String numberStr)
	{
		int result = allowedRomanNumeralsAndRangeMap.getOrDefault(numberStr, null);		
		return result;
	}
	
	 
	 static Map<String,Integer > allowedRomanNumeralsAndRangeMap = Map.of(
		
			"I", 1,
			"II", 2,
			"III", 3,
			"IV", 4,
			"V", 5,
			"VI", 6,
			"VII", 7,
			"VIII", 8,
			"IX", 9,	
			"X", 10
			);
	 
	 	  
	  

	   static String convertRomanNumeralsIntToString(int number) {
		    return String.join("", Collections.nCopies(number, "I"))
		            .replace("IIIII", "V")
		            .replace("IIII", "IV")
		            .replace("VV", "X")
		            .replace("VIV", "IX")
		            .replace("XXXXX", "L")
		            .replace("XXXX", "XL")
		            .replace("LL", "C")
		            .replace("LXL", "XC")
		            .replace("CCCCC", "D")
		            .replace("CCCC", "CD")
		            .replace("DD", "M")
		            .replace("DCD", "CM");
		}
	
	
}
