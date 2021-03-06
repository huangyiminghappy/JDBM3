/*******************************************************************************
 * Copyright 2010 Cees De Groot, Alex Boisvert, Jan Kotek
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package org.apache.jdbm;

import junit.framework.TestCase;

/**
 * This class contains some test utilities.
 */
public class UtilTT {
    /**
     * Creates a "record" containing "length" repetitions of the indicated byte.
     */
    public static byte[] makeRecord(int length, byte b) {
        byte[] retval = new byte[length];
        for (int i = 0; i < length; i++)
            retval[i] = b;
        return retval;
    }

    /**
     * Checks whether the record has the indicated length and data
     */
    public static boolean checkRecord(byte[] data, int length, byte b) {
        TestCase.assertEquals("lenght does not match", length, data.length);
        for (int i = 0; i < length; i++)
            TestCase.assertEquals("byte " + i, b, data[i]);

        return true;
    }

}
