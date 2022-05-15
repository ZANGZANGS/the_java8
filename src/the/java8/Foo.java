package the.java8;

import java.util.function.Function;

public class Foo {

    public static void main(String[] args) {
        int baseNumber = 10;

        Function<Integer, Integer> plus10 = number -> number + 10;
        Function<Integer, Integer> multiply2 = number -> number * 2;

        //compose: 함수 적용 전 처리
        System.out.println(plus10.compose(multiply2).apply(20));
        //andThen: 함수 적용 후 처리
        System.out.println(plus10.andThen(multiply2).apply(20));


    }

}
