package Interface;

public class Main1 {

	public static void main(String[] args) {
		Square a1,a2;
		a1=new Square();
		a1.calarea();
		a1.calcircum();
		a1.print();
		a2=new Square(545);
		a2.calarea();
		a2.calcircum();
		a2.print();
		
		Rectangle a3,a4;
		a3=new Rectangle();
		a3.calarea();
		a3.calcircum();
		a3.print();		
		a4=new Rectangle(545,645);
		a4.calarea();
		a4.calcircum();
		a4.print();
		
		Triangle a5,a6;
		a5=new Triangle();
		a5.calarea();
		a5.calcircum();
		a5.print();
		a6=new Triangle(545,645);
		a6.calarea();
		a6.calcircum();
		a6.print();
	}

}
