package MyTest;

public class StringCalculator {
	   public static int add(final String numbers) {
	      int returnValue = 0;
	      String[] numbersArray = numbers.split(",|\n"); 
	      
	      //new functionalities
	      for(int i=0; i<numbersArray.length;i++) {
	    	  if(Integer.parseInt(numbersArray[i].trim())>=1000) {
	    		  numbersArray[i]="0";
	    	  }
	    	  if(Integer.parseInt(numbersArray[i].trim())<0) {
	    		  throw new IllegalArgumentException("negative number");
	    	  }
	    	  
	      }
	      //end of new functionalities
	      
	      
	      for (String number : numbersArray) {
	         if (!number.trim().isEmpty()) {
	            returnValue += Integer.parseInt(number.trim());
	         }
	      }
	      return returnValue;
	   }
	}