class Main {
    public static void main(String[] args) {
        
        Parent parent = new Parent();
        parent.name = "Jon";
        parent.greeting();

        Child child = new Child();
        child.name = "Hannah";
        child.age = 15;
        child.greeting();
    }
}