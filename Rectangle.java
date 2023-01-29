package Interface;

public class Rectangle implements Shape2D {
  protected double area,circum,length,breadth;
  public Rectangle() {
	  length=50.0;
	  breadth=70.0;
  }
  public Rectangle(float b1,float l1) {
	  length=b1;
	  breadth=l1;
  }
  public void calarea() {
	  area=length*breadth;
  }
  public void calcircum() {
	  circum=2*length*breadth;
  }
  public void print() {
	  System.out.println("Breadth of the Rectangle  :"+breadth);
	  System.out.println("Length of the Rectangle   :"+length);
	  System.out.println("Area of the Rectangle     :"+area);
	  System.out.println("Circum of the Rectangle   :"+circum);
	  System.out.println("\n");
  }
  
}
