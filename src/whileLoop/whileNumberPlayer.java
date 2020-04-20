package whileLoop;

public class whileNumberPlayer {

	private int limit;

	public whileNumberPlayer(int limit) {
		this.limit= limit;
		
	}

	public void printSquarsUptToLimit() {
		int i=0;
		while(i *i < limit) {
			System.out.print(i * i +" ");
			i++;
			
		}
		System.out.println();
	}
	

	public void printCubesUpToLimit() {
		int i=0;
		while(i *i *i < limit) {
			System.out.print(i * i* i +" ");
			i++;
		}
		System.out.println();
	}

}
