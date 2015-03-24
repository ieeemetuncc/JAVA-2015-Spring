import java.util.Scanner;


public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num1,num2,op,result = 0,temp=0;
			Scanner scan = new Scanner( System.in );
			System.out.print("Please enter operation: ");
			op = scan.nextInt();
			if(op!=4){
				if(op==1){
					System.out.println("Multiplication!");
				}
				if(op==2){
					System.out.println("Division!");
				}
				if(op==3){
					System.out.println("Power!");
				}
				System.out.println("Please enter two numbers: ");
				num1 = scan.nextInt();
				num2 = scan.nextInt();
				if(op==1){
					result =num1*num2;
				}
				if(op==2){
					result =num1/num2;
				}
				if(op==3){
					result=1;
					while(num2>0){
						result=result *num1;
						num2=num2-1;
					}
				}
				System.out.println("Result: "+result);
			}
			System.out.print("Please enter operation: ");
			op = scan.nextInt();
			while(op!=4){
				if(op==1){
					System.out.println("Multiplication!");
				}
				if(op==2){
					System.out.println("Division!");
				}
				if(op==3){
					System.out.println("Power");
				}
				System.out.println("Please enter a number: ");
				num2 = scan.nextInt();
				if(op==1){
					result =result*num2;
				}
				if(op==2){
					result =result/num2;
				}
				if(op==3){
					temp=result;
					while(num2>1){
						temp=temp *result;
						num2=num2-1;
					}
					result=temp;
				}
				System.out.println("Result: "+result);
				
			}
			
	}

}
