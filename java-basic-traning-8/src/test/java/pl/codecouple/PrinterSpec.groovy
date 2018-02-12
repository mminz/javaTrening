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

    Should "thrown IllegalArgumentException when given String in constructor is null or empty"() {
        given:
        Printer printer = new Printer("")
        when:
        def result = printer.reverseString()
        then:
        result == null


    }

    Should "return lastIndexOf 'c' char from 'abc'"() {
        given:
        Printer printer = new Printer('abc')
        when:
        def result = printer.indexC()
        then:
        result == 2

    }

}
