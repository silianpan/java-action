package test.test5;

public class WuMingFen {
	private String theMa;
	private int quantity;
	private boolean likeSoup;
	
	public WuMingFen(String theMa, int quantity){
		this.setTheMa(theMa);
		this.setQuantity(quantity);
	}
	
	public WuMingFen(String theMa, int quantity, boolean likeSoup){
		this.setLikeSoup(likeSoup);
		this.setTheMa(theMa);
		this.setQuantity(quantity);
	}
	
	public String getTheMa() {
		return theMa;
	}
	public void setTheMa(String theMa) {
		this.theMa = theMa;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public boolean isLikeSoup() {
		return likeSoup;
	}
	public void setLikeSoup(boolean likeSoup) {
		this.likeSoup = likeSoup;
	}
	
	public boolean check(){
		return this.theMa.equals("酸辣粉") &&
				this.quantity == 2 &&
				this.likeSoup;
	}
	
	public String toString(){
		return "面码：" + this.getTheMa() +
				"\n分量：" + this.getQuantity() + 
				"\n带汤否：" + this.isLikeSoup();
	}
	
	
	
	
}
