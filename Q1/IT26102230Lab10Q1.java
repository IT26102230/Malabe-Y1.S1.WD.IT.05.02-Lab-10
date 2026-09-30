import java.util.Scanner;

public class IT26102230Lab10Q1{
	
	public static void main(String[] args){
		
		Scanner lookfor = new Scanner(System.in);
		
		System.out.print("\nEnter the mark (0 - 100): ");
		int mark = lookfor.nextInt();
		
		assert (mark >= 0) && (mark <=100): "Invalid Mark";
		
		System.out.println("\nMark is Validated");
		
		char grade = grading(mark);
		
		if(mark >= 75){
			assert grade == 'A';
		}
		else if(mark >= 60){
			assert grade == 'B';
		}
		else if(mark >= 50){
			assert grade == 'C';
		}
		else if(mark >= 40){
			assert grade == 'D';
		}
		else{
			assert grade == 'F';
		}
		
		System.out.println("The Grade for the Entered Mark is: " + grade);
		
		lookfor.close();
	}
	
	public static char grading(int mark){
		
		if(mark >= 75){
			return 'A';
		}
		else if(mark >= 60){
			return 'B';
		}
		else if(mark >= 50){
			return 'C';
		}
		else if(mark >= 40){
			return 'D';
		}
		else{
			return 'F';
		}
		
	}
}
