package io.zipcoder.interfaces;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class Students extends People{
    final static INSTANCE Students = null;

    private Students(INSTANCE students) {
        Students = students;
    }

    private static class INSTANCE {
    }

}
