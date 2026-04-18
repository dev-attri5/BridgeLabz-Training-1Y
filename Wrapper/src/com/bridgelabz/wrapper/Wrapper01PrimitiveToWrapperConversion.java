package com.bridgelabz.wrapper;

public class Wrapper01PrimitiveToWrapperConversion {
    public static void main(String[] args) {
        int primitiveValue = 42;
        Integer wrapperValue = Integer.valueOf(primitiveValue);

        System.out.println("Primitive int: " + primitiveValue);
        System.out.println("Integer object: " + wrapperValue);
    }
}
