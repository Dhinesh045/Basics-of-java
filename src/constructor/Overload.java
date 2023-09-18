package constructor;

public class Overload {

    public static void main(String[] args) {
        ValueOfData obj= new ValueOfData();
        ValueOfData obj1=new ValueOfData();
       obj1.ValueOfData(3,"dhinesh",400);
       obj.ValueOfData(4,"dhinesh");

    }
}

//----------------------------------------------------


//
//class Student5{
//    int id;
//    String name;
//    int age;
//
//    Student5(int i,String n){
//        id = i;
//        name = n;
//    }
//      Student5(int i,String n,int a){
//        id = i;
//        name = n;
//        age=a;
//    }
//    void display(){
//    System.out.println(id+" "+name+" "+age);}
//
//    public static void main(String args[]){
//        Student5 s1 = new Student5(111,"Karan");
//        Student5 s2 = new Student5(222,"Aryan",25);
//        s1.display();
//       s2.display();
//    }
//}
