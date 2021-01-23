package AnnotatedMethod;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class LizardDemo {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Lizard dixey = new Lizard("Dixey", "Liguan", true);
        Method hunt =
                Lizard.class.getDeclaredMethod("hunt", String.class);
        Method clean =
                Lizard.class.getDeclaredMethod("clean");

        Class klass = Lizard.class;
        Annotation annotation;

        for (Method method : klass.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Execute.class)) {
                annotation =
                        method.getAnnotation(Execute.class);
                Execute execute = (Execute) annotation;
                System.out.println(method.getName() + ": " + execute.times());

                for (int i =
                     0; i < ((Execute) annotation).times(); i++) {
                    if (method.equals(hunt))
                        hunt.invoke(dixey, "fly");

                    if (method.equals(clean))
                        clean.invoke(dixey);


                }

            }
        }
    }
}
