abstract class Bank
{
	abstract double interest(int p, int t);
}

class SBI extends Bank
{
	@Override
	double interest(int p, int t){
		return (p*t*17.5);
	}
}

class PNB extends Bank
{
	@Override
	double interest(int p, int t){
		return (p*t*15.3);
	}
}

class exec
{
	public static void main(String args[])
	{
		PNB obp = new PNB();
		SBI obs = new SBI();
		
		double pnbAmt = obp.interest(10000, 3);
		double sbiAmt = obs.interest(10000, 3);

		System.out.println("pnb: " + pnbAmt);
		System.out.println("sbi: " + sbiAmt);
	}
}