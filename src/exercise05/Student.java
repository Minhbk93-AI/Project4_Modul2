package exercise05;

public class Student {
    private String name = "John";
    private String classes="CO2";

    //Khởi tạo hàm không có tham số!
    public Student(){

    }

    //Phương thức Set
    public void setName(String name){
        this.name= name;

    }
    public void setClasses(String classes){
        this.classes=classes;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
