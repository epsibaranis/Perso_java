package Interface;

class Sphere implements Shape3D{
 protected double volume,surface,radius;
 public Sphere() {
	 radius=9;
 }
 public Sphere(double r) {
	 radius=r;
 }
 public void calvolume() {
	 volume=4*((float)22/7)*radius*radius;
 }
 public void calsurface() {
	 surface=((float)4/3)*((float)22/7)*radius*radius*radius;
 }
 public void print(){
	 System.out.println("Radius of the sphere  :"+radius);
	 System.out.println("Volume of the sphere  :"+volume);
	 System.out.println("Surface of the sphere :"+surface);
	 System.out.println("\n");
 }
}
