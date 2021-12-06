package ict.kosovo.growth.advance.streams;

import java.util.stream.Stream;

public class MapToInt {
    public static void main(String[] args) {
        int sum = Stream.of("ONE","TWO","THREE","FOUR").mapToInt(s->s.length()).peek(i-> System.out.println(i)).filter(i->i>3).sum();
        System.out.println(sum);
    }
}
