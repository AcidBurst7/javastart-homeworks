package com.javastart.immutables;

public class Main {
    public static void main(String[] args) {
        String a = "ABC";
        String b = a.concat("DEF");
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.concat("DEFJJJJ"));

        StringBuilder stringBuilder = new StringBuilder("ABC");
        stringBuilder.append("DEF")
                .append("GHI")
                .append("JKL");
        System.out.println(stringBuilder);
        stringBuilder.append("TTT");
        System.out.println(stringBuilder);

        String c = stringBuilder.toString();
        System.out.println(c);

        StringBuffer buf = new StringBuffer("ABC");
        buf.append("DEF")
                .append("GHI")
                .append("JKL");
        System.out.println(buf);


        Owner alex = new Owner("Max");
        final Cat tom = new Cat("Tom", 4, alex);
        //tom.setAge(4);
        //tom.getOwner().setName("Kate");
        //tom = new Cat("Honor", 9, alex);
    }
}
