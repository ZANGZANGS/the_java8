package the.java8;

public class DefaultPoo implements Poo{

    String name;

    DefaultPoo(String name){
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }


}
