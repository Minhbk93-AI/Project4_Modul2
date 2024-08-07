package exercise06;

public class MyClass {
    private String myString;

    //Khơi tao Contructor
    public  MyClass(){

    }

    // Geter Setter


    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

    //

    @Override
    public String toString() {
        return "MyClass{" +
                "myString='" + myString + '\'' +
                '}';
    }
}
