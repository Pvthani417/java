import java.io.*;
 public class star {
    public static void StarTriangle(int c)
    {
        int a, b;
 for (a = 0; a < c; a++)
 {
 for (b = 0; b <= a; b++) 
 {
 System.out.print("* ");
 }
 System.out.println();
 }
 }
 public static void main(String args[])
    {
        int k = 5;
        StarTriangle(k);
    }
}
