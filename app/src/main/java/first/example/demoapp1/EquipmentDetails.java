package first.example.demoapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class EquipmentDetails extends AppCompatActivity {
    //TextView details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipment_details);
        TextView details = (TextView) findViewById(R.id.details);
        String bodyPart = getIntent().getStringExtra("bodyPart");
        details.setText(bodyPart);

        List<String> workoutList = WorkoutExpert.getWorkouts(bodyPart);
        StringBuilder workoutFormatted = new StringBuilder();
        for (String work: workoutList)
        {
            workoutFormatted.append(work).append("\n");
        }
        details.setText(workoutFormatted);

    }

}
