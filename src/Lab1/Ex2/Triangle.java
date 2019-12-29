package Lab1.Ex2;

public class Triangle
{
  private int a;
  private int b;
  private int c;
  
  public int getA()
  {
    return a;
  }
  
  public int getB()
  {
    return b;
  }
  
  public int getC()
  {
    return c;
  }

  public Triangle(int length1, int length2, int length3)
  {
    a = length1;
    b = length2;
    c = length3;
  }


  public String verify()
  {
    if((a+b) < c || (a+c) < b || (b+c) <a)
    {
      return "Not triangle";
    }
    else if(a == b && b == c)
    {
      return "Equilateral";
    }
    else if(a == b || b == c || a == c)
    {
      return "Isosceles";
    }
    return "Scalene";
  }
}