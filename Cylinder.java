package Interface;

class Cylinder implements Shape3D {
	 protected double volume,surface,radius,height;
	 public Cylinder() {
		 radius=9;
		 height=14;
	 }
	 public Cylinder(double r,double h) {
		 radius=r;
		 height=h;
	 }
	 public void calvolume() {
		 volume=((float)22/7)*radius*radius*height;
	 }
	 public void calsurface() {
		 surface=2*((float)22/7)*radius*(radius+height);
	 }
	 public void print(){
		 System.out.println("Radius of the Cylinder  :"+radius);
		 System.out.println("Height of the Cylinder  :"+height);
		 System.out.println("Volume of the Cylinder  :"+volume);
		 System.out.println("Surface of the Cylinder :"+surface);
		 System.out.println("\n");
		 
	 }
}
