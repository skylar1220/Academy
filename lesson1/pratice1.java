package lesson1;


public class pratice1 {

	public static void main(String[] args) {
		// #1
				System.out.println("#1");
				for (int i=1; i<=5; i++) {
					System.out.print("*");	
				}
				
				System.out.println('\n');
				// #2
				System.out.println("#2");
				for (int i=1; i<=5; i++) {
					System.out.println("*");	
				}
						
				System.out.println();
				// #3
				System.out.println("#3");
		    	for(int i=1; i<=5; i++) {   			// i가 1일때 {j가 1일 때 (*****)}  한 줄 띄고, ...  i가 5일때 {j도 5 (*****)}  한 줄 띄고 끝남.
					for(int j=1; j<=5; j++) {
						System.out.print("*");
					}
					System.out.println();

		    	}
		    	
				System.out.println();
				// #4
				System.out.println("#4");
		    	for (int i=1; i<=4; i=i+1) {  			//  i가 1일때 *, i가 2일 때 **, i가 3일 때 ***
		    		for (int j=1; j<=i; j=j+1 ) {
						System.out.print("*");
		    			}
					System.out.println();
		    	}
		    	
//				System.out.println();
//				// #5-1
//				System.out.println("#5-1");
//		    	for (int i=1; i<=4; i=i+1) {  			//  i가 4일때 ****, i가 3일 때 ***
//		    		for (int j=4; j<=5-i; j=j-1 ) {
//						System.out.print("*");
//		    			}
//					System.out.println();
//		    	}
		    	
				System.out.println();
				// #5-2
				System.out.println("#5-2");
		    	for (int i=5; i>0; i = i-1) {  			//  i가 4일때 ****, i가 3일 때 ***
		    		for (int j=0; j<i; j= j+1) {
						System.out.print("*");
		    			}
					System.out.println();
		    	}

			}
		}


		/*

		****
		***
		**
		*

		 */