
class RectangleBehaviour 
{
	private int length;
	private int breadth;
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	
	
	public int getArea(int length,int breadth)
	{
		int area=length*breadth;
		return area;
	}
	
	public int getPerimeter(int length,int breadth)
	{
		int perimeter=2*(length+breadth);
		return perimeter;
	}

	
	
	
}
