[![Build Status](https://travis-ci.com/firephil/Crazy8s-scala-2.13.5.svg?branch=master)](https://travis-ci.com/firephil/Crazy8s-scala-2.13.5)

## Crazy 8s Code Golf Challenge

https://codegolf.stackexchange.com/questions/104356/crazy-8s-code-golf/104482#104482

**Create a program that prints all whole numbers inclusively between an interval (a, b), and replaces multiples of 8**
in the sequence with random (uniformly distributed, independent of other characters), non-numeric,
non-whitespace, printable ASCII characters.

*Assume 0 < a < b in all cases.*

*If the number has more than 1 digit, make sure the amount of characters in the replacement matches!*

**Examples:**

`(1, 16) -> 1 2 3 4 5 6 7 $ 9 10 11 12 13 14 15 n@`

`(115, 123) -> 115, 116, 117, 118, 119, :F<, 121, 122, 123`

`(1, 3) -> 1 2 3`

**Non-Examples:**

`(1, 16) -> 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16`

`(115, 123) -> 115 116 117 118 119 $ 121 122 123`

## [Scala], 183 bytes

<!-- language-all: lang-scala -->

      def S(a: Int, b: Int)={
        val c=(33 to 47)++(58 to 126)
        val r = (a to b).map{
          x => if(x % 8 == 0) Random.nextInt(c.length).toChar.toString else String.valueOf(x)}
        r}

## [Scala], 134 bytes

<!-- language-all: lang-scala -->

    def S(a:Int,b:Int)= a to b map(x=>if(x%8==0)Random.nextInt(((33 to 47) ++ (58 to 126)).length).toChar.toString else String.valueOf(x))

[Try it online!][TIO-km6lw4uh]

[Scala]: http://www.scala-lang.org/
[TIO-km6lw4uh]: https://tio.run/##VY/dSsQwEIXv8xRzI0zYJXStP4tQQb0SFME@wbSd7kbSJDRTKYjPXhP2ypuZOcM5H5zUk6PNTjHMAqkI0wfnuBcbvJkWoc6xebNJnpdx5Fn9sy5infkkP4RJKRW6r5yDd7IeeBX2Q4KnGH8UwDbwCC3Sw6uXfVemboBAAnQwUcS1ebQjrlfHpqn0BWh8ZmQjItZ1cd7ca9jtAG@PRR2u77Q2jv1JztpIeDnTnFcrs/UnYJcYLrf5JrfwR6ZrvQHE/BNs8VDt66oESzetfrc/ "Scala – Try It Online"