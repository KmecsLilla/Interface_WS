package com.company;

public interface Speaking {
    default void speak(String say) {
        System.out.println(say);
    }
}
