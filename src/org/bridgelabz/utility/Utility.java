//sushant

package org.bridgelabz.utility;

import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Utility 
{
	static int counter=0;
	//static Utility utility = new Utility();

	static Scanner sc = new Scanner(System.in);

	// INPUT STRING
		/**
		 * @return : String
		 */

		public static String inputStringNext() 
		{
			try {
				return sc.next();

			    } 
			    catch (Exception e) 
			    {
				//System.out.println(e);
			    }
			    return "";
		}

	// INPUT STRING
	/**
	 * @return : String
	 */

	public static String inputString() 
	{
		try {
			return sc.nextLine();

		    } 
		    catch (Exception e) 
		    {
			//System.out.println(e);
		    }
		    return "";
	}

	// INPUT INTEGER
	/**
	 * @return :Integer
	 */
	public static int inputInteger() 
	{
		try {
			return sc.nextInt();
		    }
		catch (Exception e) 
		    {
			//System.out.println(e);
		    }
		return 0;
	}

	// Double value
	/**
	 * @return :double
	 */
	public static double inputDouble() 
	{
		try {
			return sc.nextDouble();
		} catch (Exception e) {
			//System.out.println(e);
		}
		return 0.0;
	}

	/**
	 * @return : boolean
	 */
	public static boolean inputBoolean() {
		try {
			return sc.nextBoolean();
		} catch (Exception e) {
		//	System.out.println(e);
		}
		return true;
	}

	/**
	 * @return :float
	 */
	public static float inputFloat() {
		try {
			return sc.nextFloat();
		} catch (Exception e) {
			//System.out.println(e);
		}
		return (float) 0.0;
	}

	/**
	 * @return : Long
	 */
	public static long inputLong() {
		try {
			return sc.nextLong();
		} catch (Exception e) {
			//System.out.println(e);
		}
		return 0;

	}
//========================================================================================================
	  
//#ques no 02
	
	 
    /**
     * To flip coin nos of times to check head or tail
     * 
     * @param totaltoss 
     */
	public static void flipcoin(int totaltoss) 
	{
		int tailcount = 0, headcount = 0;

		for (int i = 0; i < totaltoss; i++) 
		{
		   double n= Math.random();
		   
			  System.out.println(n);
		
			if (n< 0.5) 
			{
				tailcount++;

			}
			else 
			  {
				headcount++;
			  }
		}

		System.out.println("The number of head is :" + headcount );	
		System.out.println("The number of tails us :" + tailcount );
		
		int headpercentage = (headcount * 100) / totaltoss;
		int tailpercentage = (tailcount * 100) / totaltoss;
		
		System.out.println("The percentage of head is :" + headpercentage);
		System.out.println("The percentage of tail is :" + tailpercentage);

	}
	
//=============================================================================================
	
//#3 ques no3

	/**
	 * To check whether the i/p year is a leap mis leap or not
	 * 
	 * @param year : user enetered year
	 */
	public static void checkLeapyear(int year)
	{
		if ( (year % 4 == 0) && (year % 100!= 0) ) 
		{
			System.out.print("This is a Leap Year");
		}
		else
			if ( year % 400 == 0) 
			{
					System.out.print("This is a Leap Year");
			} 
			else
				{
					System.out.print("This is not a Leap Year");
				}
	}
		
//===================================================================================================

//#4 ques no4 
	
	/**
	 * To calculate the power of 2
	 * 
	 * @param N : the i/p nth no---till which we want to print 
	 */
	public static void powerof2(int N)
	{ 
		int mul;
	
			/**
			 * 
			 */
			for(int i=1;i<=N;i++)
			{
		
					mul=2*i;
					System.out.println("2^ "+i +" ="+ mul);
			}
	
	}
//=============================================================================================

//#5 ques 5
	
		/**
		 * to find the harmonic value of nth no
		 * 
		 * @param N : taking nth no 
		 * 
		 * @return  : Double
		 */
		public static double harmonicno(int N)
		{   
			double sum=0.0;  //Harmonic Value is always in double only 
			
			for(int i=1; i<=N;i++)
			{
				sum = sum + ((1.0/i));
			}
			
			return sum;	//returning back the value
		}
		
//=============================================================================================
//#6 ques no6
		
		/**
		 * to find prime factor using bute force
		 * 
		 * @param n
		 * @return :void
		 */
		public static void primeFactorBruteForce(long n)
		{
			/**
	         * to find  for each potential factor
	         */
	        for (int factor = 2; factor*factor <= n; factor++) 
	        {
	
	            // if factor--- is a factor of n, repeatedly divide it out
	            while (n % factor == 0)
	            {
	                System.out.print(factor + " "); 
	                n = n / factor;
	            }
	        }
	
	        // if biggest factor occurs only once, n > 1
	        if (n > 1)
	        	{
	        		System.out.println(n);
	        	}
		}
//=============================================================================================
//#7 ques no7
		//Random class---to generate Random nos
				static Random rn=new Random();
				
				static int bets = 0;        // total number of bets made
		        static int wins = 0;        // total number of games won
		        static int loose = 0; 		// total number of games loose
		
		/**
		 * to calculate winds and loose----in the play
		 * 
		 * @param goal    
		 * @param amount
		 * @param n
		 */
		public static void gambler(int goal,int amount,int n)
		{
		 for(int i=0;i<=n;i++)
	        {
	        	int randomno=rn.nextInt(6)+1; // {0 to 5}+ 1 ---between 0 to 6 nos r generated  
	        	
					bets++;
					
					if(randomno>3) 		//we can also take stake like 0 to 0.5
					{
						wins++;
						
						amount++;
						
						System.out.println("new amount is:"+wins);	
					}
					else
					{
						loose++;
						
						amount++;
					}

	        } 	
	        
	        System.out.println("\n"+"wins times is:"+ wins);
	        System.out.println("loose times is:"+ loose);
	        
	        //to calculate total of wins and loose
	        int totalcount=wins+loose;
			
	        // print results
	        System.out.println("wins percentage games = " + ((wins*100) /totalcount) );
		} 
//=============================================================================================
	
		//#8 ques no8


			//here we use Math random fuction 
		    // return a random coupon between 0 and 1
		
			/**
			 * To generate random coupon using math.random function
			 * @param n
			 * @return : integer
			 */
		    public static int getrandomCoupon(int n) 		//if n=162
		    {
		        return (int)(Math.random() * n);			//then {162 *0.7 =...}----anything will multiple by 162
		    }

		    /**
		     * return number of cards you collect before obtaining one of each of the n types
		     * @param n
		     * @return  : long
		     */
		    public static long collect(int n) 				//#1 //if n=162
		    {
		    	//#2 //then make array of 162
		        boolean[] arr= new boolean[n];  // isCollected[i] = true if card type i already collected
		        
		        System.out.println("their distinct coupon are :");
		        
		        int count = 0;                           // number of cards collected generated distinct/non distinct 
		        int nos= 0;                       // number of distinct card types collected

		        // repeat until you've collected all n card types
		        while (nos < n) 
		        {
		            int value = getrandomCoupon(n);         // getrandomCoupon(n)-----will return a random card 
		            count++;                             // one more card
		            
		            //whole array is by default false/null
		            if (!arr[value]) 						//#3 //if value=162*0.7--- then check in arr[value] if their is true or not  
		            {           //#4 // false at arr[162] means we not got nos yet
		                nos++;
		                arr[value] = true;		//set arr
		                System.out.print(value +" , ");
		            }
		        }
		        return count;
		    }
//=============================================================================================
//#9 ques no9		
		    
		    /**
		     * to print the twoDarray
		     * @return: void
		     */
		    public static void twodarray()
			{  
				//Data to write on Console using PrintWriter  
			      PrintWriter writer = new PrintWriter(System.out); 
			      
				int i,j;

				Object arr[][]=new Object[3][3];
				//int arr[][]=new int[3][3];   
				
			
						for(i=0;i<3;i++)
						  {  
							System.out.println("enter elements for the row no:"+i);
							for(j=0;j<3;j++)
							{  
									arr[i][j]=Utility.inputInteger();  
							}  
							System.out.println();  
						  } 
						
				//printing 2D array  
				for(i=0;i<3;i++)
				  {   
					for(j=0;j<3;j++)
					{  
						  //Writer class---write method is to write(print) object
						  writer.write(arr[i][j]+" ");  
						  
						  //Writer class---flush method will--flush the whole stream  /#/ refer javatpoint
						  writer.flush();  	     
				    }  
					  System.out.println(); 
			      }

			}
//=============================================================================================
			
//#10 ques no10
		    
			/**
			 * Prints all triplets in arr[] with 0 sum 
			 * 
			 * @param arr : N nos Array
			 * @param n   : the length of the N nos--array
			 * 
			 * @return     : void
			 */
			public static void findTriplets(int[] arr, int n) 
			{ 
					boolean found= false; 
					
						for (int i=0; i<n-2; i++) 
						{ 
							for (int j=i+1; j<n-1; j++) 
							{ 
								for (int k=i+1; k<n; k++) 
								{ 
										if (arr[i]+arr[j]+arr[k] == 0) 
										{ 
											System.out.print(arr[i]); 
											System.out.print(" "); 
											System.out.print(arr[j]); 
											System.out.print(" "); 
											System.out.print(arr[k]); 
											System.out.print("\n"); 
											
											found = true; 
										} 
								} 
							} 
						} 

				// If no triplet with 0 sum found in array 
						if (found == false) 
							System.out.println(" not exist "); 
			} 
//=============================================================================================		
//#11 ques no11
			
			/**
			 * To find Euclidian distance between two points 
			 * 
			 * @param x1
			 * @param y1
			 * @param x2
			 * @param y2
			 * 
			 * @return : void
			 */
			public static void distance(double x1, double y1, double x2, double y2) 
			{
				double d=(9.0);
				
				double dis = Math.sqrt(d);  

				System.out.println("distance between the points:" + dis);
			}
			
//=============================================================================================
	
			//*****************************************STRING RECURSION**************************************************
//#12 ques no12
		
		static String reverse = "";    //A String is creted outof FOR LOOP--so that multi string cannot be created 
		  
		/**
		 * to find reverse of string using Recursion 
		 * 
		 * @param str : input string 
		 * @return    : String
		 */
		public static String reverseString(String str)
		{
			 //if the String---while doing Rerusion become null(i.e of char of String is reversed)
			 // the return the Reverse String str
			  if(str.length() == 0)
			  {
			        return str;
			  }
			  else 
			  {
			        reverse = reverse + str.charAt(str.length()-1);
			                 
			        System.out.println(reverse);
			                 
			        reverseString(str.substring(0,str.length()-1));  //Recursion /#/so we can directly call the Mathod again
			       
			        return reverse;
			   }
	     }
		
	//*****************************************STRING PERMUTATION**************************************************
		
		  /** 
	     * Swap Characters at position 
	     * @param a string value 
	     * @param i position 1 
	     * @param j position 2 
	     * @return swapped string 
	     */
	    
	               //  str = swap(str , l , i);
	    public static String swap(String a, int l, int i) //abc 0 0 
	    { 
	        char temp; 
	        char[] charArray = a.toCharArray(); 
	        temp = charArray[l] ; 
	        charArray[l] = charArray[i]; 
	        charArray[i] = temp; 
	        return String.valueOf(charArray); 
	    } 
		
		/** 
	     * permutation function 
	     * @param str string to calculate permutation for 
	     * @param l starting index 
	     * @param r end index 
	     */
	
	 		  			//initally    permute(ABC , 0 ,  2)
	    public static void stringPermutation(String str, int l, int r) 
	    { 
	        if (l == r) 
	        {   System.out.println(str); 
	        	System.out.println("*************************");
	        }
	        else
	        { 
	            for (int i = l; i <= r; i++)   //abc
	            { 
	            	System.out.println("(i goes from==> l to r)");
	            	System.out.println("print i="+i);
	            	System.out.println("print l="+l);
	            	System.out.println("print r="+r);
	            	 
	            	//for level 1   l=0 will initially 
	                str = swap(str,l,i);             //bwithb
	                System.out.println("----"+str);
	                
	                stringPermutation(str, l+1, r);      //c
	               // str = swap(str,l,i); 
	            } 
	        } 
	    } 
	  
	  
//Stopwatch time=====================================================================================================
//#13 ques no13
		
		//System class---is by default in java.lang  	    
		  /**
		   * Stopwatch to find time
		   * 
		   * @return :long
		   */
		  public static long stopwatch() 
		  {			
				//started stopwatch
					System.out.println("Enter any number to start----stopwatch");
					int s=sc.nextInt();
					
					long start = System.currentTimeMillis();
				
				//end stopwatch
					System.out.println("Enter any number to end----stopwatch");
					int e=sc.nextInt();
					
				    long now = System.currentTimeMillis();
				       
				    ///calculating the difference between------{the two nos enetered}
				      return (long) ((now - start) / 1000.0);
					
		   }

//Find Roots of Quadratic==========================================================================================
//#15 ques no15
		  
		  /**
		   * to find roots using Standard Quadratic formula
		   * @param a
		   * @param b
		   * @param c
		   * 
		   * @return : void
		   */
		  public static void rootsofQuadratic(int a, int b, int c)
		  {
			  	//delta = b*b - 4*a*c
				int d = b * b - 4 * a * c;
				
				if (d > 0)
				{
					System.out.println("Roots of the equation are real and unequal");
					
					//Standard formula
					double root1 = (-b + Math.sqrt(d)) / (2 * a);		//1st root
					double root2 = (-b - Math.sqrt(d)) / (2 * a);		//2nd root
					
					System.out.println("First root is:" + root1);
					  System.out.println("Second root is:" + root2);
				} 
				else 
					   if (d == 0)
						{
							System.out.println("Roots of the equation are real and equal");
							
							double root1 = (-b + Math.sqrt(d)) / (2 * a);
									System.out.println("Root:" + root1);
						}
						else 
						{
								System.out.println("Roots of the given equation are imaginary");
						}

			}

//Weather windchill ===============================================================================================
//#16 ques no16
		  
		  /**
		   * to check the effective temperature defined by National Weather (the wind chill)
		   * @param temp
		   * @param speed
		   * 
		   * @return : void
		   */
	      public static void  WeatherService(int temp,int speed)
		  {  
			  if ( (temp > 50) && ( speed > 3  &&  speed < 120 ) ) 
			    {
					System.out.println("The temperature is: " + temp + "  ,,,The windspeed is: " + speed);
					
					System.out.print("The speed to the power 0.16 is ");
					
						double speedpow = Math.pow(speed, 0.16);
					System.out.println(speedpow);
					
					double windchill = (35.74 + 0.6125 * temp + (0.4275 * temp - 35.75) * speedpow);
					System.out.println("The Weather windchill is:" + windchill);
				}
			  else
			    {
					System.out.println("Enter correct temperature and windspeed");

				}
		  }
//===================================================================================================================
		    // System.out.println("Avg # bets           = " + ((loose*100) / trials)); 
/*	// A function to print all prime factors 
    // of a given number n 
	public static void primefactor(int n)
	{ 
	        public static void main(String[] args) { 

	            // command-line argument
	            long n = Long.parseLong(args[0]);

	            System.out.print("The prime factorization of " + n + " is: ");

	            // for each potential factor
	            for (long factor = 2; factor*factor <= n; factor++) {

	                // if factor is a factor of n, repeatedly divide it out
	                while (n % factor == 0) {
	                    System.out.print(factor + " "); 
	                    n = n / factor;
	                }
	            }

	            // if biggest factor occurs only once, n > 1
	            if (n > 1) System.out.println(n);
	            else       System.out.println();
	        }
	}   
	        // n must be odd at this point.  So we can 
	        // skip one element (Note i = i +2) 
	        for (int i = 3; i <= Math.sqrt(n); i=i+ 2) ////3 5 7 9 
	        { 
	            // While i divides n, print i and divide n 
	            while (n%i == 0) 
	            { 
	                System.out.print(i + " "); 
	                n =(n/ i); 
	            } 
	        } 
	  
	        // This condition is to handle the case whien 
	        // n is a prime number greater than 2 
	        if (n > 2) 
	            System.out.print(n); 
	  } 
	*/
		

 /*==================================================
	Sum of three Integer adds to ZERO
	
	Here we use a Single array 
		We want 3 different nos of the----Same Single array as i/p to get SUM as 0
	
	So we take 3 variable i,j,k---on Same Single Array
	   i (1 to n-2)
	   j (2 to n-1)
	   k (3 to n  )
	  ===================================================== 
*/

	
	



	

	  
	  






//***888888888888888888888888888888 Alogrithm Program 8888888888888888888888888888888888888888888888

//#ques no 01
	
	 /**
	  * 
	  * @param str1 :User i/p String1
	  * @param str2 :User i/p String2
	  * @return Boolean 
	  */
	 public static boolean anagram(String str1, String str2) 
	 {  
	    
	       /*if their is place between two string--------- then replace it with "" 	
	        String s1 = str1.replaceAll("\\s", "");  
	        String s2 = str2.replaceAll("\\s", "");  
	       */
	    	
		   //converting string to int array
	       int c1[]= countAlpha(str1);  //----here call countAlpha method
	       int c2[]= countAlpha(str2);
	        
              /**
               * to check whether each character matching or not, return tru or false
               */
	       		for(int i=0;i<26;i++)
	       		{
		    	   if(c1[i]!=c2[i])
		    	   {
		    		   return false;
		    	   }
	       		}  
	           return true;
	       
	   }
	    
	 /**
	  * 
	  * @param st : Passed each I/p String here to put Count of each charcter in Array
	  * @return   : count Array
	  */
	    static int[] countAlpha(String st) 
	    { 
	    	int count[]=new int[26];
	    
	       for(int i=0;i<st.length();i++)
	       {
	    	   char ch=st.charAt(i);
	    	   
	    	   if(ch>='A' && ch<='Z')
	    	   {
	    		  count[ch-65]++;
	    	   }
	    	   else
	    		   if(ch>='a' && ch<='z')
	    		   { 
	    			   count[ch-97]++;
	               }
	       }
	       return count; 
	    }
	   

 //Prime no between 1 10 1000========================================================================================
//#ques no 02
	    
	  	  /**
	  	   * To print the prime nos--of given range
	  	   * 
	  	   * @param start
	  	   * @param end
	  	   * @return : void
	  	   */
	  	  public static void primenos(int start,int end)
	  	  {
	  		  		// to print prime nos
	  			  	for (int i = start; i <= end; i++)
	  			  	{  
	  			  		  //method call--prime logic
	  			  			if (isPrime(i)) 
	  			  			{  
	  			  				System.out.print(i+" ");  
	  			  			} 
	  			  	}  
	  	      
	  	  }  
	    
	  	  /**
	  	   * check the no---is prime or not
	  	   * @param n
	  	   * @return : boolean
	  	   */
	  	  public static boolean isPrime(int n) //e.g n=15 any no----from the given range
	  	  {  
	  		  int m = n/2;
	  		  
	  		  		if (n <= 1)  //e.g n=15
	  		  		{  
	  		  			return false;  
	  		  		}  
	        
	  		  	//e.g n=15
	  		  	for (int i = 2; i <= m; i++) //------use use n/2 ,if we use MAth.sqrt(n) and if n=25...answer is 5...so directy print not p
	  		  	{  
	  		  			if (n % i == 0)
	  		  			{  
	  		  					return false;  
	  		  			}  
	  		  	}  
	         
	  		  	return true;  
	  	  }    
		  
//===================================================================================================
//#ques no 03
	  	  
	  	 /**
	  	  * check the no---is prime or not
	  	  * @param n
	  	  * @return : boolean
	  	  */
	  	 public static boolean isPrime2(int n) //e.g n=15 any no----from the given range
		  {  
			  		if (n <= 1)  //e.g n=15
			  		{  
			  			return false;  
			  		}  
	      
			  	//e.g n=15
			  	for (int i = 2; i <= Math.sqrt(n); i++) //------use math.sqrt(n) or use n/2
			  	{  
			  			if (n % i == 0)
			  			{  
			  					return false;  
			  			}  
			  	}  
	       
			  	return true;  
		  }  
	  	 
	  	 /**
	  	  * to get palindrome of a no
	  	  * @param m
	  	  * @return : Integer
	  	  */
	  	 public static int palindrome(int m)
		  {
			  int r,sum=0,temp; 
			  
			  //It is the number variable to be checked for palindrome    
			  
			  while(m>0)
			  {    
			     r =   m % 10;  //getting remainder  
			     sum= ( sum * 10 ) + r;    
			     m = m / 10;    
			  }    
			  
	          return sum; 
		  }
	  	 
	  	 /**
	  	  * to find Prime and Anagram----of given range nos 
	  	  * @param start
	  	  * @param end
	  	  */
		  public static void  primeAndAngaram(int start,int end)
		  {	 
		  
			    //make any size array
			  	int[] arr=new int[end]; 
			  	
			  	//to find prime 
			  	for (int i = start; i <= end; i++)
			  	{  
			  		//#1//call goes to isPrime2 method--to check prime or not
			  			if (isPrime2(i)) 
			  			{  
			  				arr[counter]=i;
			  				
			  				counter++;
			  			}  
			  	}  
			  	
				//to print normal array---of prime nos
			  	for (int k=0; k<counter; k++)
				  	{  
				  			System.out.print(arr[k]+" ");
				  	}
			  	
			  	System.out.println(" ");
			  	System.out.println("Now anagram and palindrome nos r as follows:");
			  	System.out.println(" ");
			  	
			  	for (int j=0; j<counter; j++)
			  	{  
			  					//#2//call goes to get palindrome of a  no
			  					int reverse= palindrome(arr[j]);
			  		 
			  		 //matching the palindrome of every no---with the Array(of prime no)
			  	     for(int k=0; k<counter; k++)
			  	     {
			  	    	 if(arr[k]==reverse)
			  	    	 {
			  	    		 		System.out.println(arr[j] +" , "+arr[k]);
			  	    	 }
			  	     }
			  	}
			  	
		  }  

//===================================================================================================
//#ques no 04
		 
		//////1) Binary
		  
		  /**
		   * Binary search method 
		   * 
		   * @param arr : arraty
		   * @param l   : start of array ---initially
		   * @param h   : end of the array ---initially
		   * @param ele : ele to search
		   * 
		   * @return   : Integer 
		   */
		  public static int binarySearch(int arr[], int l, int h, int ele)
			 {     
			   int m=0;  
			   
			   while( l <= h) 				//the start should not be great then end
			   {  
				   m= (l + h)/2;           //the start should not be great then end
				   
				   if (arr[m] == ele)     //compare mid point--too ele to be found
			       {  
			            return 1; 
			       }
				   else
					   if(arr[m] > ele ) //#1//if mid> ele--to be found
					   {
						   h= m- 1;          //#2//so now change the end
					   }  
					   else
						   if (arr[m] < ele)
						   {  
							   l= m+ 1;     //#3//else so now change the start
						   }
			   }   
			   return 0;
			 }  
		
	//////2) Binary Word
		  
		  /**
		   * Binary String search method 
		   * 
		   * @param a
		   * @param x
		   * @return : integer
		   */
		  public static int binaryStringSearch(String[] a, String x) 
		    {
		        int low = 0;
		        int high = a.length - 1;
		        int mid;
		
		        while (low <= high)       //the start should not be great then end
		        {
		            mid = (low + high)/2; //the start should not be great then end
		
		            if(a[mid].equals(x))  //compare mid point--too ele to be found
		            {
		            	return 1;
		            }
		            else
			            if (a[mid].compareTo(x) < 0)	//compare using---compareTo method return -1,0,1
			            {
			                low = mid + 1;
			            }
			            else 
			            	if (a[mid].compareTo(x) > 0) 
			            	{
			                high = mid - 1;
			            	} 
		         }
		        return 0;
		    }

	//////3) insertion sort

	/*	  *//**
		   * Function to sort array using insertion sort
		   * @param arr
		   *//*
		    public static void(arr[])
		    { 
		    (int[] arr) 
		    { 
		        int n = arr.length; 
		        
		        int i,j;
		        
		      //array is 5---{0 to 4}
		        for (i=0; i<n-1;i++)  //----will go 0 to 3
		        { 
		        	
		        	System.out.println("\n"+"Iteration no: "+i);
		        	
		            int val = arr[i+1]; //take value of next position 
		  
		             Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position 
		           
		           for(j=i;j>=0;j--)
		            { 
		                if(arr[j] > val) //if current value greater then next 
		                {
		                	arr[j+1] = arr[j]; //swap
		                }
		                else
		                	break; 	//#1 //(now j is becomes less)
		            } 
		           
		          arr[j+1] = val;	 //#2 //(so add j+1 to put no at right location)
		          
		          printArray(arr); 	//will print each Recursion
		        } 
		    } 
		  */
		    /**
		     * A utility function to print array of size n
		     * @param arr
		     */
		    static void printArray(int arr[]) 
		    { 
		        int n = arr.length; 
		        
		        //print the Sorted array---of each Iteration 
		        for (int i=0; i<n; ++i) 
		        {   System.out.print(arr[i] + " "); 
		  
		        }
	      
		        System.out.println("\n");
		    } 
	
    //////4) insertion String sort
		  
		    /**
		     * Function to sort array using insertion sort
		     * @param arr :string array
		     * 
		     * @return: void
		     */
		    public static void insertionSortString(String[] arr) 
		    { 
		        int n = arr.length; 
		        
		        int i,j;
		        
		        for (i=0; i<n-1;i++)  
		        { 
		        	System.out.println("\n"+"Iteration no: "+i);
		        	
		            String val = arr[i+1]; 
		  
		            /* Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position */
		         //   if (a[mid].compareTo(x) < 0)
		            
		           for(j=i;j>=0;j--)
		            { 
		                if(arr[j].compareTo(val)>0) 
		                {
		                	arr[j+1] = arr[j];
		                }
		                else
		                	break;
		            } 
		           
		          arr[j+1] = val;
		          printArrayString(arr); 
		        } 
		    } 
		  
		    /**
		     * A utility function to print array of size n
		     * @param arr
		     * @return : 	void
		     */
		    static void printArrayString(String[] arr) 
		    { 
		        int n = arr.length; 
		        
		        System.out.println();
		        System.out.println();
		        
		        for (int i=0; i<n; ++i) 
		        {   System.out.print(arr[i] + " "); 
		  
		        }
		    } 
		    
	   //////5) Bubble sort
		    
		    /**
		     * Function to sort array using Bubble sort
		     * @param arr
		     * @return :void
		     */
		    public static void bubblesort(int[] arr) 
		    { 
		        int n = arr.length; 
		        
		        int i,j;
		        
		      ////NOTE 1: array is 5---{0 to 4}
		        for (i=0; i<n-1;i++)  ////NOTE 2:----will go 0 to 3
		        { 
		            int temp=0;
		           
			           for(j=0;j<n-1;j++)
			            { 
			                if(arr[j] > arr[j+1]) 
			                {
			                	temp= arr[j];
			                	arr[j] = arr[j+1];
			                	arr[j+1]=temp;
			                }
			            }
			           
			      System.out.println("\n"+"iteration ="+i );
			      
		          printbubbleArray(arr); 	//will print each Recursion
		        } 
		    } 
		    
		    	/**
		    	 * A utility function to print array of size n
		    	 * @param arr
		    	 */
			    static void printbubbleArray(int arr[]) 
			    { 	
			       int n = arr.length; 
			        
				        for (int i=0; i<n; ++i)  ////NOTE 3:---0 to 4
				        {  
				        	System.out.print(arr[i] + " "); 
				        }
			        
			      System.out.println();
			    } 
		
	     //////6) Bubble sort--String	    
			    
			    /**
			     * Function to sort array using Bubble sort
			     * @param arr
			     * @return :String
			     */
			    public static void bubbleStringSort(String[] arr) 
			    { 
			        int n = arr.length; 
			        
			        int i,j;
			        
			      //array is 5---{0 to 4}
			        for (i=0; i<n-1;i++)  //----will go 0 to 4
			        { 
			            //int val = arr[i];  
			  
			            String temp="";
			           
			           for(j=0;j<n-i-1;j++)
			            { 
			        	   if( arr[j].compareTo(arr[j+1])>0 ) 
			                {
			                	temp= arr[j];
			                	arr[j] = arr[j+1];
			                	arr[j+1]=temp;
			                }
			            } 
			        
			          printBubbleStrArray(arr); 	//will print each Recursion
			        } 
			    } 
			    
			    
			    /**
		    	 * A utility function to print array of size n
		    	 * @param arr
		    	 */
				    static void printBubbleStrArray(String[] arr) 
				    { 
				        int n = arr.length; 
				        
				        System.out.println("\n");
				        
				        for (int i=0; i<n; ++i)  //---0 to 3
				        {  
				        	System.out.print(arr[i] + " "); 
				        }
				    } 
//===================================================================================================
//#ques no 05
				   
				    /**
					   * Binary search method 
					   * 
					   * @param arr : arraty
					   * @param l   : start of array ---initially
					   * @param h   : end of the array ---initially
					   * @param ele : ele to search
					   * 
					   * @return   : Integer
				    */
				    public static int guessBinarySearch(int arr[], int l, int h)
					 {  
					   int m;  
					   
					   while( l <= h)
					   {  
						   m= (l + h)/2;   //mid element---always new 
						   
						   System.out.println("\n"+"so the mid ele is :"+m);
						   System.out.println("\n"+"User--the ele is: "+m+" plz choose proper option" );
						   System.out.println("1) Correct no gussed"+"\n"+"2) no is less"+"\n"+"3) no is greater");
						   
						   //int no---of the option
					       int c= Utility.inputInteger();                                            
						   
						   switch(c)
						   {
						    case 1:
						    		System.out.println("element is CORRECTLY guessed ");
						    		return 1;
						    		
						    case 2:		
						    	//if(arr[m]>ele )
						    		h= m- 1;
						    		break;
						    case 3:
						    	  // if ( arr[m]< ele)
						    	    l= m+ 1;     
						    	    break;
						   }   
					   }
					   return 0;
					 }  
				    
				    
 //===================================================================================================
//#ques no 9
				    
		/* Merges two subarrays of arr[]. 
				     First subarray is arr[l..m] 
				     Second subarray is arr[m+1..r] 
				    /**
				     * Merge sort the which array
				     * @param arr : input array
				     * @param l   :start index of array
				     * @param m   : mid ele index of array
				     * @param r   : last index of array
				     * @return    : void
				     */
				    public static void mergeSort(int arr[], int l, int m, int r) 
				    { 
				        // Find sizes of two subarrays to be merged 
				        int n1 = m - l + 1; 
				        int n2 = r - m; 
				  
				        /* Create temp arrays */
				        int L[] = new int [n1]; 
				        int R[] = new int [n2]; 
				  
				        /*Copy data to temp arrays*/
				        for (int i=0; i<n1; ++i) 
				            L[i] = arr[l + i]; 
				        for (int j=0; j<n2; ++j) 
				            R[j] = arr[m + 1+ j]; 
				  
				  
				        /* Merge the temp arrays */
				  
				        // Initial indexes of first and second subarrays 
				        int i = 0, j = 0; 
				  
				        // Initial index of merged subarry array 
				        int k = l; 
				        while (i < n1 && j < n2) 
				        { 
				            if (L[i] <= R[j]) 
				            { 
				                arr[k] = L[i]; 
				                i++; 
				            } 
				            else
				            { 
				                arr[k] = R[j]; 
				                j++; 
				            } 
				            k++; 
				        } 
				  
				        /* Copy remaining elements of L[] if any */
				        while (i < n1) 
				        { 
				            arr[k] = L[i]; 
				            i++; 
				            k++; 
				        } 
				  
				        /* Copy remaining elements of R[] if any */
				        while (j < n2) 
				        { 
				            arr[k] = R[j]; 
				            j++; 
				            k++; 
				        } 
				    } 
				  
				    // Main function that sorts arr[l..r] using 
				    // merge() 
				    /**
				     * Main function that sorts arr[l..r] using merge() 
				     * @param arr :new array to sort
				     * @param l   : start index of array
				     * @param r   : last index of array
				     * @return    : void
				     */
				    public static void sort(int arr[], int l, int r) 
				    { 
				        if (l < r) 
				        { 
				            // Find the middle point 
				            int m = (l+r)/2; 
				  
				            // Sort first and second halves 
				            sort(arr, l, m); 
				            
				            sort(arr , m+1, r); 
				  
				            // Merge the sorted halves 
				            mergeSort(arr, l, m, r); 
				        } 
				    } 				 
//===================================================================================================
//#ques no 10		
				
			/**
			 * MEthod to cal the nos of notes---given to user as CHANGE FOR THE AMOUNT he had input	    
			 * @param notes  : notes array
			 * @param amount : the input amount by user
			 */
			public static void vendingMachine(int notes[], int amount)
			{
				int nos=0,count=0;
			
					for(int i=0;i<notes.length;i++)
					{	
				    
				   //#1 //e.g 450/100= 4 (i.e 4>0)
						if(amount/notes[i]>0)		
						{    
						//#2 // 4  = 450/100;
							 nos = amount/notes[i];
							 
							 System.out.println("\n");
							 System.out.print(nos+  " notes of ");
							 
							 //4 > 0  print the notes---GIVEN AS CHANGE
							 if(nos>0)
							 {
								 System.out.print(notes[i] +" is taken");
							 
							 count=count+ nos; //count---to find total nos of notes
							 } 
							 
				    //#3 //then 50 = 450%100 
							 amount =amount%notes[i];
						}
					}
			}    
//===================================================================================================
//#ques no 11
				    
	    /**
	     * Standard Calendar---find day
	     * 
	     * @param date
	     * @param month
	     * @param year
	     * 
	     * @return : void
	     */
	    public static void calendar(int date,int month,int year) 
		{
		   
	      //Standard way---to find day	
	    	
			int year0= year-(14-month)/12;    
			
			int x = year0 + (year0 / 4) - (year0 / 100) + (year / 400);
			
			int m0 = month + 12 * ((14 - month) / 12) - 2;

			int dateofday = (date + x + ((31 * m0) / 12)) % 7;
			
			System.out.println("Date: "+date +"   Month: "+month+"   Year: "+year);
			
			System.out.println("the day was:");
			
			switch(dateofday)		///find day
			{
				case 0: System.out.println("Sunday");
							break;
				case 1: System.out.println("Monday");
							break;
				case 2: System.out.println("Tuesday");
							break;
			
				case 3: System.out.println("Wednesday");
								break;
				case 4: System.out.println("Thrusday");
								break;
				case 5: System.out.println("Friday");
								break;
				case 6: System.out.println("Saturday");
								break;
		   }
		}
				 
//===================================================================================================
//#ques no 12
	    /**
	     * method to convert celcius and fahrenheit
	     * @param celsius
	     * @param fahrenheit
	     */
	    public static void celsiusfahrenheit(double celsius, double fahrenheit)
		{

			double celstoFah = (celsius * 9 / 5) + 32;
			System.out.println("The celsius to fahrenheit temperature is: " + celstoFah);
			
			double fahtoCels = (fahrenheit - 32) * 5 / 9;
			System.out.println("The fahrenheit to celsius temperature is: " + fahtoCels);

		}
				    
//===================================================================================================
//#ques no 13
				    
	    /**
	     * Calculation monthly payment----if their is a loan
	     * @param P
	     * @param Y
	     * @param R
	     * @return
	     */
		  public static double monthpayment(double P,double Y,double R)
		  {
			  double n= 12*Y;
			  
			  double r= R/(12 * 100);
			  
			  //payment formula
			  double Payment= (P*r)/(1-Math.pow( (1+r), (-n)));

			return Payment;
		  }
//===================================================================================================
//#ques no 14

	 /**
	  * to calculate sqrt of the given input by using---formula
	  * @param c : input for which to find sqrt
	  * @return  : Double
	  */
	  public static double sqrtNewtonMethod(double c)
	    {
	    	/*If you multiply 10 000 000 000 x 10 000 000 000 = the answer is too big so you will see 1e+20 */
	        double epsilon = 1e-15;    // relative error tolerance

	        
	        double t = c;              // estimate of the square root of c

	        
	        // repeatedly apply Newton update step until desired precision is achieved
	        while ( (Math.abs(t - c/t)) > (epsilon * t) )
	        {
	            t = (c/t + t) / 2.0;
	        }
			return t;
	    
	  }
//===================================================================================================
//#ques no 16
		// returns the string representation of the unsigned int value
		      // represented by the argument in binary (base 2) 
				     /**
				      * to convert int to binary & then o/p--which we get---we swap Nibbles of it 
				      * @param l
				      * @return : String
				      */
				     public static String convertToBinary(int l)
				     {
				    	 String str="";
				    	 String str2="";
				    	 
				    	//##### //converted int--to---String
				 	    String n= Integer.toBinaryString(l); //converted int--to---BinaryString
				 	    	System.out.println("\n"+"Binary vlaue of "+l+ " is: " + n); //print binary of 234
				 	   
				 	   
				 	    //if the length of input no is less then Or not not equal to 8
				 	    	//then we r going to pad with 0 in the  front of the no
				 	    	while(n.length()!=8)
				 		   {     
				 			     n= 0+n;				 			    
				 		   }
				 	    	System.out.println("After padding the no is now");
				 	    	System.out.println(n);
				 		   
				 		  //count the length of the string---- in mutiples of 4
					 	    int Stringlengoffourset =n.length()/4; 	//{it will be 2}---for int 234
					 	    	System.out.println("\n"+"the length of the string---- in mutiples of 4 is: " + Stringlengoffourset);
				 	   
				 	    	
				 	    	
				 	    	//#1 //HEre the String length of fourset---is 2
				 	       //#2 //if count is 2 then 
				 	        int count=Stringlengoffourset-1; //#2 then // 2-1 = 1
				 	        
				 	        while(count>=0)
				 	        {                         //1*4  ,    //1*4+4
				 	        	str=str+n.substring( count*4 ,  (count*4)+4 );
				 	        	count--;
				 	        }
				 	        
				 	       // System.out.println(str);
							return str;   //final in to binary---result in String
				 	    } 
				     	
		// returns the int representation of the unsigned int value
			     public static int convertToDecimal(int n)
				  {
					   
			            System.out.println("no wth new binary number is: "+n);

			            int decimal=0,p=0;
			           
			            while(n!=0)
			            {
			                decimal= (int) (decimal + ((n%10)*Math.pow(2,p)) );
			                n=n/10;
			                p++;
			            }
						return decimal;
				  }
			     
			     
				  
//***888888888888888888888888888888 Alogrithm Program 8888888888888888888888888888888888888888888888
				     
//===================================================================================================
//#ques no 07		
	     /**
		 * A recursive function to find nth catalan number 
		 * 
		 * @param n : input value from user
		 * @return  : Integer
		 */
		public static int catalan(int n) 	//e.g   catalan( 3 )
	    {				 
	        int res = 0; //to store the RESULT  
	          
			      // Base case like {C0 ,C1---value should be zero 
			      if (n <= 1) 
			      { 
			            return 1; 
			      } 
	        
		       //if catalan(3) means---->we have to calculate( E0 to 3 submission of 0 to3) 
		        for (int i = 0; i < n; i++)
		        { 
		        	//refer the Formula
		            res = res  + catalan(i) * catalan(n - i - 1); //recursive call
		        } 
		        
	        return res; //retrun result
	    } 
//===================================================================================================
//#ques no 08
			/**
			 * Standard Calendar---find day
			 * 
			 * @param date
			 * @param month
			 * @param year
			 * 
			 * @return : void
			 */
						//e.g calendar( 1     ,  january  , 1997 )
			public static int calendar2(int date,int month,int year) 
			{
			   
			      //Standard way---to find day---->cal formula
					int year0= year-(14-month)/12;    
					
					int x = year0 + (year0 / 4) - (year0 / 100) + (year / 400);
					
					int m0 = month + 12 * ((14 - month) / 12) - 2;
			
					int dateofday = (date + x + ((31 * m0) / 12)) % 7;
				
				//Display the inputs of user
				System.out.println("Date: "+date +"   Month: "+month+"   Year: "+year);
				
				//displaying the DAY---for which the inputs are given By USER
				System.out.println("the day was:");
				
					switch(dateofday)		//switch case to find day
					{
						case 0: System.out.println("Sunday");
									return 0; 
						case 1: System.out.println("Monday");
									return 1;
						case 2: System.out.println("Tuesday");
									return 2;		
						case 3: System.out.println("Wednesday");
									return 3;
						case 4: System.out.println("Thrusday");
									return 4;
						case 5: System.out.println("Friday");
									return 5;
						case 6: System.out.println("Saturday");
									return 6;
				    }	
					return 7;
			}
//==================================================================================================
//#ques no 9
					
					/**
					   * Function to sort array using insertion sort
					   * @param arr
					   */
					    public static void insertionsort(int arr[])
					    { 
					  
					        int n = arr.length; 
					        
					        int i,j;
					        
					      //array is 5---{0 to 4}
					        for (i=0; i<n-1;i++)  //----will go 0 to 3
					        { 
					        	
					        	System.out.println("\n"+"Iteration no: "+i);
					        	
					            int val = arr[i+1]; //take value of next position 
					  
					            // Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position 
					           
					           for(j=i;j>=0;j--)
					            { 
					                if(arr[j] > val) //if current value greater then next 
					                {
					                	arr[j+1] = arr[j]; //swap
					                }
					                else
					                	break; 	//#1 //(now j is becomes less)
					            } 
					           
					          arr[j+1] = val;	 //#2 //(so add j+1 to put no at right location)
					          
					          printArray(arr); 	//will print each Recursion
					        } 
					    } 
					  
				
		
//===================================================================================================
//#ques no 10
			
	 /**
	   * check the no--->is prime or not
	   * @param n
	   * @return : boolean
	   */
	  public static boolean isPrime3(int n) //e.g n=15 any no----from the given range
	  {  
		  int m = n/2;
		  
		  		if (n <= 1)  //e.g n=15
		  		{  
		  			return false;  
		  		}  
      
		  	//e.g n=15
		  	for (int i = 2; i <= m; i++) //------use use n/2 ,if we use MAth.sqrt(n) and if n=25...answer is 5...so directy print not p
		  	{  
		  			if (n % i == 0)
		  			{  
		  					return false;  
		  			}  
		  	}  
       
		  	return true;  
	  }    
//===================================================================================================
//#ques no 13
	  
	  /**
	 	  * check the no---is prime or not
	 	  * @param n: the noo to be checked
	 	  * @return : boolean
	 	  */
	 	 public static boolean isPrime4(int n) //e.g n=15 any no----from the given range
		  {  
			  		if (n <= 1)  //e.g n=15
			  		{  
			  			return false;  
			  		}  
	     
			  	//e.g n=15
			  	for (int i = 2; i <= Math.sqrt(n); i++) //------use math.sqrt(n) or use n/2
			  	{  
			  			if (n % i == 0)
			  			{  
			  					return false;  
			  			}  
			  	}  
	      
			  	return true;  
		  }  
	 	 
	 	 /**
	 	  * to get palindrome of a no
	 	  * @param m: no to take palindrome/reverse
	 	  * @return : Integer
	 	  */
	 	 public static int Anagram4(int m) //reverse
		  {
			  int r,sum=0,temp; 
			  
			  //It is the number variable to be checked for palindrome    
			  
			  while(m>0)
			  {    
			     r =   m % 10;  //getting remainder  
			     sum= ( sum * 10 ) + r;    
			     m = m / 10;    
			  }    
			  
	         return sum; 
		  }
	 	
//===================================================================================================
//#ques no 14
	 	 
	 	/**
	 	  * check the no---is prime or not
	 	  * @param n
	 	  * @return : boolean
	 	  */
	 	 public static boolean isPrime5(int n) //e.g n=15 any no----from the given range
		  {  
			  		if (n <= 1)  //e.g n=15
			  		{  
			  			return false;  
			  		}  
	     
			  	//e.g n=15
			  	for (int i = 2; i <=Math.sqrt(n); i++) //------use math.sqrt(n) or use n/2
			  	{  
			  			if (n % i == 0)
			  			{  
			  					return false;  
			  			}  
			  	}  
	      
			  	return true;  
		  }  
	 	 
	 	 /**
	 	  * to get palindrome of a no
	 	  * @param m
	 	  * @return : Integer
	 	  */
	 	 public static int Anagram5(int m)
		  {
			  int r,sum=0,temp; 
			  
			  //It is the number variable to be checked for palindrome    
			  
			  while(m>0)
			  {    
			     r =   m % 10;  //getting remainder  
			     sum= ( sum * 10 ) + r;    
			     m = m / 10;    
			  }    
			  
	         return sum; 
		  }
	 	 
	 	 
	 	 
	  	//===================================================================================================
	  	//#ques no 01
	  	//===================================================================================================
	  	//#ques no 01
	  	//===================================================================================================
	  	//#ques no 01
	  	//===================================================================================================
	  	//#ques no 01
	  	//===================================================================================================
	  	//#ques no 01
	  	//===================================================================================================
	  	//#ques no 01
	  	//===================================================================================================
	  	//#ques no 01
	  	//===================================================================================================
	  	//#ques no 01
}




