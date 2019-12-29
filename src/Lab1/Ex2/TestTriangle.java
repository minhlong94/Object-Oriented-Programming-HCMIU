package Lab1.Ex2;

import java.util.Scanner;

public class TestTriangle{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Input length:");
    
    int length1 = scan.nextInt();
    int length2 = scan.nextInt();
    int length3 = scan.nextInt();
    Triangle tri = new Triangle(length1,length2,length3);
    System.out.println(tri.verify());  
  }
}