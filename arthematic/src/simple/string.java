package simple;
import java.util.*;
public class string {
	Scanner io = new Scanner(System.in);
public void concate() {
	String a= io.nextLine();
	String b= io.nextLine();
	a.concat(b);
	System.out.println(a);
}
public StringBuffer rev() {
	String a= io.nextLine();
	String b= io.nextLine();
	StringBuffer c = new StringBuffer();
	c.append(a);
	c.append(b);
	c.reverse();
	return(c);
	
}
}
