// src/script/scala/progscala3/rounding/InfixMethod.scala

case class Foo(str: String):
  def append(s: String): Foo = copy(str + s)

Foo("one").append("two")        // <1>
Foo("one") `append` "two"       // <2>
Foo("one") append "two"         // <3>
