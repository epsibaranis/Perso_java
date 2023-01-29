package Interface;

class Square implements Shape2D {
   protected float area,circum,side;
   public Square() {
	side=80;
   }
   public Square(float n1) {
	side=n1;
   }
   public void calarea() {
	   area=side*side;
   }
   public void calcircum() {
	   circum=4*side;
   }
   public void print() {
	   System.out.println("Side of the Square     :"+side);
	   System.out.println("Area of the Square     :"+area);
	   System.out.println("Circum of the Square   :"+circum);
	   System.out.println("\n");
   }
}
