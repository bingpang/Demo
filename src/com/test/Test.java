package com.test;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Random;

public class Test {
	public static final String numberChar = "0123456789";
	public static void main(String[] args) {
		//System.out.println(Regions.CN_NORTH_1.getName());
//		 Long seed = System.currentTimeMillis();// ���ϵͳʱ�䣬��Ϊ�������������
//		 
//	        StringBuffer sb = new StringBuffer();// װ����ɵ������
//	 
//	        Random random = new Random(seed);// ����������������
//	 
//	        for (int i = 0; i < 20; i++) {
//	            sb.append(numberChar.charAt(random.nextInt(numberChar.length())));
//	        }
//		System.out.println(sb.toString());
		
//		String newName = "test.jpg";
//		String fileName = "9KI3Z{E~WHBKCGS%(BA`IWM.jpg";
//		File source = new File("C:\\Users\\Administrator\\Desktop\\9KI3Z{E~WHBKCGS%(BA`IWM.jpg");
//		
//		fileName = fileName.substring(fileName.lastIndexOf("."),fileName.length());
//		System.out.println(fileName.substring(fileName.lastIndexOf("."),fileName.length()));
//		File parent = source.getParentFile();
//
//		File target = new File(parent,newName);
//		source.renameTo(target);
//		
//		Page<Student> stuPage = new Page<>();
//		stuPage.getList().add(stuPage.getList().size(), new Student());
//		stuPage.setPageNo(1);
//		stuPage.setPageSize(5);
//		stuPage.setTotalRecords(100);
		
//		System.out.println(String.valueOf(Float.parseFloat("2565.21")*1000));
		
		try {
			Class c = Student.class;
			Object stu = c.newInstance();
			Field f = c.getDeclaredField("name");
			f.setAccessible(true);
			f.set(stu, "zhangsan");
		
//			if(stu instanceof Student){
//				System.out.println(f.get(stu));
//			}
			Method ageMethod = c.getMethod("setAge", String.class);
			ageMethod.invoke(stu, "12");
			Method method = c.getMethod("toString");
			System.out.println(method.invoke(stu));
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
