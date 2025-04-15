import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
      
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        Scanner scanner = new Scanner(System.in);
       
    
        while( true ){
          
            System.out.print("Enter a number (0 or negative number to stop): ");
            double inputNumber = scanner.nextDouble();
			
			if( inputNumber<=0 && index>=10 )
			{
				break;
			}else {  
			
				numbers[index]=inputNumber;
				index++;
				total+=inputNumber;
			
			}			
            
		}
		for(int i=0;i<10;i++)
			{ 
				 System.out.print(numbers[i] + " , ");
			}
	}
	
}