class CI{
	public static void main(String args[])
	{
		int p=50000000;
		double INV=115600000;
		int n=5;
		double rate=10.75/100;
		double A=p*(1+ rate)*(1+ rate)*(1+ rate)*(1+ rate)*(1+ rate);
		double CI=A-p;
		System.out.println("Amount:"+A);
		System.out.println("Compound Interest"+CI);
		
	}
}