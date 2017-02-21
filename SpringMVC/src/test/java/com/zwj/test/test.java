package com.zwj.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Logger;

import org.junit.Test;

import com.zwj.entity.User;
import com.zwj.service.IUserService;

public class test {
	enum ExampleEnum {
		ONE, TWO, THREE, FOUR
	}

	/**
	 * 怎么样使用相关反射的主要的枚举方法
	 */
	//@Test
	public void testEnum() {
		ExampleEnum value = ExampleEnum.TWO;
		System.out.println("isEnum" + "   " + value);
		ExampleEnum[] values = value.getClass().getEnumConstants();
		for (ExampleEnum v : values) {
			System.out.println("枚举中所有的值" + "  " + v);
		}
	}
	
	
	/**
	 * 怎么样使用相关反射获取方法
	 */
	//@Test
    public void testMethod(){
		Class<String> stringclass=String.class;
		Method[] methods=stringclass.getMethods();
		for(Method m:methods){
			System.out.println( "****************************************************" ); 
			System.out.println("name"+m.getName());
			System.out.println("default"+m.getDefaultValue());
			
			
			Class<?>[] parameterTypes = m.getParameterTypes();  
			System.out.println( parameterTypes.length + " parameters:" );  
			for( Class<?> parameterType : parameterTypes )  
			{  
			    System.out.println( "parameter type name: " + parameterType.getName() );  
			}
			
			Class<?>[] exceptionTypes = m.getExceptionTypes();  
			System.out.println( exceptionTypes.length + " exception types: " );  
			for( Class<?> exceptionType : exceptionTypes )  
			{  
			    System.out.println( "exception name " + exceptionType.getName() );  
			}  
			
		}
	}
	/**
	 * @throws Exception
	 * 反射获取属性和方法
	 */
	@Test
	public void testReflect() throws Exception{
		//Class c=Class.forName("com.zwj.entity.User");
		Class m=Class.forName("k2.zwj.service.IUserService");
//		//反射获取属性
//		Field f[]=c.getDeclaredFields();
//		for(int i=0;i<f.length;i++){
//			System.out.println(f[i]);
//			System.out.println(f[i].getName()+"属性");
//		}
		User user = new User();
		user.setAge("34");
		Class c = user.getClass();
		Field[] f = user.getClass().getDeclaredFields();
		for(Field f1 : f){
			System.out.println(f1.getName());
			String name = f1.getName();
			if("age".equals(f1.getName())){
				f1.setAccessible(true);
				String s =  (String)f1.get(user);
				System.out.println("age"+s);
//				name = "set"+name.substring(0, 1).toUpperCase() + name.substring(1);
//				Method setMethod = user.getClass().getDeclaredMethod(name, String.class);
				Class way1 = User.class;
				Class way2 = user.getClass();
				Class way3 = Class.forName("com.zwj.entity.User");
//				setMethod.invoke(user, "34");
			}
		}
		System.out.println(user);
		Method[] methods = c.getDeclaredMethods();
//		Method a = c.getDeclaredMethod("setAge", String.class);
		for(Method method : methods){
			if(method.getName().startsWith("set")){
				method.invoke(user, "12");	
			}
		}
		System.out.println(user);
		//反射获取方法
//		Method ff[]=m.getDeclaredMethods();
//		for(int i=0;i<ff.length;i++){
//			System.out.println("反射获取方法=================================");
//			//调用类的方法
//			System.out.println(ff[i].invoke(m.newInstance(), "1"));
//			System.out.println(ff[i].invoke(c.newInstance(), ""));
//			System.out.println(ff[i].getName()+"方法");
//		}
	}

}
