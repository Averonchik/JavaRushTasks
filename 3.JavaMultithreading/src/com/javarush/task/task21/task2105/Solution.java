package com.javarush.task.task21.task2105;

import java.util.HashSet;
import java.util.Set;

/* 
Исправить ошибку. Сравнение объектов
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object o) {
        if (o==this)
            return true;
        else if (!(o instanceof Solution))
            return false;
        else if (o.getClass()!=getClass()||o==null)
            return false;
        else {
            Solution n = (Solution) o;
            return n.first == first && n.last == last;
        }
    }
    public int hashCode() {
        return 31 * (first != null ? first.hashCode() : 0) + (last != null ? last.hashCode() : 0);
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Mickey", "Mouse"));
        System.out.println(s.contains(new Solution("Mickey", "Mouse")));
    }
}
