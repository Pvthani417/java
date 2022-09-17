class grandfather
{  
void msg()
{
System.out.println("Welcome");
}  
}  
class mother
{  
void msg()
{
System.out.println("Thank u");
}  
}  
class father extends mother
{
  public static void main(String args[])
 {  
   father obj=new father();  
   obj.msg();
}  
} 
 
