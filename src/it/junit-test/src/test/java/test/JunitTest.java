/*
 * Copyright © 2020 Miroslav Pokorny
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package test;


import com.google.j2cl.junit.apt.J2clTestInput;
import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

@J2clTestInput(JunitTest.class)
public class JunitTest {

    @Test
    public void testSetMillisZero() {
        final Calendar calendar = calendar();
        calendar.setTimeInMillis(0);

        check(calendar, 1970, 0, 1, 10, 0, 0);
    }

    @Test
    public void testSetMillis() {
        final Calendar calendar = calendar();
        calendar.setTimeInMillis(18000000);

        this.check(calendar, 1970, 0, 1, 15, 0, 0);
    }

    @Test
    public void testSetYearMonthDay() {
        final Calendar calendar = calendar();
        calendar.setTimeInMillis(0);

        final int year = 2020;
        final int month = Calendar.MAY;
        final int day = 15;

        this.setAndCheck(calendar,
                year,
                month,
                day,
                0,
                0,
                0);
    }

    @Test
    public void testSetYearMonthDay2() {
        final Calendar calendar = calendar();
        calendar.setTimeInMillis(0);

        final int year = 2000;
        final int month = Calendar.MAY;
        final int day = 15;

        this.setAndCheck(calendar,
                year,
                month,
                day,
                0,
                0,
                0);
    }

    @Test
    public void testSetYearMonthDay3() {
        final Calendar calendar = calendar();
        calendar.setTimeInMillis(0);

        final int year = 1999;
        final int month = Calendar.DECEMBER;
        final int day = 31;

        this.setAndCheck(calendar,
                year,
                month,
                day,
                0,
                0,
                0);
    }

    @Test
    public void testSetYearMonthDay4() {
        final Calendar calendar = calendar();
        calendar.setTimeInMillis(0);

        final int year = 2000;
        final int month = Calendar.JANUARY;
        final int day = 1;

        this.setAndCheck(calendar,
                year,
                month,
                day,
                0,
                0,
                0);
    }

    @Test
    public void testSetYearMonthDayHoursMinutesSeconds() {
        final Calendar calendar = calendar();
        calendar.setTimeInMillis(0);

        final int year = 2020;
        final int month = Calendar.MAY;
        final int day = 15;
        final int hours = 16;
        final int minutes = 5;
        final int seconds = 59;

        this.setAndCheck(calendar,
                year,
                month,
                day,
                hours,
                minutes,
                seconds);
    }

    private void setAndCheck(final Calendar calendar,
                             final int year,
                             final int month,
                             final int day,
                             final int hours,
                             final int minutes,
                             final int seconds) {
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.HOUR_OF_DAY, hours);
        calendar.set(Calendar.MINUTE, minutes);
        calendar.set(Calendar.SECOND, seconds);

        this.check(calendar, year, month, day, hours, minutes, seconds);
    }

    private void check(final Calendar calendar,
                       final int year,
                       final int month,
                       final int day,
                       final int hours,
                       final int minutes,
                       final int seconds) {
        this.checkYearMonthDay(calendar, year, month, day);
        this.checkHoursMinutesSeconds(calendar, hours, minutes, seconds);
    }

    private void checkYearMonthDay(final Calendar calendar,
                                   final int year,
                                   final int month,
                                   final int day) {
        Assert.assertEquals("YEAR " + calendar, year, calendar.get(Calendar.YEAR));
        Assert.assertEquals("MONTH " + calendar, month, calendar.get(Calendar.MONTH));
        Assert.assertEquals("DAY_OF_MONTH " + calendar, day, calendar.get(Calendar.DAY_OF_MONTH));
    }

    private void checkHoursMinutesSeconds(final Calendar calendar,
                                          final int hours,
                                          final int minutes,
                                          final int seconds) {
        Assert.assertEquals("HOUR_OF_DAY " + calendar, hours, calendar.get(Calendar.HOUR_OF_DAY));
        Assert.assertEquals("MINUTE " + calendar, minutes, calendar.get(Calendar.MINUTE));
        Assert.assertEquals("SECOND " + calendar, seconds, calendar.get(Calendar.SECOND));
    }

    @Test
    public void testClone() {
        final Calendar calendar = calendar();
        final Object clone = calendar.clone();
        Assert.assertNotSame(calendar, clone);
        Assert.assertEquals(calendar, clone);
    }

    private Calendar calendar() {
        final TimeZone timeZone = TimeZone.getTimeZone("Australia/Sydney");
        Assert.assertNotNull("timeZone", timeZone);

        final Locale locale = Locale.forLanguageTag("en-AU");
        Assert.assertNotNull("locale", locale);

        Locale.setDefault(locale);

        return Calendar.getInstance(timeZone, locale);
    }
}
