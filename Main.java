import java.util.Scanner;

public class Main {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SortingClass Array = new SortingClass(); 
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int sortChoice = 0, arraySize = 0;
		long startTime = 0, estimatedTime = 0;
		int[] arrayToSort;

		//FOR DEFAULT PRINTS RANDOM ARRAYS WÝTH 10K SIZE
		 System.out.println("\n-- (With Random integers 10000) --"); //(2)

         arrayToSort = Array.RandomArray(10000);
         startTime = System. nanoTime();
         Array.heapSort(arrayToSort);
         estimatedTime = System. nanoTime() - startTime;
         System.out.println("> HeapSort estimated time: " + (double)estimatedTime/(double)1000000);

         arrayToSort = Array.RandomArray(10000);
         startTime = System. nanoTime();
         Array.introSort(arrayToSort);
         estimatedTime = System. nanoTime() - startTime;
         System.out.println("> IntroSort estimated time: " + (double)estimatedTime/(double)1000000);

         arrayToSort = Array.RandomArray(10000);
         startTime = System. nanoTime();
         Array.shellSort(arrayToSort);
         estimatedTime = System. nanoTime() - startTime;
         System.out.println("> ShellSort estimated time: " + (double)estimatedTime/(double)1000000);
         
         System.out.println("\n---WELCOME---\n1-> Analyze Max Heap Sort \n2-> Analyze Intro Sort \n"
 				+ "3-> Analyze Shell Sort\n4-> Analyze all possibilities (sizes = [1000], [10.000], [100.000])\n");
 		
 		
		
		while (sortChoice < 1 || sortChoice > 4) {
			System.out.print(">>> ENTER CHOICE: "); // Get sort type!
			try {
				sortChoice = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("Invalid entry!");
				System.exit(1);
			}
		}
		
