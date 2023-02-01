package suleymanhoca.day21statickeyword;

import java.util.List;

public class StdRunner {
    public static void main(String[] args) {

        //stdName static oldugundan ona ulasmak icin object olusturmadigimiz icin
        //Sadece class ismini kullanmak yeterlidir.
        System.out.println(Student.stdName);

        //age non-static oldugundan ona ulasmak icin object olusturmak zorundayiz
        Student std1 = new Student();
        System.out.println(std1.age);


        String initials = Student.getInitials("Tom Cruise");
        System.out.println(initials);//TC


        int vowels = std1.countVowels("Tom Cruise");
        System.out.println(vowels);//4

        //  !!!!!  static olanlari object ile cagirmak tavsiye edilmez  !!!!!!
        String s = std1.getInitials("Ali Can");
        System.out.println(s);//AC


        //List olusturmada yeni bir isilti...
       List<String> names= List.of("ali","veli","can","kemal");
        System.out.println(names);

    }
}
