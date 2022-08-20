package com.wysockil.rangescalculator;

import java.util.Set;

public class RangesSet {
    private final Set<Range> ranges;
    private final RangesCalculator rangesCalculator;

    public RangesSet(Set<Range> ranges, RangesCalculator rangesCalculator) {
        this.ranges = ranges;
        this.rangesCalculator = rangesCalculator;
    }

    public int countOfRanges() {
        return rangesCalculator.count(ranges);
    }
}
