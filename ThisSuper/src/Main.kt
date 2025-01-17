fun main() {
    var obj1 = TestClass1()
    obj1.testMethod1()

    println("----------------")

    var obj2 = SubClass()
    obj2.subMethod1()

}

class TestClass1(var a2: Int){
    constructor() : this(100){}

    var a1 = 100

    fun testMethod1(){
        var a1 = 200

        println("a1: $a1")
        println("this.a1: ${this.a1}")

        fun testMethod2(){
            println("testMethod1 내부의 testMethod2")
        }

        testMethod2()
        this.testMethod2()
    }

    fun testMethod2(){
        println("testMethod2()")
    }
}

open class SuperClass(var a2: Int){
    open var a1 = 100

    open fun superMethod1(){
        println("SuperClass의 superMethod1")
    }
}

class SubClass : SuperClass(200){
    override var a1 = 1000

    fun subMethod1(){
        println("a1: $a1")
        println("super.a1: ${super.a1}")

        superMethod1()
        super.superMethod1()
    }
}