package simple;
import java.util.*;
public class add {
Scanner io=new Scanner(System.in);
 public  void add (int x,int y){

int sum=x+y;
System.out.println(sum);
sub();
 }
private void sub(){int a = io.nextInt();
int b= io.nextInt();
int sum=a-b;
System.out.println(sum);
 }
 public void mul (){int a = io.nextInt();
int b= io.nextInt();
int sum=a*b;
System.out.println(sum);
 }
public void div (){int a = io.nextInt();
int b= io.nextInt();
int sum=a/b;
System.out.println(sum);
 }
}

