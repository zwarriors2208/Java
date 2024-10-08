package day10;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.Arrays;

public class DemoReflection {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Student s=new Student();
        Class c=s.getClass();

        Field[] fields = c.getDeclaredFields();
        for(Field f:fields){
            System.out.println(f.getName());
            System.out.println(f.getType());
            if(f.getName().equals("name"))
            {
                f.setAccessible(true);
                f.set(s,"ankit");
            }
            if(f.getName().equals("rollno"))
            {
                f.setAccessible(true);
                f.setInt(s,111);
            }
        }

        Constructor[] constructors = c.getDeclaredConstructors();
        for(Constructor c1:constructors){
            System.out.println(c1.getParameterCount());
            if(c1.getParameterCount()==2)
            {
                c1.setAccessible(true);
                Parameter[] params = c1.getParameters();
                System.out.println(Arrays.toString(params));
                Student s1 = (Student) c1.newInstance(102, "nikita");
                s1.displayData();
            }
        }

        Method[] methods = c.getDeclaredMethods();
        for(Method m:methods){
            System.out.println(m.getName());
            if(m.getName().equals("privateMethod"))
            {
                m.setAccessible(true);
                m.invoke(s);
            }
            if(m.getName().equals("staticMethod"))
            {
                m.invoke(null);
            }
            if(m.getName().equals("methodWithParam")){
                Parameter[] params = m.getParameters();
                System.out.println(Arrays.toString(params));
                m.invoke(s, 254, "aaru");
            }
        }

//        to reflect on annotation
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
//        for(Annotation a:c.getAnnotations()){
//            if(a instanceof CreatedBy){
//                if(((CreatedBy) a).priority()==1)
//                {
//                    System.out.println(((CreatedBy) a).createdBy());
//                }
//            }
//        }

//        for(Method m:methods){
//            if(m.getDeclaredAnnotations(CreatedBy.class)!=null){
//                CreatedBy anno = m.getDeclaredAnnotation(CreatedBy.class);
//                if(anno.priority()==1){
//                    m.invoke(s);
//                }
//            }
//        }
    }
}
