import java.util.*;
class Rectangle 
{
	public static void main(String args[])
	{
		RectangleBehaviour rectangle=new RectangleBehaviour();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the length and breadth");

		int length=scanner.nextInt();
		int breadth=scanner.nextInt();
		
		rectangle.setLength(length);
		rectangle.setBreadth(breadth);
		
		int area=rectangle.getArea(length, breadth);
		System.out.println("The area of the rectangle is "+ area);

		int perimeter=rectangle.getPerimeter(length, breadth);
		System.out.println("The perimeter of the rectangle is "+ perimeter);

		System.out.println("Is there any other rectangle?");
		String answer=scanner.next();
		if(answer.equals("Yes"))
		{
			RectangleBehaviour secondRectangle=new RectangleBehaviour();
			System.out.println("Enter the length and breadth");

			int secondLength=scanner.nextInt();
			int secondBreadth=scanner.nextInt();
			
			rectangle.setLength(secondLength);
			rectangle.setBreadth(secondBreadth);
			
			int secondArea=rectangle.getArea(secondLength, secondBreadth);
			System.out.println("The area of the rectangle is "+ secondArea);

			int secondPerimeter=rectangle.getPerimeter(secondLength, secondBreadth);
			System.out.println("The perimeter of the rectangle is "+ secondPerimeter);
			
			if(area==secondArea)
			{
				System.out.println("The area of both the rectangles is same");
				
			}
			else
			{
				System.out.println("The area of both the rectangles is not same");
				
			}

		}
		
	}

}
