
public class StaticOverloading {

	public static void main(String args[]) {
		StaticOverloading.shape(Math.PI, 4, "Circle"); 
        StaticOverloading.shape(24, 32); 
        StaticOverloading.shape(Math.PI, 4, 10);
    }
	
	public static void shape(double pi, double radius, String shapeName){
        System.out.println(shapeName+" Area = "+pi*(radius*radius));
    }
	
	public static void shape(double width, double length){
		System.out.println("Rectangle Area = "+width*length);
    }
	
	public static void shape(double pi, double radius, double height){
		System.out.println("Cylinder Area = "+pi*(radius*radius)*height);
    }
}
