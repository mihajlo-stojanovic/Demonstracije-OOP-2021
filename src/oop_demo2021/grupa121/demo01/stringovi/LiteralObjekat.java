package oop_demo2021.grupa121.demo01.stringovi;

public class LiteralObjekat {
    public static void main(String[] args) {
        String a = "abc";
        System.out.println("a: " + a + " (korisceno =)");
        String b = "abc";
        System.out.println("b: " + b + " (korisceno =)");
        String c = new String("abc");
        System.out.println("c: " + c + " (korisceno new String())");
        String d = new String("abc");
        System.out.println("d: " + d + " (korisceno new String())");
        String e = "ABC";
        System.out.println("e: " + e);
        String f = " ABC ";
        System.out.println("f: " + f.replaceAll(" ", "_") + " (razmaci zamenjeni znakom '_')");
        System.out.print("a == b: ");
        System.out.println(a == b);
        System.out.print("a == c: ");
        System.out.println(a == c);
        System.out.print("a == d: ");
        System.out.println(a == d);
        System.out.print("b == c: ");
        System.out.println(b == c);
        System.out.print("b == d: ");
        System.out.println(b == d);
        System.out.print("c == d: ");
        System.out.println(c == d);
        System.out.print("c.equals(d): ");
        System.out.println(c.equals(d));
        System.out.print("c.equals(e): ");
        System.out.println(c.equals(e));
        System.out.print("c.equalsIgnoreCase(e): ");
        System.out.println(c.equalsIgnoreCase(e));
        System.out.print("e.trim().equals(f): ");
        System.out.println(e.trim().equals(f));
    }
}
