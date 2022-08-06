package bean;

import java.lang.reflect.Method;
import java.text.Annotation;

public class Test {

    public static void main(String[] args) {
        Teacher t = new Teacher();

        Method[] m = t.getClass().getMethods(); //Teacher classinda olan metodlarin adlari(Object daxil olmaqla)

//        for (int i = 0; i < m.length; i++) {
//            System.out.println(m[i].getName());
//        }

//        System.out.println("\n\n\n");

        Method[] dm = t.getClass().getDeclaredMethods(); //Yalniz ozumuz yaratdigimiz methodlari gormek ucun(Object daxil edyil)

//        for (int i = 0; i < dm.length; i++) {
//            System.out.println(dm[i].getName());
//        }

    }
}
