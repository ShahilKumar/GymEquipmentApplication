package first.example.demoapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button loginButton,cancelButton;
    EditText name,pswd;

    TextView attemptLeft;
    int counter = 3;
    //private Object Credentials;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void onClick(View v) {
        loginButton = (Button)findViewById(R.id.loginButton);
        name = (EditText)findViewById(R.id.name);
        pswd = (EditText)findViewById(R.id.password);

        cancelButton = (Button)findViewById(R.id.cancelButton);
        attemptLeft = (TextView)findViewById(R.id.attemptLeft);
        attemptLeft.setVisibility(View.GONE);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(name.getText().toString().equals("admin") &&
                        pswd.getText().toString().equals("admin")) {

                    Intent i = new Intent(getApplicationContext(),GymEquipmentSelection.class);
                    startActivity(i);

                }
                else{
                    Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();

                    attemptLeft.setVisibility(View.VISIBLE);
                    attemptLeft.setBackgroundColor(Color.RED);
                    counter--;
                    attemptLeft.setText(Integer.toString(counter));

                    if (counter == 0) {
                        loginButton.setEnabled(false);
                    }
                }
            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }

}
