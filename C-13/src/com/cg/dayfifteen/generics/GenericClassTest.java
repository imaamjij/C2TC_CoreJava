package com.cg.dayfifteen.generics;

//generic class
class GenericTest<T>{
	T obj;
	//add method
	void add(T obj) {
		this.obj = obj;
	}
	T get() {
		return obj;
	}
}
public class GenericClassTest {
	
	public static void main(String[] args) {
		GenericTest<String> obj = new GenericTest<>();
		obj.add("Hello");
		System.out.println(obj.get());
		
		GenericTest<Integer> obj1 = new GenericTest<>();
		obj1.add(10);
		System.out.println(obj1.get());
	}

}
