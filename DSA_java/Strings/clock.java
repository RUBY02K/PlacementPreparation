
class Solution {
    public double angleClock(int hour, int minutes) {

        // Minute hand moves 6 degrees per minute
        double minuteAngle = minutes * 6;

        // Hour hand moves 30 degrees per hour
        // and 0.5 degrees per minute
        double hourAngle = (hour % 12) * 30 + minutes * 0.5;

        // Difference between both hands
        double diff = Math.abs(hourAngle - minuteAngle);

        // Return smaller angle
        return Math.min(diff, 360 - diff);
    }
}