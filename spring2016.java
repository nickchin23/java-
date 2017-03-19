
package hackru;

import java.util.Scanner;
import java.util.Arrays;

public class spring2016 {

	public static void main(String[] args) {
		/*    0  1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
		   PT a  b  c  d  e  f  g  h  i  j  k  l  m  n  o  p  q  r  s  t  u  v  w  x  y  z
		   CT x  y  z  a  b  c  d  e  f  g  h  i  j  k  l  m  n  o  p  q  r  s  t  u  v  w 
		   	 -3 -2 -1  0  1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17 18 19 20 21 22																		*/
		     
		/*PT a = 0, b = 1, c = 2, d = 3, e = 4, f = 5, g =6, h = 7, i = 8, j = 9, k = 10, l = 11 , 
				m = 12, n = 13, o = 14, p = 15, q = 16, r = 17, s = 18, t = 19, u = 22, v = 23, w = 25,
				x = 23, y = 24 , z = 25; */
		
		/*CT a = 0, b = 1, c = 2, d = 3, e = 4, f = 5, g =6, h = 7, i = 8, j = 9, k = 10, l = 11 , 
				m = 12, n = 13, o = 14, p = 15, q = 16, r = 17, s = 18, t = 19, u = 22, v = 23, w = 25,
				x = 23, y = 24 , z = 25;
		*/
		
		for (int k = 1; k<6; k++){
		//Users decides which method they want to use
		Scanner in = new Scanner (System.in);
		System.out.println("Please enter the number that corresponds to what you want to do: ");
		System.out.println("1. Turn your plaintext into cipher text with Caesar Cipher." );
		System.out.println("2. Turn your ciphertext into plaintext with Caesar Cipher." );
		int Intro = in.nextInt();
		//Takes plaintext and turns it into ciphertext
		if(Intro == 1){
			Scanner plaintext = new Scanner (System.in);
			System.out.println("Enter your plaintext: ");//User enters a string of text AKA the Plaintext
			String PT = plaintext.nextLine();
			int stringSize= PT.length();//Takes the length of the string 
			
			char[] ptpt = PT.toCharArray();//creates array of the length of array used for the limit of following for loop
			
			System.out.println(PT);
			System.out.println(stringSize);
			System.out.println(Arrays.toString(ptpt));
			
		//Translates letter to a number and subtracts 3 
			for (int i = 0; i<ptpt.length; i++ ){{
				 if(PT.substring(i,i+1).equals("a")){ptpt[i]=(char) (0-3);System.out.println(ptpt[i]);
				}if(PT.substring(i,i+1).equals("b")){ptpt[i]=(char) (1-3);//System.out.println(ptpt[i]);
				}if(PT.substring(i,i+1).equals("c")){ptpt[i]=(char) (2-3);//System.out.println(ptpt[i]);
				}if(PT.substring(i,i+1).equals("d")){ptpt[i]=3-3;//System.out.println(ptpt[i]);
				}if(PT.substring(i,i+1).equals("e")){ptpt[i]=4-3;//System.out.println(ptpt[i]);
				}if(PT.substring(i,i+1).equals("f")){ptpt[i]=5-3;//System.out.println(ptpt[i]);
				}if(PT.substring(i,i+1).equals("g")){ptpt[i]=6-3;//System.out.println(ptpt[i]);
				}if(PT.substring(i,i+1).equals("h")){ptpt[i]=7-3;//System.out.println(ptpt[i]);
				}if(PT.substring(i,i+1).equals("i")){ptpt[i]=8-3;//System.out.println(ptpt[i]);
				}if(PT.substring(i,i+1).equals("j")){ptpt[i]=9-3;//System.out.println(ptpt[i]);
				}if(PT.substring(i,i+1).equals("k")){ptpt[i]=10-3;//System.out.println(ptpt[i]);
				}if(PT.substring(i,i+1).equals("l")){ptpt[i]=11-3;//System.out.println(ptpt[i]);
				}if(PT.substring(i,i+1).equals("m")){ptpt[i]=12-3;//System.out.println(ptpt[i]);
				}if(PT.substring(i,i+1).equals("n")){ptpt[i]=13-3;//System.out.println(ptpt[i]);
				}if(PT.substring(i,i+1).equals("o")){ptpt[i]=14-3;//System.out.println(ptpt[i]);
				}if(PT.substring(i,i+1).equals("p")){ptpt[i]=15-3;//System.out.println(ptpt[i]);
				}if(PT.substring(i,i+1).equals("q")){ptpt[i]=16-3;//System.out.println(ptpt[i]);
				}if(PT.substring(i,i+1).equals("r")){ptpt[i]=17-3;//System.out.println(ptpt[i]);
				}if(PT.substring(i,i+1).equals("s")){ptpt[i]=18-3;//System.out.println(ptpt[i]);
				}if(PT.substring(i,i+1).equals("t")){ptpt[i]=19-3;//System.out.println(ptpt[i]);
				}if(PT.substring(i,i+1).equals("u")){ptpt[i]=20-3;//System.out.println(ptpt[i]);
				}if(PT.substring(i,i+1).equals("v")){ptpt[i]=21-3;//System.out.println(ptpt[i]);
				}if(PT.substring(i,i+1).equals("w")){ptpt[i]=22-3;//System.out.println(ptpt[i]);
				}if(PT.substring(i,i+1).equals("x")){ptpt[i]=23-3;//System.out.println(ptpt[i]);
				}if(PT.substring(i,i+1).equals("y")){ptpt[i]=24-3;//System.out.println(ptpt[i]);
				}if(PT.substring(i,i+1).equals("z")){ptpt[i]=25-3;//System.out.println(ptpt[i]);
				}if(PT.substring(i,i+1).equals(" ")){ptpt[i]=9999;//System.out.print("");  
				}
				// Takes number and prints corresponding letter
				{if(ptpt[i] == -3){System.out.print("d");}
				if(ptpt[i] == -2){System.out.print("e");}
				if(ptpt[i] == -1){System.out.print("f");}
				if(ptpt[i] == 0){System.out.print("g");}
				if(ptpt[i] == 1){System.out.print("h");}
				if(ptpt[i] == 2){System.out.print("i");}
				if(ptpt[i] == 3){System.out.print("j");}
				if(ptpt[i] == 4){System.out.print("k");}
				if(ptpt[i] == 5){System.out.print("l");}
				if(ptpt[i] == 6){System.out.print("m");}
				if(ptpt[i] == 7){System.out.print("n");}
				if(ptpt[i] == 8){System.out.print("o");}
				if(ptpt[i] == 9){System.out.print("p");}
				if(ptpt[i] == 10){System.out.print("q");}
				if(ptpt[i] == 11){System.out.print("r");}
				if(ptpt[i] == 12){System.out.print("s");}
				if(ptpt[i] == 13){System.out.print("t");}
				if(ptpt[i] == 14){System.out.print("u");}
				if(ptpt[i] == 15){System.out.print("v");}
				if(ptpt[i] == 16){System.out.print("w");}
				if(ptpt[i] == 17){System.out.print("x");}
				if(ptpt[i] == 18){System.out.print("y");}
				if(ptpt[i] == 19){System.out.print("z");}
				if(ptpt[i] == 20){System.out.print("a");}
				if(ptpt[i] == 21){System.out.print("b");}
				if(ptpt[i] == 22){System.out.print("c");}
				if(ptpt[i] == 9999){System.out.print(" ");}
				break;
			}}}}
			
		else if (Intro ==2){
			Scanner pt2 = new Scanner (System.in);
			System.out.println("Enter your ciphertext: ");
			String PT2 = pt2.nextLine();
			int stringSize2= PT2.length();
			
			int[] ptpt2 = new int[stringSize2];
			
			for (int j = 0; j<ptpt2.length; j++ ){{
				 if(PT2.substring(j,j+1).equals("d")){ptpt2[j]=-3+3;//System.out.println(ptpt2[i]);
				}if(PT2.substring(j,j+1).equals("e")){ptpt2[j]=-2+3;//System.out.println(ptpt2[i]);
				}if(PT2.substring(j,j+1).equals("f")){ptpt2[j]=-1+3;//System.out.println(ptpt2[i]);
				}if(PT2.substring(j,j+1).equals("g")){ptpt2[j]=0+3;//System.out.println(ptpt2[i]);
				}if(PT2.substring(j,j+1).equals("h")){ptpt2[j]=1+3;//System.out.println(ptpt2[i]);
				}if(PT2.substring(j,j+1).equals("i")){ptpt2[j]=2+3;//System.out.println(ptpt2[i]);
				}if(PT2.substring(j,j+1).equals("j")){ptpt2[j]=3+3;//System.out.println(ptpt2[i]);
				}if(PT2.substring(j,j+1).equals("k")){ptpt2[j]=4+3;//System.out.println(ptpt2[i]);
				}if(PT2.substring(j,j+1).equals("l")){ptpt2[j]=5+3;//System.out.println(ptpt2[i]);
				}if(PT2.substring(j,j+1).equals("m")){ptpt2[j]=6+3;//System.out.println(ptpt2[i]);
				}if(PT2.substring(j,j+1).equals("n")){ptpt2[j]=7+3;//System.out.println(ptpt2[i]);
				}if(PT2.substring(j,j+1).equals("o")){ptpt2[j]=8+3;//System.out.println(ptpt2[i]);
				}if(PT2.substring(j,j+1).equals("p")){ptpt2[j]=9+3;//System.out.println(ptpt2[i]);
				}if(PT2.substring(j,j+1).equals("q")){ptpt2[j]=10+3;//System.out.println(ptpt2[i]);
				}if(PT2.substring(j,j+1).equals("r")){ptpt2[j]=11+3;//System.out.println(ptpt2[i]);
				}if(PT2.substring(j,j+1).equals("s")){ptpt2[j]=12+3;//System.out.println(ptpt2[i]);
				}if(PT2.substring(j,j+1).equals("t")){ptpt2[j]=13+3;//System.out.println(ptpt2[i]);
				}if(PT2.substring(j,j+1).equals("u")){ptpt2[j]=14+3;//System.out.println(ptpt2[i]);
				}if(PT2.substring(j,j+1).equals("v")){ptpt2[j]=15+3;//System.out.println(ptpt2[i]);
				}if(PT2.substring(j,j+1).equals("w")){ptpt2[j]=16+3;//System.out.println(ptpt2[i]);
				}if(PT2.substring(j,j+1).equals("x")){ptpt2[j]=17+3;//System.out.println(ptpt2[i]);
				}if(PT2.substring(j,j+1).equals("y")){ptpt2[j]=18+3;//System.out.println(ptpt2[i]);
				}if(PT2.substring(j,j+1).equals("z")){ptpt2[j]=19+3;//System.out.println(ptpt2[i]);
				}if(PT2.substring(j,j+1).equals("a")){ptpt2[j]=20+3;//System.out.println(ptpt2[i]);
				}if(PT2.substring(j,j+1).equals("b")){ptpt2[j]=21+3;//System.out.println(ptpt2[i]);
				}if(PT2.substring(j,j+1).equals("c")){ptpt2[j]=22+3;//System.out.println(ptpt2[i]);
				}if(PT2.substring(j,j+1).equals(" ")){ptpt2[j]=9999;//System.out.print("");  
				}}
				{if(ptpt2[j] == 0){System.out.print("a");}
				if(ptpt2[j] == 1){System.out.print("b");}
				if(ptpt2[j] == 2){System.out.print("c");}
				if(ptpt2[j] == 3){System.out.print("d");}
				if(ptpt2[j] == 4){System.out.print("e");}
				if(ptpt2[j] == 5){System.out.print("f");}
				if(ptpt2[j] == 6){System.out.print("g");}
				if(ptpt2[j] == 7){System.out.print("h");}
				if(ptpt2[j] == 8){System.out.print("i");}
				if(ptpt2[j] == 9){System.out.print("j");}
				if(ptpt2[j] == 10){System.out.print("k");}
				if(ptpt2[j] == 11){System.out.print("l");}
				if(ptpt2[j] == 12){System.out.print("m");}
				if(ptpt2[j] == 13){System.out.print("n");}
				if(ptpt2[j] == 14){System.out.print("o");}
				if(ptpt2[j] == 15){System.out.print("p");}
				if(ptpt2[j] == 16){System.out.print("q");}
				if(ptpt2[j] == 17){System.out.print("r");}
				if(ptpt2[j] == 18){System.out.print("s");}
				if(ptpt2[j] == 19){System.out.print("t");}
				if(ptpt2[j] == 20){System.out.print("u");}
				if(ptpt2[j] == 21){System.out.print("v");}
				if(ptpt2[j] == 22){System.out.print("w");}
				if(ptpt2[j] == 23){System.out.print("x");}
				if(ptpt2[j] == 24){System.out.print("y");}
				if(ptpt2[j] == 25){System.out.print("z");}
				if(ptpt2[j] == 9999){System.out.print(" ");}
				break;
			}}
			
	}
		else if (Intro != 1 || Intro !=2 ){
			System.out.println("INVALID RESPONSE!");
	    	System.out.print("You have ");
			System.out.print(5 - k);
			System.out.println(" responses left to respond appropriately.");
	    
		}}
			}}
	
	
