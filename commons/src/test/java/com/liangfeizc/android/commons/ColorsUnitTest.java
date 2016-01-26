package com.liangfeizc.android.commons;

import android.graphics.Color;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ColorsUnitTest {
    @Test
    public void testToHexString() throws Exception {
        assertEquals("#FF0000", Colors.toHexString(Color.RED));
        assertEquals("#00FF00", Colors.toHexString(Color.GREEN));
    }
}