package project0906;
class Car{
	String color;
	int spead;
	
	 car(){
		 system.out.println("Car ������");
		}
		public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
		void downSpeed(int value){
			spead=speed-value;
	}
}

class sedan extends Car{
	int seatNum;
	Sedan(){
		System.out.println("Sedan ������");
	}

	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
	
}

class truck extends Car{
	int Capacity;
}
public class exam01 {

	public static void main(String[] args) {
		sedan s1=new sedan();
		s1.setColor("����");
		s1.setSpeed(100);
		

	}

}
