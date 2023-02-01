package suleymanhoca.day22staticblocksconstructors;

/*

    Constructor nedir?
       Class'dan object uretmemize yarayan code block'laridir.

        Class olusturdugumuzda Java bize otomatik olarak bir constructor verir
       Ama bu constructor gozle gorulmez ,gozle gorulmeyen otomatik olarak Java tarafindan verilen bu constructor'lara
       "default constructor" denir.

       "default constructor"lar "Car(){ }" seklindedir.
       Siz kendi contructor'inizi olusturdugunuzda Java default constructor'u siler.

       Bir class'da farkli parametreler kullanarak istediginiz kadar constructor olusturabilirsiniz.

       Farkli constructor'lar sayesinde bir class'dan farkli farkli object'ler olusturabiliriz.

       Interview Sorusu:    Method ile constructor'in farki var midir? varsa nedir?
       cevap:               Method ile Constructor farkli yapilardir
                           i)Method'larda "return Type" vardir ama "Constructor'larda return type yoktur.
                           ii)Method'larin ismi yaptiklari ise gore developer'lar tarafindan belirlenir.
                               Constructor'larin ismi ise her zaman Class ismi ile ayni olmalidir.




 */
 public class Car {

    String make="Honda";
    String model="Accord";
    int year=2023;
    boolean hybrid=true;

   public Car(String make,String model,int year,boolean hybrid){

        this.make=make;
        this.model=model;
        this.year=year;
        this.hybrid=hybrid;

    }
   public Car(String make,String model){
        this.make=make;
        this.model=model;
        if (year==2023){
            this.year=0;
        }
        if (hybrid==true){
            this.hybrid=false;
        }
    }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }


    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }

}
