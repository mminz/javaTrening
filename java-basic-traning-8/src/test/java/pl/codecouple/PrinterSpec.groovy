package pl.codecouple

import spock.lang.Specification
import java.lang.Void as Should

class PrinterSpec extends Specification {

    Should "return reverse string"() {
        given:
            Printer printer = new Printer('abc')
        when:
            def result = printer.reverseString()
        then:
            result == 'cba'
    }

    Should "return indexOf 'a' char from 'abc'"() {
        given:
            Printer printer = new Printer('abc')
        when:
            def result = printer.indexA()
        then:
            result == 0

    }

    Should "delete 'a' from 'abc'"() {
        given:
            Printer printer = new Printer('abc')
        when:
            def result = printer.deleteA()
        then:
            result == 'bc'

    }

    Should "thrown IllegalArgumentException when given String in constructor is null"() {
        when:
            new Printer(null)
        then:
            thrown(IllegalArgumentException)

    }

    Should "return lastIndexOf 'c' char from 'abc'"() {
        given:
            Printer printer = new Printer('abc')
        when:
            def result = printer.indexC()
        then:
            result == 2

    }

    Should "replace char in 'abc' on index '1' to '2' "() {
        given:
            Printer printer = new Printer('abc')
        when:
            def result = printer.replaceAwithC()
        then:
            result == 'aXXXc'

    }

    Should "remove char on first index from 'abc'"(){
        given:
            Printer printer = new Printer ('abc')
        when:
            def result = printer.removeFirstIndex ()
        then:
            result == 'bc'
    }
    Should "thrown EmptyStringException when given String in constructor is null or empty"() {
        when:
            new Printer("")
        then:
            thrown(EmptyStringException)

    }

}
