class Student{  
    int rollno;  
    String name;  
    float Percentage;  
    void insert(int i, String n, float s) {  
        rollno=i;  
        name=n;  
        Percentage=s;  
    }  
    void display(){System.out.println(rollno+"   "+name+"   "+Percentage);}  
}  
public class Main {  
public static void main(String[] args) {  
    Student e1=new Student();  
    Student e2=new Student();  
    Student e3=new Student();
    System.out.println("rollno"+" name"+"  Percentage");
    e1.insert(101,"ajeet",90);  
    e2.insert(102,"amit",89);  
    e3.insert(103,"nakul",95);  
    e1.display();  
    e2.display();  
    e3.display();  
}  
}  
