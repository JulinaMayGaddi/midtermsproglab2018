package codeForces914A;
public class perfectSquares {
	
	public double perfectSquare(int n) {
		int[] numbers = new int[n];
		double[] square = null;
		double largest = Integer.MIN_VALUE;
	    //Generates random numbers from 1 - 1000000
	    for(int i = 0; i < numbers.length; i++) {
	      numbers[i] = (int)(Math.random()*1000000 + 1);
	      
	      //Square the elements containing the numbers array
	      square = new double[numbers.length];
	      for(int j = 0; j < numbers.length; j++) {
	    	  square[j] = Math.sqrt(numbers[j]);	  
	      }
	    }//end for loop
	    /*find the largest value in the array
	     * get the 2nd power of the largest value
	     * round the value
	     * */
	    for ( int k = 1; k < square.length; k++ ){
	        if ( square[k] > largest ) {
	        	largest = Math.round(Math.pow(square[k],2));
	        }
	    }
	    return largest;
		
	}
}
