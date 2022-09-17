 import java.util.Scanner;
 class calculation
 {
 public static void main(String args[])
 {
 System.out.print("Enter the first value:");
 Scanner sc= new Scanner(System.in);
 int a=sc.nextInt();
 System.out.print("Enter the second value:");
 int b=sc.nextInt();
 int c=a+b;
 System.out.println("The addition is:"+c);
 System.out.print("Enter the first value:");
 Scanner sb=new Scanner(System.in);
 int x=sb.nextInt();
 System.out.print("Enter the second value:");
 int y=sb.nextInt();
 int z=x-y;
 System.out.println("The subtraction is:"+z);
 System.out.print("Enter the first value:");
 Scanner so=new Scanner(System.in);
 int e=so.nextInt();
 System.out.print("The second value is:");
 int f=so.nextInt();
 int g=e*f;
 System.out.println("The multiplication is:"+g);
 System.out.print("Enter the first value:");
 Scanner sd=new Scanner(System.in);
 int h=sd.nextInt();
 System.out.print("The second value is:");
 int i=sd.nextInt();
 int j=h/i;
 System.out.println("The Division is:"+j);
 System.out.print("Enter the first value:");
 Scanner sf=new Scanner(System.in);
 int k=sf.nextInt();
 System.out.print("The second value is:");
 int l=sf.nextInt();
 int m=k%l;
 System.out.println("The Modulus is:"+m);
 }
 }
