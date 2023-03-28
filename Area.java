class Area
{
	int r=8;
	double Pi=3.141592;
	int l=6;
	int w=7;
	
	
	//Area of circle
	double circle()
	{
		double area=Pi*r*r;
		System.out.println("Area of Circle: "+area);
		return area;
	}
	void square()
	{
		int Area_square=l*l;
		System.out.println("Area of square: "+Area_square);
	}
	void rect()
	{
		int Area_rect=l*w;
		System.out.println("Area of rect: "+Area_rect);
		
	}
	void tri(int b,int h)
	{
		double Area_tri=0.5*h*b;
		System.out.println("Area of triangle: "+Area_tri);
	}
	
	public static void main(String args[])
	{
		int b=9,h=7;
		Area c=new Area();
		double cir=c.circle();
		System.out.println("Area of Circle: "+cir);
		c.square();
		c.rect();
		c.tri(b,h);
		System.out.println("Area of Circle: "+cir);
	}
	
}