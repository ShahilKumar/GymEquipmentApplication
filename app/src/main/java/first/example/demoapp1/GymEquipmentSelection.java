package first.example.demoapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class GymEquipmentSelection extends AppCompatActivity {

    ListView itemList;
    String[] bodyParts = {"Chest" , "Bicepe" , "Shoulder" , "Tricepe" , "Leg" , "Back"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gym_equipment_selection);

        itemList =(ListView) findViewById(R.id.ListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,bodyParts);
        itemList.setAdapter(adapter);
        itemList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String bodyPart = bodyParts[position].toString();
                Intent intent = new Intent(GymEquipmentSelection.this,EquipmentDetails.class);
                intent.putExtra("bodyPart",bodyPart);
                startActivity(intent);
            }
        });
    }
}


