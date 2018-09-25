
public class carPayment {
	private int totalprice;
	private int downpayment;
	private int lengthofloan;
	private double interestrate;
	
	public double monthlyPayment() {
		return ((interestrate/12)*(totalprice-downpayment))/(1-Math.pow(1+(interestrate/12),-lengthofloan));
	}
	public double totalInterest() {
		return (monthlyPayment()*lengthofloan)-(-downpayment+totalprice);
	}
	// TODO Auto-generated method stub
	public int getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}
	public int getDownpayment() {
		return downpayment;
	}
	public void setDownpayment(int downpayment) {
		this.downpayment = downpayment;
	}
	public int getLengthofloan() {
		return lengthofloan;
	}
	public void setLengthofloan(int lengthofloan) {
		this.lengthofloan = lengthofloan;
	}
	public double getInterestrate() {
		return interestrate;
	}
	public void setInterestrate(double interestrate) {
		this.interestrate = interestrate;
	}
	public carPayment(int totalprice, int downpayment, int lengthofloan, double interestrate) {
		super();
		this.totalprice = totalprice;
		this.downpayment = downpayment;
		this.lengthofloan = lengthofloan;
		this.interestrate = interestrate;
	}

	

}
