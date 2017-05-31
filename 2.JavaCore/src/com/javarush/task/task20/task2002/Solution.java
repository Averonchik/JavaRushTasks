package com.javarush.task.task20.task2002;

import java.io.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("c:/1/1.txt", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            JavaRush javaRush = new JavaRush();
            User user = new User();
            user.setFirstName("Lol");
            user.setLastName("Kek");
            user.setBirthDate(Date.valueOf("1970-01-01"));
            user.setMale(Boolean.parseBoolean("true"));
            user.setCountry(User.Country.valueOf("RUSSIA"));
            javaRush.users.add(user);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            if (javaRush.equals(loadedObject))
                System.out.println("assdyh");

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter writer = new PrintWriter(outputStream);
            String isUser = users.isEmpty() ? "no" : "yes";
            writer.println(isUser);
            if (!isUser.isEmpty()){
                for (int i = 0; i < users.size(); i++) {
                    writer.println(users.get(i).getFirstName()+" "+users.get(i).getLastName()+" " +users.get(i).getBirthDate().getTime()+" "+users.get(i).isMale()+" "+users.get(i).getCountry());
                }
            }
            writer.flush();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String isUser = reader.readLine();
            if (isUser.equals("yes")){
                while (reader.ready()){
                    String[] strings = reader.readLine().split(" ");
                    User user = new User();
                    user.setFirstName(strings[0]);
                    user.setLastName(strings[1]);
                    user.setBirthDate(new Date(Long.parseLong(strings[2])));
                    user.setMale(Boolean.parseBoolean(strings[3]));
                    user.setCountry(User.Country.valueOf(strings[4]));
                    users.add(user);
                }
            }
            reader.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
