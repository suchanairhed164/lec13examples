/*
public class Test {
    public Test() {
    }
    public static void main(String[] args) {
        Test t = new Test();
        String s1 = "Hello world !!!";
        String s2 = new String("Hello world !!!");
        System.out.println("String`s equally = " +
                (s1.equals(s2)));
        System.out.println(
                "Strings are the same = " + (s1==s2));
    }
}

 */
/*
public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        String s = "prefix !";
        System.out.println(s);
        s = s.trim();
        System.out.println(s);
        s = s.concat(" suffix");
        System.out.println(s);
    }
}

 */
/*
public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        String s = new String("ssssss");
        StringBuffer sb =
                new StringBuffer("bbbbbb");
        s.concat("-aaa");
        sb.append("-aaa");
        System.out.println(s);
        System.out.println(sb);
    }
}

 */
/*
public class Test {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        String str = sb.append("e").insert(4,
                "f").insert(3,"d").toString();
        System.out.println(str);
    }
}

 */
public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        StringBuffer sb = new StringBuffer("aaa");
        System.out.println("Before = " + sb);
        t.doTest(sb);
        System.out.println("After = " + sb);
    }
    void doTest(StringBuffer theSb){
        theSb.append("-bbb");
    }
}