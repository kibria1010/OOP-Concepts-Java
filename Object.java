package oop;

import java.io.*;
import java.util.Arrays;

/**
Arrays: Arrays are classified as a reference data type; fixed sized collection.

	dataType[] varName = new dataType[arrayLength];

		varName[0] = valueOne;
		varName[1] = valueTwo;
		varName[n] = valueN;

	In Java, an array is used for storing elements of the same data type in a fixed-sized collection, ordered by insertion. 
	Arrays are classified as a reference data type. 
	Being fixed in size means that unlike with an ArrayList, elements cannot be removed or added after the array has been created. 
	They can only be modified.



2. java.util.Arrays
				Arrays.fill(arrayName, start, end, value)
				Arrays.fill(arrayName, 1, 4, 0);

				Arrays.sort(arrayName);    			//Sorts an array into ascending order.
 */


import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Object {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String name;
        int price;
        // -------------------------------- ArrayOfObject1D
        Book[] a1 = new Book[2];
        for (int i = 0; i < a1.length; i++) {
            name = in.readLine();
            price = Integer.parseInt(in.readLine());
            a1[i] = new Book(name, price);
        }
        for (Book book : a1) {
            System.out.println(book.name + " " + book.price);
        }
        
        
        // -------------------------------- ArrayOfObject1D
        Book[][] a2 = new Book[2][];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = new Book[2];
            for (int j = 0; j < a2[i].length; j++) {
                name = in.readLine();
                price = Integer.parseInt(in.readLine());
                a2[i][j] = new Book(name, price);
            }
        }
        for (Book[] array : a2) {
            for (Book book : array) {
                System.out.println(book.name + " " + book.price);
            }
            System.out.println("");
        }
    }

    public void inputArray1D(int[] a1) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("input " + a1.length + " integers: ");
        for (int i = 0; i < a1.length; i++) {
            try {
                a1[i] = Integer.parseInt(in.readLine());
            } catch (Exception e) {
            }
        }
    }

    public static void printArray1D(int[] a1) {
        for (int instance : a1) {
            System.out.print(instance + " ");
        }
        
        System.out.println("");
    }

    public void inputArray2D(int[][] a2) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < a2.length; i++) {
            for (int j = 0; j < a2.length; j++) {

                try {
                    a2[i][j] = Integer.parseInt(in.readLine());;

                } catch (Exception e) {
                }
            }
        }
    }

    public void printArray2d(int[][] a2) {
        for (int[] a1 : a2) {
            for (int instance : a1) {
                System.out.print(instance + " ");
            }
            System.out.println("");
        }
    }

    public void Arrays() {
        int[] a = new int[5];
        inputArray1D(a);
        
        Arrays.fill(a, 1, 4, 0);
        printArray1D(a);

        System.out.println(a.length);

        System.out.println("sorted in ascending order: ");
        Arrays.sort(a);
        printArray1D(a);
    }
}

class Book {

    String name;
    int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
