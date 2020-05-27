/*
 * Copyright 2019 Miroslav Pokorny (github.com/mP1)
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
 *
 */

package walkingkooka.j2cl.java.util.calendar;

import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.TimeZone;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class GregorianCalendarTest extends CalendarTestCase<GregorianCalendar> {

    @Test
    public void testEraConstant() {
        assertEquals(java.util.Calendar.ERA, Calendar.ERA, "Calendar.ERA");
    }

    @Test
    public void testYearConstant() {
        assertEquals(java.util.Calendar.YEAR, Calendar.YEAR, "Calendar.YEAR");
    }

    @Test
    public void testMonthConstant() {
        assertEquals(java.util.Calendar.MONTH, Calendar.MONTH, "Calendar.MONTH");
    }

    @Test
    public void testDayOfMonthConstant() {
        assertEquals(java.util.Calendar.DAY_OF_MONTH, Calendar.DAY_OF_MONTH, "Calendar.DAY_OF_MONTH");
    }

    @Test
    public void testDayOfWeekConstant() {
        assertEquals(java.util.Calendar.DAY_OF_WEEK, Calendar.DAY_OF_WEEK, "Calendar.DAY_OF_WEEK");
    }

    @Test
    public void testDayOfWeekInMonthConstant() {
        assertEquals(java.util.Calendar.DAY_OF_WEEK_IN_MONTH, Calendar.DAY_OF_WEEK_IN_MONTH, "Calendar.DAY_OF_WEEK_IN_MONTH");
    }

    @Test
    public void testAmConstant() {
        assertEquals(java.util.Calendar.AM, Calendar.AM, "Calendar.AM");
    }

    @Test
    public void testPmConstant() {
        assertEquals(java.util.Calendar.PM, Calendar.PM, "Calendar.PM");
    }

    @Test
    public void testAmpmConstant() {
        assertEquals(java.util.Calendar.AM_PM, Calendar.AM_PM, "Calendar.AM_PM");
    }

    @Test
    public void testHourConstant() {
        assertEquals(java.util.Calendar.HOUR, Calendar.HOUR, "Calendar.HOUR");
    }

    @Test
    public void testHourOfDayConstant() {
        assertEquals(java.util.Calendar.HOUR_OF_DAY, Calendar.HOUR_OF_DAY, "Calendar.HOUR_OF_DAY");
    }

    @Test
    public void testMinuteConstant() {
        assertEquals(java.util.Calendar.MINUTE, Calendar.MINUTE, "Calendar.MINUTE");
    }

    @Test
    public void testSecondConstant() {
        assertEquals(java.util.Calendar.SECOND, Calendar.SECOND, "Calendar.SECOND");
    }

    @Test
    public void testMillisecondsConstant() {
        assertEquals(java.util.Calendar.MILLISECOND, Calendar.MILLISECOND, "Calendar.MILLISECOND");
    }

    @Test
    public void testMondayConstant() {
        assertEquals(java.util.Calendar.MONDAY, Calendar.MONDAY, "Calendar.MONDAY");
    }

    @Test
    public void testTuesdayConstant() {
        assertEquals(java.util.Calendar.TUESDAY, Calendar.TUESDAY, "Calendar.TUESDAY");
    }

    @Test
    public void testWednesdayConstant() {
        assertEquals(java.util.Calendar.WEDNESDAY, Calendar.WEDNESDAY, "Calendar.WEDNESDAY");
    }

    @Test
    public void testThursdayConstant() {
        assertEquals(java.util.Calendar.THURSDAY, Calendar.THURSDAY, "Calendar.THURSDAY");
    }

    @Test
    public void testFridayConstant() {
        assertEquals(java.util.Calendar.FRIDAY, Calendar.FRIDAY, "Calendar.FRIDAY");
    }

    @Test
    public void testSaturdayConstant() {
        assertEquals(java.util.Calendar.SATURDAY, Calendar.SATURDAY, "Calendar.SATURDAY");
    }

    @Test
    public void testSundayConstant() {
        assertEquals(java.util.Calendar.SUNDAY, Calendar.SUNDAY, "Calendar.SUNDAY");
    }

    @Test
    public void testJanuaryConstant() {
        assertEquals(java.util.Calendar.JANUARY, Calendar.JANUARY, "Calendar.JANUARY");
    }

    @Test
    public void testFebruaryConstant() {
        assertEquals(java.util.Calendar.FEBRUARY, Calendar.FEBRUARY, "Calendar.FEBRUARY");
    }

    @Test
    public void testMarchConstant() {
        assertEquals(java.util.Calendar.MARCH, Calendar.MARCH, "Calendar.MARCH");
    }

    @Test
    public void testAprilConstant() {
        assertEquals(java.util.Calendar.APRIL, Calendar.APRIL, "Calendar.APRIL");
    }

    @Test
    public void testMayConstant() {
        assertEquals(java.util.Calendar.MAY, Calendar.MAY, "Calendar.MAY");
    }

    @Test
    public void testJuneConstant() {
        assertEquals(java.util.Calendar.JUNE, Calendar.JUNE, "Calendar.JUNE");
    }

    @Test
    public void testJulyConstant() {
        assertEquals(java.util.Calendar.JULY, Calendar.JULY, "Calendar.JULY");
    }

    @Test
    public void testAugustConstant() {
        assertEquals(java.util.Calendar.AUGUST, Calendar.AUGUST, "Calendar.AUGUST");
    }

    @Test
    public void testSeptemberConstant() {
        assertEquals(java.util.Calendar.SEPTEMBER, Calendar.SEPTEMBER, "Calendar.SEPTEMBER");
    }

    @Test
    public void testOctoberConstant() {
        assertEquals(java.util.Calendar.OCTOBER, Calendar.OCTOBER, "Calendar.OCTOBER");
    }

    @Test
    public void testNovemberConstant() {
        assertEquals(java.util.Calendar.NOVEMBER, Calendar.NOVEMBER, "Calendar.NOVEMBER");
    }

    @Test
    public void testDecemberConstant() {
        assertEquals(java.util.Calendar.DECEMBER, Calendar.DECEMBER, "Calendar.DECEMBER");
    }

    @Test
    public void testUndecemberConstant() {
        assertEquals(java.util.Calendar.UNDECIMBER, Calendar.UNDECIMBER, "Calendar.UNDECIMBER");
    }

    @Test
    public void testNow() {
        this.checkEquals(new java.util.GregorianCalendar(), new GregorianCalendar());
    }

    @Test
    public void test1Jan2000() {
        this.newYearMonthDayAndCheck(2000, 1, 1);
    }

    @Test
    public void test1Jan2020() {
        this.newYearMonthDayAndCheck(2020, 1, 1);
    }

    private void newYearMonthDayAndCheck(final int year, final int month, final int day) {
        this.checkEquals(new java.util.GregorianCalendar(year, month, day),
                new GregorianCalendar(year, month, day));
    }

    @Test
    public void testSetMillisNow() {
        final Calendar emulated = emulatedCalendar();
        final java.util.Calendar jre = jreCalendar();

        final long millis = System.currentTimeMillis();

        emulated.setTimeInMillis(millis);
        jre.setTimeInMillis(millis);

        this.checkEquals(jre, emulated);
    }

    @Test
    public void testSetMillisZero() {
        final Calendar emulated = emulatedCalendar();
        final java.util.Calendar jre = jreCalendar();

        final long millis = 0;

        emulated.setTimeInMillis(millis);
        jre.setTimeInMillis(millis);

        this.checkEquals(jre, emulated);
    }

    @Test
    public void testSetYearMonthDay() {
        final Calendar emulated = emulatedCalendar();
        final java.util.Calendar jre = jreCalendar();

        final int year = 2020;
        final int month = 5;
        final int day = 15;

        emulated.setTimeInMillis(0);
        jre.setTimeInMillis(0);

        emulated.set(year, month, day);
        jre.set(year, month, day);

        this.checkEquals(jre, emulated);
    }

    @Test
    public void testSetYearMonthDay2() {
        final Calendar emulated = emulatedCalendar();
        final java.util.Calendar jre = jreCalendar();

        final int year = 1999;
        final int month = 5;
        final int day = 15;

        emulated.setTimeInMillis(0);
        jre.setTimeInMillis(0);

        emulated.set(year, month, day);
        jre.set(year, month, day);

        this.checkEquals(jre, emulated);
    }

    @Test
    public void testSetYearMonthDayHoursMinutesSeconds() {
        final Calendar emulated = emulatedCalendar();
        final java.util.Calendar jre = jreCalendar();

        final int year = 2020;
        final int month = 5;
        final int day = 15;
        final int hours = 15;
        final int minutes = 37;
        final int seconds = 59;

        emulated.setTimeInMillis(0);
        jre.setTimeInMillis(0);

        emulated.set(year, month, day, hours, minutes, seconds);
        jre.set(year, month, day, hours, minutes, seconds);

        this.checkEquals(jre, emulated);
    }

    @Test
    public void testClone() {
        final Calendar emulated = emulatedCalendar();
        assertEquals(emulated, emulated.clone());
    }

    private final static TimeZone TIME_ZONE = TimeZone.getTimeZone("Sydney/Australia");
    private final static Locale LOCALE = Locale.forLanguageTag("EN-AU");

    private Calendar emulatedCalendar() {
        return Calendar.getInstance(TIME_ZONE, LOCALE);
    }

    private java.util.Calendar jreCalendar() {
        return java.util.Calendar.getInstance(TIME_ZONE, LOCALE);
    }

    private void checkEquals(final java.util.Calendar jre,
                             final Calendar emulated) {
        // assertEquals(double, double, so delta is present.
        assertEquals((double) jre.getTimeInMillis(), (double) emulated.getTimeInMillis(), MILLI_DELTA, "getTimeInMillis");
        assertEquals((double) jre.getTime().getTime(), (double) emulated.getTime().getTime(), MILLI_DELTA, "getTime");
        assertEquals(jre.getTimeZone(), emulated.getTimeZone(), "timeZone");

        this.checkYear(jre, emulated);
        this.checkMonth(jre, emulated);
        this.checkDayOfMonth(jre, emulated);
        this.checkDayOfWeek(jre, emulated);
        this.checkDayOfYear(jre, emulated);
        this.checkDayOfWeekInMonth(jre, emulated);

        assertEquals(jre.getFirstDayOfWeek(), emulated.getFirstDayOfWeek(), "getFirstDayOfWeek");
        assertEquals(jre.getMinimalDaysInFirstWeek(), emulated.getMinimalDaysInFirstWeek(), "getMinimalDaysInFirstWeek");
    }

    private final static int MILLI_DELTA = 50;

    private void checkYear(final java.util.Calendar jre,
                           final Calendar emulated) {
        this.checkField(jre, emulated, Calendar.YEAR, "YEAR");
    }

    private void checkMonth(final java.util.Calendar jre,
                            final Calendar emulated) {
        this.checkField(jre, emulated, Calendar.MONTH, "MONTH");
    }

    private void checkDayOfWeek(final java.util.Calendar jre,
                                final Calendar emulated) {
        this.checkField(jre, emulated, Calendar.DAY_OF_WEEK, "DAY_OF_WEEK");
    }

    private void checkDayOfWeekInMonth(final java.util.Calendar jre,
                                       final Calendar emulated) {
        this.checkField(jre, emulated, Calendar.DAY_OF_WEEK_IN_MONTH, "DAY_OF_WEEK_IN_MONTH");
    }

    private void checkDayOfMonth(final java.util.Calendar jre,
                                 final Calendar emulated) {
        this.checkField(jre, emulated, Calendar.DAY_OF_MONTH, "DAY_OF_MONTH");
    }

    private void checkDayOfYear(final java.util.Calendar jre,
                                final Calendar emulated) {
        this.checkField(jre, emulated, Calendar.DAY_OF_YEAR, "DAY_OF_YEAR");
    }

    private void checkField(final java.util.Calendar jre,
                            final Calendar emulated,
                            final int field,
                            final String label) {
        assertEquals(jre.get(field),
                emulated.get(field),
                jre + " field=" + label);
    }

    // ClassTesting.....................................................................................................

    @Override
    public Class<GregorianCalendar> type() {
        return GregorianCalendar.class;
    }
}
