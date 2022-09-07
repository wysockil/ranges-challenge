package com.wysockil.rangescalculator;

import org.junit.jupiter.api.Test;

import static com.google.common.collect.Sets.newHashSet;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RangesSetTest {

    private RangesSet rangeSet;

    private void collectRanges(Range... ranges) {
        rangeSet = new RangesSet(newHashSet(ranges), new RangesCalculatorImpl());
    }

    @Test
    public void shouldCountNonTouchingRanges() {
        collectRanges(new Range(1, 2), new Range(3, 4));

        assertEquals(2, rangeSet.countOfRanges());
    }

    @Test
    public void shouldCountNonTouchingRangesWithCommonPart() {
        collectRanges(new Range(1, 3), new Range(2, 4), new Range(5, 6), new Range(7, 8));

        assertEquals(3, rangeSet.countOfRanges());
    }


    @Test
    public void shouldCountNonTouchingRangesWithWrapperRange() {
        collectRanges(new Range(1, 3), new Range(2, 4), new Range(0, 6));

        assertEquals(1, rangeSet.countOfRanges());
    }

    @Test
    public void shouldReturnZeroWhenRangesCollectionIsEmpty() {
        collectRanges();

        assertEquals(0, rangeSet.countOfRanges());
    }
}