import java.util.Scanner;

public class Volume { 
  public static void main(String [] args){
  
      Scanner crush = new Scanner (System.in);
      int length, width, height, volume;
      
    System.out.print("Length: ");
      length = crush.nextInt();
    System.out.print("Width: ");
      width = crush.nextInt();
    System.out.print("Height: ");
      height = crush.nextInt();
    
    volume = length*width*height;
    
    System.out.println("\nVolume = " + volume);

  }
}
   
 