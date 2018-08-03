import java.util.*; 
public class ComplexNumbers {
	
	public static void main(String args[])
	{
		
	
		Scanner scanner=new Scanner(System.in);
		Complex complex1=new Complex();
		Complex complex2=new Complex();
		Complex complex3=new Complex();
		
		System.out.println("Enter the imaginary part of first number");
		float imaginary1=scanner.nextFloat();
		
		System.out.println("Enter the real part of first number");
		float real1=scanner.nextFloat();
		
		complex1.setImaginary(imaginary1);
		complex1.setReal(real1);
		
		System.out.println("Enter the imaginary part of second number");
		float imaginary2=scanner.nextFloat();
		
		System.out.println("Enter the real part of second number");
		float real2=scanner.nextFloat();
	
		complex2.setImaginary(imaginary2);
		complex2.setReal(real2);
		
		System.out.println("The first number is " +complex1.getReal()+"+ i"+complex1.getImaginary());
		System.out.println("The second number is " +complex2.getReal()+"+ i"+complex2.getImaginary());		
	
		complex3=complex3.sum(complex1,complex2);
		System.out.println("The addidtion is " +complex3.getReal()+"+ i"+complex3.getImaginary());
		
		
	}
	

}
