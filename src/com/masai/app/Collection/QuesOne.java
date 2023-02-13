package com.masai.app.Collection;

import java.util.Stack;
import java.util.stream.IntStream;

public class QuesOne {
    public static void main(String args[]) {
        String str = "Ram";

        Stack<Character> revString = new Stack<Character>();

        IntStream.range(0,str.length()).forEach(s->revString.push(str.charAt(s)));
        StringBuilder reversed = new StringBuilder();
        while (!revString.empty()){
            reversed.append(revString.pop());
        }
        System.out.println(reversed);

    }
}
