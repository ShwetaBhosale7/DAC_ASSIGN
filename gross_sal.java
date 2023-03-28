class gross_sal{
	public static void main(String args[])
	{
		double basic=10000.8989009;
		double TA=5600.6778;
		double DA=10000.8989009*0.14;
		double PA=7000.3443534546;
		double tax=DA*0.1076;
		
		double res= (basic+TA+DA+PA)-tax;
		//System.out.println(tax);
		System.out.println("Basic amount:"+basic);
		System.out.println("TA amount:    "+TA);
		System.out.println("DA amount:    "+DA);
		System.out.println("PA amount:    "+PA);
		System.out.println("tax amount:   "+tax);
		System.out.println("Result amount:"+res);
		
	}
}