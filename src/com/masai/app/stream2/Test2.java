package com.masai.app.stream2;

import java.util.List;
import java.util.stream.Stream;

public class Test2 {

    public static void main(String args[]) {

        //Intermediate Operator

        List<Integer> myList = List.of(10, 20, 30, 45, 67, 54, 12, 34,10,20,30);

        //myList.stream()---> this will collect the stream of integer
        //And stream is separate from collection
//        Write example of following intermediate operations of Stream API
//        1.filter( )
        //creating a variable for Stream class collecting Integer value
//        System.out.println("Example of filter--------");
           Stream<Integer> integerStream = myList.stream();
//        //
//         integerStream.forEach(System.out::println);
//        //2.map()
//        System.out.println("Example of map :--------");
       List<String> sList=List.of("Akash","Rohan","vignesh","Sankalp","m","d","r");
        Stream<String> stringStream=sList.stream();
//        stringStream.map(str->str.length())
//                .forEach(System.out::println);
//        stringStream.map(String::toUpperCase)
//                .forEach(System.out::println);
        //3.distinct()
//        System.out.println("Example of distinct");
//        integerStream.distinct().forEach(System.out::println);
//        System.out.println(integerStream.distinct().count());

        //4.sorted()
        //integerStream.sorted().forEach(System.out::println);
        System.out.println(stringStream.count());


    }



}
