package com.javarush.task.task17.task1711;

import com.javarush.task.task17.task1710.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        switch (args[0]){
            case "-c" :
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 3) {
                        if (args[i + 1].equals("м")) {
                            allPeople.add(Person.createMale(args[i], dateFormat.parse(args[i + 2])));
                        } else {
                            allPeople.add(Person.createFemale(args[i], dateFormat.parse(args[i + 2])));
                        }
                        System.out.println(allPeople.size() - 1);
                    }
                    break;
                }
            case "-u" :
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 4) {
                        if (args[i + 2].equals("м")) {
                            allPeople.set(Integer.parseInt(args[i]), Person.createMale(args[i + 1], dateFormat.parse(args[i + 3])));
                        } else {
                            allPeople.set(Integer.parseInt(args[i]), Person.createFemale(args[i + 1], dateFormat.parse(args[i + 3])));
                        }
                    }
                    break;
                }
            case "-d" :
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        Person person = allPeople.get(Integer.parseInt(args[i]));
                        person.setName(null);
                        person.setSex(null);
                        person.setBirthDay(null);
                    }
                    break;
                }
            case "-i" :
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        Person person = allPeople.get(Integer.parseInt(args[i]));
                        if (person.getSex().equals(Sex.MALE))
                            System.out.println(person.getName() + " м " + dateFormat1.format(person.getBirthDay()));
                        else if (person.getSex().equals(Sex.FEMALE))
                            System.out.println(person.getName() + " ж " + dateFormat1.format(person.getBirthDay()));
                    }
                    break;
                }
        }
    }
}