		 switch(sortChoice) {                    
         case 1:         //HeapSort
        	 arraySize = 1000;
             for (int i = 0; i < 3; i++) {
                 System.out.println("\n--- ARRAY SIZE: [" + arraySize +"] ---");
                 System.out.println("\n-- (With Equal integers) --"); //(1)

                 arrayToSort = Array.equalIntegersArray(2,arraySize);
                 startTime = System. nanoTime();
                 Array.heapSort(arrayToSort);
                 estimatedTime = System. nanoTime() - startTime;
                 System.out.println("> HeapSort estimated time: " + (double)estimatedTime/(double)1000000);

                 System.out.println("\n-- (With Random integers) --"); //(2)

                 arrayToSort = Array.RandomArray(arraySize);
                 startTime = System. nanoTime();
                 Array.heapSort(arrayToSort);
                 estimatedTime = System. nanoTime() - startTime;
                 System.out.println("> HeapSort estimated time: " + (double)estimatedTime/(double)1000000);

                 System.out.println("\n-- (With Increasing integers) --"); //(3)

                 arrayToSort = Array.IncreasingArray(arraySize,0);
                 startTime = System. nanoTime();
                 Array.heapSort(arrayToSort);
                 estimatedTime = System. nanoTime() - startTime;
                 System.out.println("> HeapSort estimated time: " + (double)estimatedTime/(double)1000000);

                 System.out.println("\n-- (With Decreasing integers) --"); //(4)

                 arrayToSort = Array.DecreasingArray(arraySize,0);
                 startTime = System. nanoTime();
                 Array.heapSort(arrayToSort);
                 estimatedTime = System. nanoTime() - startTime;
                 System.out.println("> HeapSort estimated time: " + (double)estimatedTime/(double)1000000);
                 arraySize *= 10;
             }
             break;
         case 2:         //IntroSort
        	 arraySize = 1000;
             for (int i = 0; i < 3; i++) {
                 System.out.println("\n--- ARRAY SIZE: [" + arraySize +"] ---");
                 System.out.println("\n-- (With Equal integers) --"); //(1)

                 arrayToSort = Array.equalIntegersArray(2,arraySize);
                 startTime = System. nanoTime();
                 Array.introSort(arrayToSort);
                 estimatedTime = System. nanoTime() - startTime;
                 System.out.println("> IntroSort estimated time: " + (double)estimatedTime/(double)1000000);
                 System.out.println("\n-- (With Random integers) --"); //(2)

                 arrayToSort = Array.RandomArray(arraySize);
                 
                 startTime = System. nanoTime();
                 Array.introSort(arrayToSort);
                 estimatedTime = System. nanoTime() - startTime;
                 System.out.println("> IntroSort estimated time: " + (double)estimatedTime/(double)1000000);
                 
                 System.out.println("\n-- (With Increasing integers) --"); //(3)
                 arrayToSort = Array.IncreasingArray(arraySize,0);
                 startTime = System. nanoTime();
                 Array.introSort(arrayToSort);
                 estimatedTime = System. nanoTime() - startTime;
                 System.out.println("> IntroSort estimated time: " + (double)estimatedTime/(double)1000000);
                 System.out.println("\n-- (With Decreasing integers) --"); //(4)
                
                 arrayToSort = Array.DecreasingArray(arraySize,0);
                 startTime = System. nanoTime();
                 Array.introSort(arrayToSort);
                 estimatedTime = System. nanoTime() - startTime;
                 System.out.println("> IntroSort estimated time: " + (double)estimatedTime/(double)1000000);
                 

                 arraySize *= 10;
             }
             break;
         case 3:         //ShellSort
        	 arraySize = 10;
             for (int i = 0; i < 3; i++) {
                 System.out.println("\n--- ARRAY SIZE: [" + arraySize +"] ---");
                 System.out.println("\n-- (With Equal integers) --"); //(1)

                 arrayToSort = Array.equalIntegersArray(2,arraySize);
                 startTime = System. nanoTime();
                 Array.shellSort(arrayToSort);
                 estimatedTime = System. nanoTime() - startTime;
                 System.out.println("> ShellSort estimated time: " + (double)estimatedTime/(double)1000000);

                 System.out.println("\n-- (With Random integers) --"); //(2)
                 arrayToSort = Array.RandomArray(arraySize);
               
                
                 startTime = System. nanoTime();
                 Array.shellSort(arrayToSort);
                 estimatedTime = System. nanoTime() - startTime;
                 System.out.println("> ShellSort estimated time: " + (double)estimatedTime/(double)1000000);
               
                 System.out.println("\n-- (With Increasing integers) --"); //(3)

                 arrayToSort = Array.IncreasingArray(arraySize,0);
                 startTime = System. nanoTime();
                 Array.shellSort(arrayToSort);
                

                 estimatedTime = System. nanoTime() - startTime;
                 System.out.println("> ShellSort estimated time: " + (double)estimatedTime/(double)1000000);
                
                 System.out.println("\n-- (With Decreasing integers) --"); //(4)

                 arrayToSort = Array.DecreasingArray(arraySize,0);
                 startTime = System. nanoTime();
                 Array.shellSort(arrayToSort);
                 estimatedTime = System. nanoTime() - startTime;
                 System.out.println("> ShellSort estimated time: " + (double)estimatedTime/(double)1000000);
                 arraySize *= 10;
             }
             break;
         case 4:           // All analysis
             arraySize = 1000;
             for (int i = 0; i < 3; i++) {
                 System.out.println("\n--- ARRAY SIZE: [" + arraySize +"] ---");
                 System.out.println("\n-- (With Equal integers) --"); //(1)

                 arrayToSort = Array.equalIntegersArray(2,arraySize);
                 startTime = System. nanoTime();
                 Array.heapSort(arrayToSort);
                 estimatedTime = System. nanoTime() - startTime;
                 System.out.println("> HeapSort estimated time: " + (double)estimatedTime/(double)1000000);

                 arrayToSort = Array.equalIntegersArray(arraySize,2);
                 startTime = System. nanoTime();
                 Array.introSort(arrayToSort);
                 estimatedTime = System. nanoTime() - startTime;
                 System.out.println("> IntroSort estimated time: " + (double)estimatedTime/(double)1000000);

                 arrayToSort = Array.equalIntegersArray(arraySize,2);
                startTime = System. nanoTime();
                 Array.shellSort(arrayToSort);
                 estimatedTime = System. nanoTime() - startTime;
                 System.out.println("> ShellSort estimated time: " + (double)estimatedTime/(double)1000000);

                 System.out.println("\n-- (With Random integers) --"); //(2)

                 arrayToSort = Array.RandomArray(arraySize);
                 startTime = System. nanoTime();
                 Array.heapSort(arrayToSort);
                 estimatedTime = System. nanoTime() - startTime;
                 System.out.println("> HeapSort estimated time: " + (double)estimatedTime/(double)1000000);

                 arrayToSort = Array.RandomArray(arraySize);
                 startTime = System. nanoTime();
                 Array.introSort(arrayToSort);
                 estimatedTime = System. nanoTime() - startTime;
                 System.out.println("> IntroSort estimated time: " + (double)estimatedTime/(double)1000000);

                 arrayToSort = Array.RandomArray(arraySize);
                 startTime = System. nanoTime();
                 Array.shellSort(arrayToSort);
                 estimatedTime = System. nanoTime() - startTime;
                 System.out.println("> ShellSort estimated time: " + (double)estimatedTime/(double)1000000);

                 System.out.println("\n-- (With Increasing integers) --"); //(3)

                 arrayToSort = Array.IncreasingArray(arraySize,0);
                 startTime = System. nanoTime();
                 Array.heapSort(arrayToSort);
                 estimatedTime = System. nanoTime() - startTime;
                 System.out.println("> HeapSort estimated time: " + (double)estimatedTime/(double)1000000);

                 arrayToSort = Array.IncreasingArray(arraySize,0);
                 startTime = System. nanoTime();
                 Array.introSort(arrayToSort);
                 estimatedTime = System. nanoTime() - startTime;
                 System.out.println("> IntroSort estimated time: " + (double)estimatedTime/(double)1000000);

                 arrayToSort = Array.IncreasingArray(arraySize,0);
                 startTime = System. nanoTime();
                 Array.shellSort(arrayToSort);
                 estimatedTime = System. nanoTime() - startTime;
                 System.out.println("> ShellSort estimated time: " + (double)estimatedTime/(double)1000000);

                 System.out.println("\n-- (With Decreasing integers) --"); //(4)

                 arrayToSort = Array.DecreasingArray(arraySize,0);
                 startTime = System. nanoTime();
                 Array.heapSort(arrayToSort);
                 estimatedTime = System. nanoTime() - startTime;
                 System.out.println("> HeapSort estimated time: " + (double)estimatedTime/(double)1000000);

                 arrayToSort = Array.DecreasingArray(arraySize,0);
                 startTime = System. nanoTime();
                 Array.introSort(arrayToSort);
                 estimatedTime = System. nanoTime() - startTime;
                 System.out.println("> IntroSort estimated time: " + (double)estimatedTime/(double)1000000);

                 arrayToSort = Array.DecreasingArray(arraySize,0);
                startTime = System. nanoTime();
                 Array.shellSort(arrayToSort);
                 estimatedTime = System. nanoTime() - startTime;
                 System.out.println("> ShellSort estimated time: " + (double)estimatedTime/(double)1000000);
                 arraySize *= 10;
             }
             break;
     }
		
	}

}
