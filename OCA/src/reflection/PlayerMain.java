package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PlayerMain {

    public static void main(String[] args)  {
        Class clazz = Player.class;

        Method[] method = clazz.getDeclaredMethods();
        for (Method method1: method) {
            System.out.println("Method: "+method1);
        }

        Field[] field = clazz.getFields();

        for ( Field field1: field) {
            System.out.println("Field: "+ field1);
        }


        String className = Player.class.getName();

        Class myClass = null;
        try {
            myClass = Class.forName(className);
            Constructor constructor = myClass.getConstructor();
            Object obj = constructor.newInstance();
            Player player = (Player) obj;
            System.out.println("Reflection: " + player.str);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
