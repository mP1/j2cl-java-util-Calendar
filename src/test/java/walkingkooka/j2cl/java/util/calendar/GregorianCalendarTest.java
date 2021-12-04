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

import java.lang.reflect.Method;
import java.util.Locale;
import java.util.TimeZone;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class GregorianCalendarTest extends CalendarTestCase<GregorianCalendar> {

    @Test
    public void testEraConstant() {
        this.checkEquals(java.util.Calendar.ERA, Calendar.ERA, "Calendar.ERA");
    }

    @Test
    public void testYearConstant() {
        this.checkEquals(java.util.Calendar.YEAR, Calendar.YEAR, "Calendar.YEAR");
    }

    @Test
    public void testMonthConstant() {
        this.checkEquals(java.util.Calendar.MONTH, Calendar.MONTH, "Calendar.MONTH");
    }

    @Test
    public void testDayOfMonthConstant() {
        this.checkEquals(java.util.Calendar.DAY_OF_MONTH, Calendar.DAY_OF_MONTH, "Calendar.DAY_OF_MONTH");
    }

    @Test
    public void testDayOfWeekConstant() {
        this.checkEquals(java.util.Calendar.DAY_OF_WEEK, Calendar.DAY_OF_WEEK, "Calendar.DAY_OF_WEEK");
    }

    @Test
    public void testDayOfWeekInMonthConstant() {
        this.checkEquals(java.util.Calendar.DAY_OF_WEEK_IN_MONTH, Calendar.DAY_OF_WEEK_IN_MONTH, "Calendar.DAY_OF_WEEK_IN_MONTH");
    }

    @Test
    public void testAmConstant() {
        this.checkEquals(java.util.Calendar.AM, Calendar.AM, "Calendar.AM");
    }

    @Test
    public void testPmConstant() {
        this.checkEquals(java.util.Calendar.PM, Calendar.PM, "Calendar.PM");
    }

    @Test
    public void testAmpmConstant() {
        this.checkEquals(java.util.Calendar.AM_PM, Calendar.AM_PM, "Calendar.AM_PM");
    }

    @Test
    public void testHourConstant() {
        this.checkEquals(java.util.Calendar.HOUR, Calendar.HOUR, "Calendar.HOUR");
    }

    @Test
    public void testHourOfDayConstant() {
        this.checkEquals(java.util.Calendar.HOUR_OF_DAY, Calendar.HOUR_OF_DAY, "Calendar.HOUR_OF_DAY");
    }

    @Test
    public void testMinuteConstant() {
        this.checkEquals(java.util.Calendar.MINUTE, Calendar.MINUTE, "Calendar.MINUTE");
    }

    @Test
    public void testSecondConstant() {
        this.checkEquals(java.util.Calendar.SECOND, Calendar.SECOND, "Calendar.SECOND");
    }

    @Test
    public void testMillisecondsConstant() {
        this.checkEquals(java.util.Calendar.MILLISECOND, Calendar.MILLISECOND, "Calendar.MILLISECOND");
    }

    @Test
    public void testMondayConstant() {
        this.checkEquals(java.util.Calendar.MONDAY, Calendar.MONDAY, "Calendar.MONDAY");
    }

    @Test
    public void testTuesdayConstant() {
        this.checkEquals(java.util.Calendar.TUESDAY, Calendar.TUESDAY, "Calendar.TUESDAY");
    }

    @Test
    public void testWednesdayConstant() {
        this.checkEquals(java.util.Calendar.WEDNESDAY, Calendar.WEDNESDAY, "Calendar.WEDNESDAY");
    }

    @Test
    public void testThursdayConstant() {
        this.checkEquals(java.util.Calendar.THURSDAY, Calendar.THURSDAY, "Calendar.THURSDAY");
    }

    @Test
    public void testFridayConstant() {
        this.checkEquals(java.util.Calendar.FRIDAY, Calendar.FRIDAY, "Calendar.FRIDAY");
    }

    @Test
    public void testSaturdayConstant() {
        this.checkEquals(java.util.Calendar.SATURDAY, Calendar.SATURDAY, "Calendar.SATURDAY");
    }

    @Test
    public void testSundayConstant() {
        this.checkEquals(java.util.Calendar.SUNDAY, Calendar.SUNDAY, "Calendar.SUNDAY");
    }

    @Test
    public void testJanuaryConstant() {
        this.checkEquals(java.util.Calendar.JANUARY, Calendar.JANUARY, "Calendar.JANUARY");
    }

    @Test
    public void testFebruaryConstant() {
        this.checkEquals(java.util.Calendar.FEBRUARY, Calendar.FEBRUARY, "Calendar.FEBRUARY");
    }

    @Test
    public void testMarchConstant() {
        this.checkEquals(java.util.Calendar.MARCH, Calendar.MARCH, "Calendar.MARCH");
    }

    @Test
    public void testAprilConstant() {
        this.checkEquals(java.util.Calendar.APRIL, Calendar.APRIL, "Calendar.APRIL");
    }

    @Test
    public void testMayConstant() {
        this.checkEquals(java.util.Calendar.MAY, Calendar.MAY, "Calendar.MAY");
    }

    @Test
    public void testJuneConstant() {
        this.checkEquals(java.util.Calendar.JUNE, Calendar.JUNE, "Calendar.JUNE");
    }

    @Test
    public void testJulyConstant() {
        this.checkEquals(java.util.Calendar.JULY, Calendar.JULY, "Calendar.JULY");
    }

    @Test
    public void testAugustConstant() {
        this.checkEquals(java.util.Calendar.AUGUST, Calendar.AUGUST, "Calendar.AUGUST");
    }

    @Test
    public void testSeptemberConstant() {
        this.checkEquals(java.util.Calendar.SEPTEMBER, Calendar.SEPTEMBER, "Calendar.SEPTEMBER");
    }

    @Test
    public void testOctoberConstant() {
        this.checkEquals(java.util.Calendar.OCTOBER, Calendar.OCTOBER, "Calendar.OCTOBER");
    }

    @Test
    public void testNovemberConstant() {
        this.checkEquals(java.util.Calendar.NOVEMBER, Calendar.NOVEMBER, "Calendar.NOVEMBER");
    }

    @Test
    public void testDecemberConstant() {
        this.checkEquals(java.util.Calendar.DECEMBER, Calendar.DECEMBER, "Calendar.DECEMBER");
    }

    @Test
    public void testUndecemberConstant() {
        this.checkEquals(java.util.Calendar.UNDECIMBER, Calendar.UNDECIMBER, "Calendar.UNDECIMBER");
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
        this.checkEquals(emulated, emulated.clone());
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
        // this.checkEquals(double, double, so delta is present.
        assertEquals((double) jre.getTimeInMillis(), (double) emulated.getTimeInMillis(), MILLI_DELTA, "getTimeInMillis");
        assertEquals((double) jre.getTime().getTime(), (double) emulated.getTime().getTime(), MILLI_DELTA, "getTime");
        this.checkEquals(jre.getTimeZone(), emulated.getTimeZone(), "timeZone");

        this.checkYear(jre, emulated);
        this.checkMonth(jre, emulated);
        this.checkDayOfMonth(jre, emulated);
        this.checkDayOfWeek(jre, emulated);
        this.checkDayOfYear(jre, emulated);
        this.checkDayOfWeekInMonth(jre, emulated);

        this.checkEquals(jre.getFirstDayOfWeek(), emulated.getFirstDayOfWeek(), "getFirstDayOfWeek");
        this.checkEquals(jre.getMinimalDaysInFirstWeek(), emulated.getMinimalDaysInFirstWeek(), "getMinimalDaysInFirstWeek");
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
        this.checkEquals(jre.get(field),
                emulated.get(field),
                jre + " field=" + label);
    }

    // ClassTesting.....................................................................................................

    @Override
    public Class<GregorianCalendar> type() {
        return GregorianCalendar.class;
    }

    // ShadedClassTesting................................................................................................

    @Override
    public final Predicate<Method> requiredMethods() {
        return m -> {
            final boolean required;
            switch (m.getName()) {
                case "setFirstDayOfWeek":
                case "setMinimalDaysInFirstWeek":
                    required = false;
                    break;
                default:
                    required = true;
                    break;
            }
            return required;
        };
    }
}
