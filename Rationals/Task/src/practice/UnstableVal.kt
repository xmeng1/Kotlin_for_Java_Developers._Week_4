package practice

val foo: Int
    get() = (Math.random()*100).toInt()

val nonLazyValue  = {
    println("nonLazyValue")
}

val lazyValue  by lazy  {
    println("lazyValue")
}

class A {
    private lateinit var prop: String

    fun setUp() {
        prop = "value"
    }

    fun display() {
        println(prop)
    }
}


fun main(args: Array<String>) {
    // The values should be different:
//    println(foo)
//    println(foo)
//    println(foo)

    val a = A()
    a.setUp()
    a.display()
}