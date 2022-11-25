package com.cydeo.day2_arrays.frequencyAndConvertingToWord;

public enum NumberToWord {
    ZERO("zero"),ONE("one"),TWO("two"),THREE("three"),FOUR("four"),FIVE("five"),SIX("six"),
    SEVEN("seven"),EIGHT("eight"),NINE("nine"),TEN("ten"), MORE_THAN_TEN("more tham ten");
    final String  value;


    NumberToWord(String value) {
        this.value = value;
    }
}
