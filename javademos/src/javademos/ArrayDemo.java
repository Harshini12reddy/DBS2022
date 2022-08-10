package javademos;
import java.util.*;
public class ArrayDemo {
	public static void main(String[] args) {
		
		
    int total=0;
    
    Scanner s=new Scanner(System.in);
    String name=s.nextLine();
    int noofitems; 
    noofitems=s.nextInt();
    
    //System.out.println("noofitems\n"+m);
    int item[] =new int[noofitems];
    for(int i=0;i<noofitems;i++)
      item[i]=s.nextInt();
    for(int i=0;i<item.length;i++){
      
         total=total+item[i];}
         System.out.println(name+" "+total);
         }}
