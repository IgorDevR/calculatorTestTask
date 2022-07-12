package calculator;

 class CheckCorrect
{
	 // проверка на длину
	 static boolean CheckCorrectLengthInput( String[] input)
	 {					 
		 if(input.length > 3)
			{
				return false;	
			}
		 return true;		 
	 }	  

}
