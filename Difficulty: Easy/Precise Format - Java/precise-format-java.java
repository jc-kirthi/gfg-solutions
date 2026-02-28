import java.util.ArrayList;

class Solution {
    // Function to return an ArrayList with exact result and formatted result
    static ArrayList<Float> divisionWithPrecision(float a, float b) {
        ArrayList<Float> result = new ArrayList<>();
        float exact = a / b;
        float rounded = Math.round(exact * 1000f) / 1000f; // round to 3 decimal places
        result.add(exact);
        result.add(rounded);
        return result;
    }
}