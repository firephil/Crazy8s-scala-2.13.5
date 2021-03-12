[![Build Status](https://travis-ci.org/firephil/Crazy8s-intelij-sbt.svg?branch=master)](https://travis-ci.org/firephil/Crazy8s-intelij-sbt)

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

### Improved Functional style code
# [Scala], 183 bytes

<!-- language-all: lang-scala -->

      def S(a: Int, b: Int)={
        val c=(33 to 47)++(58 to 126)
        val r = (a to b).map{
          x => if(x % 8 == 0) Random.nextInt(c.length).toChar.toString else String.valueOf(x)}
        r}

[Try it online!][TIO-km6hjwb8]

[Scala]: http://www.scala-lang.org/
[TIO-km6hjwb8]: https://tio.run/##VVDLSsQwFN3nK85GSJghdKyPQYigrgRFsF@QtulMJE1KeisF6bfXZAqCq/s6L@7YaKdX2w8hEsY8yCY4Zxqywct@Il07I9/sSM9T15nI/kEnsk5@at@GnjEW6q/Ew7u2HmYm49sRT8Pww4AVaE2HiusHvHrao75UofIR@NYOjeJlCQq4uRe7Hb895v5wfSf@EBEKXOd1LWSvh40LzFCPsB2fcYUjlEIhsIWSPuVIPryRzvgTnYWk8HLWMZWKovUnGDcabL1MJpP5SEJiuUjHJeUe0ol4xQ/FviwyPz9DsGX9BQ "Scala – Try It Online"