package com.example.demo

import spock.lang.Specification
import spock.lang.Unroll

/**
 *
 * @date 2020-01-06
 * @author wangkang
 */
class GroovyTest extends Specification {


    @Unroll
    def "Power of #val is #result"() {
        expect:
        Math.pow(val, 2) == result
        where:
        val || result
        1   || 1
        2   || 4
        3   || 9
        4   || 16
    }

    @Unroll
    def "Power(#base,#exponent) is #result"() {
        expect:
        Math.pow(base, exponent) == result
        where:
        base | exponent || result
        1    | 2        || 1
        2    | 3        || 8
        3    | 4        || 81
        4    | 5        || 1024
    }

    @Unroll
    def "Power(#base,#exponent) == #result1 and Power(#base,2) == #result2"() {
        expect:
        Math.pow(base, exponent) == result1
        and:
        Math.pow(base, 2) == result2
        where:
        base | exponent || result1 | result2
        1    | 2        || 1 | 1
        2    | 3        || 8 | 4
        3    | 4        || 81 | 9
        4    | 5        || 1024 | 16
    }

    @Unroll
    def "Computing the maximum of (#a,#b) is #c"() {
        expect:
        Math.max(a, b) == c

        where:
        a << [5, 3]
        b << [1, 9]
        c << [5, 9]
    }

    @Unroll
    def " #name should have length #length "() {
        expect:
        name.length() == length
        where:
        name << ["Computing", "Should", "Have", "Name"]
        length << [9, 6, 4, 4]
    }
}
