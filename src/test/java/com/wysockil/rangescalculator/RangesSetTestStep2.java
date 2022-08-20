package com.wysockil.rangescalculator;

import org.junit.jupiter.api.Test;

import static com.google.common.collect.Sets.newHashSet;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RangesSetTestStep2 {
    private RangesSet rangeSet;

    private void collectRanges(Range... ranges) {
        rangeSet = new RangesSet(newHashSet(ranges), new RangesCalculatorImpl());
    }

    @Test
    public void shouldCountNonTouchingRangesWithWrapperRange() {
        collectRanges(new Range(1, 3), new Range(2, 4), new Range(0, 6));

        assertEquals(rangeSet.countOfRanges(), 1);
    }

}
