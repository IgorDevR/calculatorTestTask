package calculator;

import java.util.Map;

 class ArabicNumerals
{	
		
	
	static boolean isArabicNumeralsAndCheckRange(String firstNumStr,String secondNumStr )
	{				
		if(allowedArabicNumeralsMap.getOrDefault(firstNumStr, null)==null || 
			allowedArabicNumeralsMap.getOrDefault(secondNumStr, null)==null)
		{
			return false;
		}		
		
		return true;
	}
	
	
	static int paseArabicNumeral(String input)
	{
		int number = 0;		
	
		try 
		{						
			number = Integer.parseInt(input);			
		} 
		catch (Exception e) 
		{
			System.out.println("Invalid number entered");
		}
		
		return number;
	}
	
	static Map<String,Integer > allowedArabicNumeralsMap = Map.of(			
			"1", 1,
			"2", 2,
			"3", 3,
			"4", 4,
			"5", 5,
			"6", 6,
			"7", 7,
			"8", 8,	
			"9", 9,	
			"10", 10
			);
	
}
