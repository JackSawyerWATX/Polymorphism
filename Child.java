public class Child extends Parent{
    int age;

    @Override
    public void greeting(){
        System.out.println("My name is " +name+ " and I am " +age+ " years old.");
    }
}
