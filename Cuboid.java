import java.util.*;
public class Cuboid{

  public static double getVolumeOfCuboid(double length,double width,double height) {
    
    //write your logic here
  double cuboid=length*width*height;
  return cuboid;
    }
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double length=sc.nextDouble();
double width=sc.nextDouble();
double height=sc.nextDouble();
System.out.println(getVolumeOfCuboid(length,width,height));
}}
