object FixCompile extends App {

    val mapper = (i: Int) => if (i % 2 != 0) i * 2 else 0

    val result = List(1, 2, 3, 4, 5, 6, 7, 8, 9).map {
        mapper
      }.foldLeft(0) { (acc, v) => acc + v }

     print(result)
}