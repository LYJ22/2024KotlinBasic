public class JavaMain {
    // 일반 변수, 메서드
    public int javaA1 = 100;
    public void javaMethod1(){
        System.out.println("javaMethod1");
    }

    // 정적 변수, 메서드
    public static int javaA2 = 200;
    public static void javaMethod2(){
        System.out.println("javaMethod2");
    }

    public static void main(String[] args){
        // 코틀린에서 만든 클래스의 객체 생성
        TestClass1 t1 = new TestClass1();
        System.out.println("t1.a1 : " + t1.getA1());
        t1.testMethod1();
        // 코틀린 클래스의 정적 변수, 메서드
        System.out.println("TestClass.a2 : " + TestClass1.Companion.getA2());
        TestClass1.Companion.testMethod2();

        //JvmStatic 태그 단 경우
        System.out.println("TestClass.a3 : " + TestClass1.getA3());
        TestClass1.testMethod3();
    }
}
