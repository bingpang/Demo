package com.test2;

import static com.test.Test1.*;

import java.util.ArrayList;
import java.util.List;

//静态导包 static修饰import
public class Test2 {

	public static void main(String[] args) {
//		test1();
//		System.out.println(Integer.MAX_VALUE);
//		
//		String a = "梁剑伟";
//		System.out.println(a.hashCode());
		List<String> listStr=new ArrayList<>();
		listStr.add("111");
		listStr.add("222");
		listStr.add("333");
		listStr.add("444");
		List<Person> list = new ArrayList();
		Person p = new Person();
		p.setId("111");
		p.setName("111");
		list.add(p);
		Person p1 = new Person();
		p1.setId("222");
		p1.setName("222");
		list.add(p1);
//		Person p2 = new Person();
//		p2.setId("333");
//		p2.setName("333");
//		list.add(p2);
//		Person p3 = new Person();
//		p3.setId("444");
//		p3.setName("444");
//		list.add(p3);
//		listStr. (list);
		getNonexistent(list,listStr);
		System.out.println(listStr.size());
//		System.out.println(listStr.size());
	}
	 public static void getNonexistent(List<Person> list1, List<String> list2) {
		 	if(list1.size()<=0) return;
	        List<String> diff = new ArrayList<String>();
	        for(int i=0;i<list1.size();i++){
	        	if(list2.contains(list1.get(i).getId()))
		            {
//		                diff.add(str.getId());
	        			list2.remove(list1.get(i).getId());
		            }
	        }
//	        return list2;
//	        for(int i=0;i<list2.size();i++){
//	        	if(!list2.contains(list1.get(i).getId()))
//	            {
////	                diff.add(str.getId());
//	                System.out.println(list1.get(i).getId());
//	            }
//	        }
//	        return diff;
	    }
	
static class Person{
	private String id;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
	
	
}
