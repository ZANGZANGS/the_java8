package the.java8;

public interface Poo {

    void printName();

    /**
     * @implSpec
     * 이 구현체는 getNmae()으로 가져온 문자열을 대문자로 출력한다.
     */
    default void printNameUpperCase(){
        System.out.println(getName().toUpperCase());
    }


    String getName();
}
