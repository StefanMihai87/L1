public class Operatori {
    /*
    Operatori:
    aritmetici : + , - , / , * , %
    de comparare : < > ,== ,!=, <= ,>=
    logici && , || , !    ( && =si  , || =sau , ! = not)
     */

    public static void main(String[] args) {
        int a = 3; // o declarere && initializare
        int b = 5;
        a = b; // suprascriere
       // System.out.println(a);
       // System.out.println(a + b);
       // System.out.println(a * b);
       // System.out.println(a / b);
       // System.out.println(a > b);
       // System.out.println(a < b);
       // System.out.println(a = b);
       // System.out.println(a != b);  // "a" diferit de "b"
       // System.out.println(a <= b);
       // System.out.println(a >= b);
       // System.out.println(a-1 < b);
       // System.out.println(a-1 > b);
       // System.out.println(a == b);   //  "a" egal cu "b"
       // System.out.println(7>b && 8>b);  // 7>5 si 8>5
       // System.out.println(7>b || 8>b);   //  7>b sau 8>b
        System.out.println(!(7>b));  // 7>5 =!true ( ! schimba sensul) => false
    }
}
