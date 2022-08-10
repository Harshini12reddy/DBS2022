package interfacedemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
 interface Addition{
	public int add(int x,int y);
}
interface Predicate<T>{
	boolean test(T t);
}

public class Demo {
	public static void main(String[] args) {
	/*	Addition ob=(int x,int y)-> {
			
			
				return x+y;
			
		};  */
	/*	Addition ob=(int x,int y)-> x+y;
		System.out.println(ob.add(5, 6));          */
		
		List<String> cities=Arrays.asList("mum","hyd","mang","chni");
		cities.forEach(city -> System.out.println(city));
		
		System.out.println();
		List<String> filteredcities=cities.stream().filter(city->city.startsWith("m")).collect(Collectors.toList());
		filteredcities.forEach(city->System.out.println(city));
	}

}
