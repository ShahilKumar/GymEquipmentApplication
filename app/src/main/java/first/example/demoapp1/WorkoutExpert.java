package first.example.demoapp1;

import java.util.ArrayList;
import java.util.List;

public class WorkoutExpert {
    static List<String> getWorkouts(String workoutType) {
        List<String> workout = new ArrayList<String>();
        if(workoutType.equals("Chest")) {
            workout.add("1. Bench Press");
            workout.add("2. Cable fire");
            workout.add("3. Pec Deck");
        }

        else if(workoutType.equals("Bicepe")) {
            workout.add("1. Bicepe Curls");
            workout.add("2. Incline Dumbbell Hammer Curl");
            workout.add("3. EZ bar curl");
        }

        else if(workoutType.equals("Shoulder")) {
            workout.add("1. Shoulder Press");
            workout.add("2. Barbell Overhead Shoulder Press");
            workout.add("3. Seated Dumbbell Shoulder Press");
        }

        else if(workoutType.equals("Tricepe")) {
            workout.add("1. Tricepe Pushdown");
            workout.add("2. Cable Rope Extension");
            workout.add("3. Dip Machine");
        }

        else if(workoutType.equals("Back")) {
            workout.add("1. Lateral Pull-Down Machine");
            workout.add("2. An Exercise Ball");
            workout.add("3. Kinesthetics");
        }

        else if(workoutType.equals("Leg")) {
            workout.add("1. FLP Fusion Leg Press");
            workout.add("2. Leg Ext Curl Machine");
            workout.add("3. Leg & Calf Press Machine");
        }

        return workout;
    }
}
