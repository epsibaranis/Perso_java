package Interface;

public class Triangle implements Shape2D {
	protected double area,circum,base,side1,side2,height;
	public Triangle() {
		base=50.0;
		height=70.0;
	}
	public Triangle(double b1,double l1) {
		base=b1;
		height=l1;
	}
   public void calarea() {
	   area=((float)1/2)*base*height;
   }
   public void calcircum() {
	   circum=base+side1+side2;
   }
   public void print() {
	   System.out.println("Base of the Triangle       :"+base);
	   System.out.println("Side1 of the Triangle      :"+side1);
	   System.out.println("Side2 of the Triangle      :"+side2);
	   System.out.println("Height of the Triangle     :"+height);
	   System.out.println("Area of the Triangle       :"+area);
	   System.out.println("Circum of the Triangle     :"+circum);
	   System.out.println("\n");
   }
}
