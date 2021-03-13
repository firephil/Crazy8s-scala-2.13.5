[![Build Status](https://travis-ci.com/firephil/Crazy8s-scala-2.13.5.svg?branch=master)](https://travis-ci.com/firephil/Crazy8s-scala-2.13.5)
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/a6208792dbfa426db7d9dfae796fe247)](https://www.codacy.com/gh/firephil/Crazy8s-scala-2.13.5/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=firephil/Crazy8s-scala-2.13.5&amp;utm_campaign=Badge_Grade)
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

# [Scala], 132 bytes

<!-- language-all: lang-scala -->

    def S(a:Int,b:Int)= a to b map(x=>if(x%8==0)random.nextInt(((33 to 47)++(58 to 126)).length).toChar.toString else String.valueOf(x))

[Try it online!][TIO-km89mvcm]

[Scala]: http://www.scala-lang.org/
[TIO-km89mvcm]: https://tio.run/##TZDPasMwDMbvfgpdBjYtJl32pwxS6HYabAyWJ1ASpXVx7GArXcbYs2f2usMu0ifx@ySh2KLFxQyjDwwxF7r11lLLxjs9TIyNJf1iIj9OfU9B/KEnPKOO1E7B8Keus6B3dJ0fhPDNKfnhFY0DmplcF2E/jl9CnNFC@KWgAkcf8N8olQBYOuqhlvjw7Hjd5KgqQGAPDQw4yrnamV7OV9uqKtRllHZpSQKllGWZyZt7tVrJ223Wm@s7pbQld@Cj0uyfjhhSqjkYdwCykeCidbptorc0W6kFYEw9lrXcFOuyyMb8AiW@lx8 "Scala – Try It Online"