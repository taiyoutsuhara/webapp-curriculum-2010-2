import scala.reflect.runtime.universe._

class Issue(private val title: String) {
    private def printTitle(): Unit = println(title)
}

object ReflectionChallenge extends App {
    val issue = new Issue("不具合1")

      // TODO リフレクションを用いて printTitle() メソッドを呼び出す
}

