package Lab1.Ex1;

public class Rectangle{
  private int a;
  private int b;

  public int getA(){
    return a;
  }
  public int getB(){
    return b;
  }

  public Rectangle(int width, int height){
    a=width;
    b=height;
    if (a<0){
    System.out.println("Input error. a has been set to 1");
    a = 1;
    }
    if (b<0){
      System.out.println("Input error. b has been set to 1");
      b=1;
    }
  }

  public void Visualize(){
    for(int i=0;i<b;i++)
    {
    if(i==0 || i == (b-1))
      {
        for(int j=0;j<a-1;j++)
        {
          System.out.print("*");
          if (j == (a-2))
          {
            System.out.println("*");
          }
        }
      }
    if (i>0 && i<(b-1))
    {
      for(int k=0;k<a-1;k++)
      {
        if (k==0)
        {
          System.out.print("*");
        }
        if (k==(a-2))
        {
          System.out.println("*");
        }
        else
        {
          System.out.print(" ");
        }
      }
    }
    }
}
}
