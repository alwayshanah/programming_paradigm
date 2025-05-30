public class CircularShapeTester {
   public static void main (String [] args) {
   
   CircularShape circular = new CircularShape(5);
   
   System.out.println("Radius: " + circular.getRadius());
   System.out.println("Area: " + circular.getRadius());
   System.out.println("Circumference: " + circular.calculateCircumference());
   System.out.println("Diameter: " + circular.calculateDiameter());
   
   circular.setRadius(7);
   
   System.out.println("New Radius: " + circular.getRadius());
   System.out.println("New Area: " + circular.getRadius());
   System.out.println("New Circumference: " + circular.calculateCircumference());
   System.out.println("New Diameter: " + circular.calculateDiameter());
   
   }
}