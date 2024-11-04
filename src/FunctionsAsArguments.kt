fun main() {
    foo( bar= {
       println("Bar function logic here")
    })

    foo {
        println("Bar 2 function logic here 2")
    }
}

fun foo(bar: () -> Unit) {
   println("Logic inside foo function")
   bar()
}