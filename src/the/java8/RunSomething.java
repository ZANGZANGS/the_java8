package the.java8;

@FunctionalInterface
public interface RunSomething {

    int doIt(int number);
    /*
    * 함수형 인터페이스는 메서드 1개만 선언이 가능하다.
    * void doAgain(); //컴파일 에러
    * */

//    생략 가능
//    public
//    static
//    abstract

    default  void printAge(){
        System.out.println("29");
    }


}
