import com.lyj.pkg.InternalClass2
import com.lyj.pkg.PublicClass2

fun main() {
    /* 접근제어 */
    /* 클래스에서의 접근 제한자
    private: 외부에서 객체를 생성할 수 없다
    public: 외부에서 객체를 생성할 수 있다(default)
    protected: 클래스에 지정할 수 없다
    internal: 같은 모듈일 경우에만 객체를 생성할 수 있다.
     */

   // 안되는 경우 주석처리
    // 같은 패키지 내에서 접근할 경우
    val obj1 = PrivateClass1()
    val obj2 = PublicClass1()
    val obj3 = ProtectedClass1()
    val obj4 = InternalClass1()

    // 패키지가 다를 경우
    val obj5 = PrivateClass2()
    val obj6 = PublicClass2()
    val obj7 = ProtectedClass2()
    val obj8 = InternalClass2()

    // 모듈이 다를 경우
    val obj9 = PrivateClass3()
    val obj10 = PublicClass3()
    val obj11 = ProtectedClass3()
    val obj12 = InternalClass3()

    /* 변수, 메서드에서의 접근 제한자
    private: 외부에서 접근할 수 없다
    public: 외부에서 접근할 수 있다(default)
    protected: 상속관계일 때만 접근할 수 있다.
    internal: 같은 모듈일 경우에만 접근할 수 있다.
     */

    val t1 = TestClass5()
    t1.private1
    t1.public1
    t1.protected1
    t1.internal1

    val t2 = TestClass()
    t2.testFunc1()
    t2.testFunc2()
    t2.testFunc3()
    t2.testFunc4()

    val t3 = TestClass2()
    t3.testFun()

    val t4 = TestClass6()
    t4.private2
    t4.public2
    t4.protected2
    t4.internal2
}

private class TestClass{
    private fun testFunc1(){
    }
    public fun testFunc2(){
    }
    protected fun testFunc3(){
    }
    internal fun testFunc4(){
    }
}

private class TestClass2{
    fun testFun(){
        val testClass = TestClass()
    }
}