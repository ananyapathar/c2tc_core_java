package com.tnsif.basic;

public class WrapperClassDemo {

    public static void main(String[] args) {
        float f = 22.22f;

        // Wrapping (autoboxing)
        Float obj = f;

        // Unwrapping
        float f1 = obj.floatValue();

        System.out.println(f1);
    }
}
