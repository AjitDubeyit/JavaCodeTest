package com.test.core.CoreJava.string;

import java.util.Comparator;

public class Comparatorbuff implements Comparator<StringBuffer> {

    @Override
    public int compare(StringBuffer s1, StringBuffer s2) {
        return s1.toString().compareTo(s2.toString());

    }
}
