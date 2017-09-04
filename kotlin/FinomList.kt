import java.util.Spliterator
import java.util.concurrent.ThreadLocalRandom
import java.util.function.Consumer
import java.util.function.Predicate
import java.util.function.UnaryOperator

class FinomList<T> : ArrayList<T>() {

    private val kerszValamitEnni = listOf(
            "Hallgass rám",
            "Kérsz valamit enni?",
            "Finomliszt",
            "Durumliszt",
            "Rétesliszt",
            "Kenyérliszt",
            "Ife onje búzadara",
            "Búzadara see me oh",
            "Búzadara ore mi",
            "Búzadara Ife mi",
            "Búzadara iyawo mi",
            "Adj nekem búzát, szeretnék minden nap",
            "Toroskáposzta és kenyér, gyere eszünk? Bem tér",
            "This kind of food you go chop and en go full you for two days",
            "This kind of God gave me búza en dey give me nonstop"
    )

    private fun printBuza() = println(kerszValamitEnni[ThreadLocalRandom.current().nextInt(kerszValamitEnni.size)])

    override fun spliterator(): Spliterator<T> {
        printBuza()
        return super.spliterator()
    }

    override fun indexOf(element: T): Int {
        printBuza()
        return super.indexOf(element)
    }

    override fun removeAt(index: Int): T {
        printBuza()
        return super.removeAt(index)
    }

    override fun removeRange(fromIndex: Int, toIndex: Int) {
        printBuza()
        super.removeRange(fromIndex, toIndex)
    }

    override fun clone(): Any {
        printBuza()
        return super.clone()
    }

    override fun ensureCapacity(minCapacity: Int) {
        printBuza()
        super.ensureCapacity(minCapacity)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        printBuza()
        return super.addAll(elements)
    }

    override fun addAll(index: Int, elements: Collection<T>): Boolean {
        printBuza()
        return super.addAll(index, elements)
    }

    override fun set(index: Int, element: T): T {
        printBuza()
        return super.set(index, element)
    }

    override val size: Int
        get() {
            printBuza()
            return super.size
        }

    override fun lastIndexOf(element: T): Int {
        printBuza()
        return super.lastIndexOf(element)
    }

    override fun removeIf(filter: Predicate<in T>): Boolean {
        printBuza()
        return super.removeIf(filter)
    }

    override fun listIterator(index: Int): MutableListIterator<T> {
        printBuza()
        return super.listIterator(index)
    }

    override fun listIterator(): MutableListIterator<T> {
        printBuza()
        return super.listIterator()
    }

    override fun subList(fromIndex: Int, toIndex: Int): MutableList<T> {
        printBuza()
        return super.subList(fromIndex, toIndex)
    }

    override fun contains(element: T): Boolean {
        printBuza()
        return super.contains(element)
    }

    override fun sort(c: Comparator<in T>?) {
        printBuza()
        super.sort(c)
    }

    override fun trimToSize() {
        printBuza()
        super.trimToSize()
    }

    override fun replaceAll(operator: UnaryOperator<T>) {
        printBuza()
        super.replaceAll(operator)
    }

    override fun clear() {
        printBuza()
        super.clear()
    }

    override fun <T : Any?> toArray(a: Array<out T>?): Array<T> {
        printBuza()
        return super.toArray(a)
    }

    override fun toArray(): Array<Any> {
        printBuza()
        return super.toArray()
    }

    override fun remove(element: T): Boolean {
        printBuza()
        return super.remove(element)
    }

    override fun removeAll(elements: Collection<T>): Boolean {
        printBuza()
        return super.removeAll(elements)
    }

    override fun retainAll(elements: Collection<T>): Boolean {
        printBuza()
        return super.retainAll(elements)
    }

    override fun add(index: Int, element: T) {
        printBuza()
        super.add(index, element)
    }

    override fun add(element: T): Boolean {
        printBuza()
        return super.add(element)
    }

    override fun get(index: Int): T {
        printBuza()
        return super.get(index)
    }

    override fun iterator(): MutableIterator<T> {
        printBuza()
        return super.iterator()
    }

    override fun forEach(action: Consumer<in T>?) {
        printBuza()
        super.forEach(action)
    }

    override fun isEmpty(): Boolean {
        printBuza()
        return super.isEmpty()
    }
}