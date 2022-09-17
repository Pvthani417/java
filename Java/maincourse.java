abstract class Course
{
abstract void mca();
abstract void fullstack();
abstract void msc();
}
class microcollege extends Course
{
void mca()
{
String name="priya";
int marks=73;
long phno=7676377237l;
System.out.println("Details are: "+ name + phno);
}
void fullstack()
{
System.out.println("fullstack started");
}
void msc()
{
System.out.println("Msc students are here in fullstack");
}
}
class maincourse
{
public static void main(String args[])
{
Course obj=new microcollege();
obj.mca();
obj.fullstack();
obj.msc();
}
}
