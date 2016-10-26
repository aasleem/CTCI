package examples;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class LeftRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int rotation = in.nextInt();

        int end[] = new int[size - rotation];
        int front[] = new int[size - (size - rotation)];

        for(int i = 0; i < size; i++) {
            if(i < rotation)
                front[i] = in.nextInt();
            else
                end[i-rotation] = in.nextInt();
        }

        int[] rotatedArray = new int[front.length + end.length];
        System.arraycopy(end, 0, rotatedArray, 0, end.length);
        System.arraycopy(front, 0, rotatedArray, end.length, front.length);

        for(int i = 0; i < rotatedArray.length; i++)
            System.out.println(rotatedArray[i]);

    }
}
