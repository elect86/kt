package vec._2

/**
 * Created bY GBarbieri on 05.10.2016.
 */

data class Vec2bool(var x: Boolean = false, var y: Boolean = false) {

    // -- Explicit basic, conversion b and conversion vector constructors --

    constructor(b: Boolean) : this(b, b)

    constructor(ba: BooleanArray) : this(ba[0], ba[1])

    constructor(ba: Array<Boolean>) : this(ba[0], ba[1])

    // -- Component accesses --

    operator fun get(i: Int): Boolean = when (i) {0 -> x; else -> y; }

    operator fun set(i: Int, b: Boolean) = when (i) {0 -> x = b; else -> y = b; }


    fun to(b: Boolean): Vec2bool {
        x = b; y = b; return this
    }

    fun to(x: Boolean, y: Boolean): Vec2bool {
        this.x = x; this.y = y; return this
    }

    fun to(ba: BooleanArray): Vec2bool {
        x = ba[0]; y = ba[1]; return this
    }

    fun to(ba: Array<Boolean>): Vec2bool {
        x = ba[0]; y = ba[1]; return this
    }


    // -- Unary arithmetic vecOperators --

    operator fun not(): Vec2bool = Vec2bool(x = !x, y = !y)

    fun notAss(): Vec2bool {
        x = !x
        y = !y
        return this
    }

    infix inline fun not(res: Vec2bool): Vec2bool {
        res.x = !x; res.y = !y; return this
    }
}