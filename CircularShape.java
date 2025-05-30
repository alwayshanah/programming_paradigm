public class CircularShape {
   private double radius;
   
   public CircularShape (double radius) {
   }
   
   public void setRadius (double radius) {
      this.radius = radius;
   }
   
   public double getRadius() {
      return radius;
   }
   
   public double calculateArea() {
      return Math.PI * radius * radius;   
   }
   
   public double calculateCircumference() {
      return Math.PI * radius;
   }
   
   public double calculateDiameter() {
      return 2 * radius;
   }
}