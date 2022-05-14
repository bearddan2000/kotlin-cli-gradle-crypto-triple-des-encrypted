package example;

fun printVerify(pass1: String, pass2: String, test: Boolean)
{
  val baseStr: String = String.format("%s, %s", pass1, pass2)

  if(test) {
    println(String.format("%s Match: True", baseStr))
  } else {
    println(String.format("%s Match: False", baseStr))
  }
}

// Driver code
@Throws(Exception::class)
fun main(args: Array<String>)
{
    val encrypt = Encryption()

    val hash: String = encrypt.encryptPasswordBased("pass123");

    val unhash: String = encrypt.decryptPasswordBased(hash)

    val test1: Boolean = unhash.equals("pass123");

    val test2: Boolean = unhash.equals("123pass");

    printVerify("pass123", "pass123", test1)

    printVerify("pass123", "123pass", test2)
}
