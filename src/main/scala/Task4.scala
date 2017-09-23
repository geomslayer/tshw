object Task4 extends App {

  def fixByName(step: (=> (BigInt, Long) => Long) => ((BigInt, Long) => Long)): (BigInt, Long) => Long =
    step(fixByName(step))

  def countOnes(num: BigInt, count: Long): Long =
    if (num == 0) count
    else countOnes(num / 2, if (num % 2 == 0) count else count + 1)

}