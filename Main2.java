package Interface;

public class Main2 {

	public static void main(String[] args) {
		Sphere a1,a2;
		a1=new Sphere();
		a1.calsurface();
		a1.calvolume();
		a1.print();
		a2=new Sphere(70);
		a2.calsurface();
		a2.calvolume();
		a2.print();
		
		Cylinder a3,a4;
		a3=new Cylinder();
		a3.calsurface();
		a3.calvolume();
		a3.print();
		a4=new Cylinder(70,140);
		a4.calsurface();
		a4.calvolume();
		a4.print();
	}

}
