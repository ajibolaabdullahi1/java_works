public class Test1{
	public static void main(String args[]){
		
		int total_loss=0, day=0, amount = 0;
		
		for(int i=1; i<=14; i+=2){
			day++;
			amount++;
			total_loss += amount;
			System.out.println("Day " + day + ", spent " + amount + " pound, total loss: " + total_loss);
		}
	}
}

