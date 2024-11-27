fun main() {
    // 부모 클래스
    val super1 = SuperClass1()
    val sub1 = SubClass1()

    println("obj1.superA1 : ${super1.superA1}")
    super1.superMethod1()
    println("obj2.superA1 : ${sub1.superA1}, obj2.subA1 : ${sub1.subA1}")
    sub1.superMethod1()
    sub1.subMethod1()

    println("--------------------")
    //부모 클래스 타입으로 자식 클래스 객체 참조 가능
    val super2: SuperClass1 = sub1
    println("super2.superA1 : ${super2.superA1}")
    super2.superMethod1()
    // 자식 클래스 타입으로는 부모 클래스 객체 참조하지 못한다
    // val sub2: SubClass1 = super1

    println("--------------------")

    val obj2: SubClass2 = SubClass2()
    obj2.superMethod2()

    val obj3: SuperClass2 = obj2
    obj3.superMethod2()
}

open class SuperClass1 {
    var superA1 = 100
    fun superMethod1(){
        println("SuperClass1의 superMethod1()")
    }
}

class SubClass1 : SuperClass1(){
    var subA1 = 200
    fun subMethod1(){
        println("SubClass1의 subMethod1()")
    }
}

open class SuperClass2{
    open fun superMethod2(){
        println("SuperClass2의 superMethod2()")
    }
}

class SubClass2 : SuperClass2(){
    override fun superMethod2(){
        println("SubClass2의 subMethod2()")
    }
}