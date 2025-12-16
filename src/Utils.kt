import java.math.BigInteger
import java.security.MessageDigest
import kotlin.io.path.Path
import kotlin.io.path.readText

/**
 * Reads lines from the given input txt file.
 */
fun readInput(name: String) = Path("src/$name.txt").readText().trim().lines()

/**
 * Converts string to md5 hash.
 */
fun String.md5() = BigInteger(1, MessageDigest.getInstance("MD5").digest(toByteArray()))
    .toString(16)
    .padStart(32, '0')

/**
 * The cleaner shorthand for printing output.
 */
fun Any?.println() = println(this)

fun <T> T.alsoPrint(block: (T) -> Any = { this.toString() }) = also { println(block(this)) }
inline fun <F, S, F2> List<Pair<F, S>>.mapFirst(block: (F) -> F2) = map { block(it.first) to it.second }
inline fun <F, S, S2> List<Pair<F, S>>.mapSecond(block: (S) -> S2) = map { it.first to block(it.second) }
