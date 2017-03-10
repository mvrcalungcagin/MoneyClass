
public class MoneyClass {
	private Currency currency;
	private int whole;
	private int cents;
	private double whl;
	private double an;
	private double an2;
	
		public MoneyClass(Currency currency, int whole, int cents){
		this.currency=currency;
		this.whole=whole;
		this.cents=cents;
		
		
	}
	
	public void addition(MoneyClass mon2){
		if(currency==mon2.currency){
			an=whole*100+cents;
			an2=mon2.whole*100+mon2.cents;
			whl=(an+an2)/100;		
		
			
			
		}
		else{
			
		}
		
	}
	
	
	public void subtraction(MoneyClass mon2){
		if(currency==mon2.currency){
			an=whole*100+cents;
			an2=mon2.whole*100+mon2.cents;
			whl=(an-an2)/100;		
		}
		else{
		
		}
		
	}
		
	

	public String toString(){
		return this.currency+" "+ this.whole+"."+this.cents;
	}
	public String toStringsum(){
		return this.currency+" "+whl;
	}
	public String toStringsub(){
		return this.currency+" "+whl;
	}
	
}
