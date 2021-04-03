import java.util.*;

class Cal
{
int n1,n2;
Scanner scan=new Scanner(System.in);
void input()
{
System.out.print("enter two numbers:");
n1=scan.nextInt();
n2=scan.nextInt();
}

int add()
	{
	return n1+n2;
	}
int sub()

	{
	return n1-n2;
	}
int multi()
	{
	return n1*n2;
	}
float div()
	{
	return (float)(n1/n2);
	}

}

public class Calsi
{
public static void main(String[] st)
{
Cal a1=new Cal();

a1.input();
System.out.print("\nsub="+a1.sub());

System.out.print("\nadd="+a1.add());

System.out.print("\nmulti="+a1.multi());

System.out.print("\ndivision="+a1.div());

}

}
