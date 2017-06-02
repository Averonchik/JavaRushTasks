package com.javarush.task.task21.task2102;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* 
Сравниваем модификаторы
*/
public class Solution {
    public static void main(String[] args) {
        int modifiersOfThisClass = Solution.class.getModifiers();
        System.out.println(isAllModifiersContainSpecificModifier(modifiersOfThisClass, Modifier.PUBLIC));   //true
        System.out.println(isAllModifiersContainSpecificModifier(modifiersOfThisClass, Modifier.STATIC));   //false

        int modifiersOfMethod = getMainMethod().getModifiers();
        System.out.println(isAllModifiersContainSpecificModifier(modifiersOfMethod, Modifier.STATIC));      //true
    }

    public static boolean isAllModifiersContainSpecificModifier(int allModifiers, int specificModifier) {
        String modifier = Modifier.toString(specificModifier);      //судя по комментариям на JR
        if (modifier.equals("abstract"))                            //кто-то решает через
            return Modifier.isAbstract(allModifiers);               //return allModifiers==specificModifier;
        else if (modifier.equals("final"))                          //что мне кажется очень странным учитывая условия
            return Modifier.isFinal(allModifiers);                  //и к тому же третий вызов метода возвращает false
        else if (modifier.equals("interface"))                      //что не соответствует условию
            return Modifier.isInterface(allModifiers);
        else if (modifier.equals("native"))
            return Modifier.isNative(allModifiers);
        else if (modifier.equals("private"))
            return Modifier.isPrivate(allModifiers);
        else if (modifier.equals("protected"))
            return Modifier.isProtected(allModifiers);
        else if (modifier.equals("public"))
            return Modifier.isPublic(allModifiers);
        else if (modifier.equals("static"))
            return Modifier.isStatic(allModifiers);
        else if (modifier.equals("strict"))
            return Modifier.isStrict(allModifiers);
        else if (modifier.equals("synchronized"))
            return Modifier.isSynchronized(allModifiers);
        else if (modifier.equals("transient"))
            return Modifier.isTransient(allModifiers);
        else if (modifier.equals("volatile"))
            return Modifier.isVolatile(allModifiers);
        else return false;
    }

    private static Method getMainMethod() {
        Method[] methods = Solution.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().equalsIgnoreCase("main")) return method;
        }

        return null;
    }
}
