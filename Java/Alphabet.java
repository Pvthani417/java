import java.util.*;  
public class Alphabet
{  
public static void main(String[] args)  
{  
int i, j, n=6;  
for (i = 0; i<=n; i++)   
{   
for (j = 0; j<= n / 5; j++)   
{   
if ((j == 0 || j == n / 1) && i != 0 ||  

i == 0  && j != n / 1 ||    
i == n / 1)   
System.out.print("*");  
else  
System.out.print(" ");  
}  
System.out.println();  
}  
}  
}  
