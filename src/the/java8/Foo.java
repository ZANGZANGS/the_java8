package the.java8;

import java.util.function.*;

public class Foo {

    public static void main(String[] args) {

        Foo foo = new Foo();
        foo.run();
    }

    private void run(){
        final int baseNumber = 10;

        //로컬클래스
        class LocalClass {
            void printBaseNumber(){
                System.out.println(baseNumber);
            }
        }

        //익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            int baseNumber = 11;
            @Override
            public void accept(Integer integer) {
                System.out.println(baseNumber);
            }
        };

        //람다
        IntConsumer print = (i) -> {
            //int baseNumber = 12;
            //람다는 스코프가 run 함수와 같다. 내부에 int baseNumber 재선언이 불가함
            System.out.println(i + baseNumber);
        };
    }

}
