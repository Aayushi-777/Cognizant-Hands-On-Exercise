class Student{
    public int roll_no;
    public String name;
    Student(int roll_no, String name){
        this.roll_no=roll_no;
        this.name=name;
    }
}
public class ArrayOfObjects {
    public static void main(String args[]){
        Student[] arr=new Student[5];
        arr[0]=new Student(1, "Aman");
        arr[1]=new Student(2, "Vaibhav");
        arr[2]=new Student(3, "Shreya");
        arr[3]=new Student(4, "Aditi");
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i].roll_no+"  "+arr[i].name);
        }
    }
}
