package factory;

/**
 * Purpose: We can create a object in multiple ways by giving different data to the class
 *  but it get created using same constructor. So the problem is it doesn't provide a clear
 *  picture of the purpose of the creation of the object.
 *  Here factory gives a definition and purpose of creating of the object.
 */
public class Point {
   double x;
   double y;
   private  Point(double x,double y){
       this.x = x;
       this.y = y;
   }

   public static class Factory {

       public static Point newCartesian(double x,double y ){
           return new Point(x,y);
       }
       public static Point newPolarPint(double x,double y ) {
           return new Point(x*Math.cos(x),y * Math.sin(y));
       }
   }
}
