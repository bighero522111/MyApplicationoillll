package bigmaiproject.myapplicationoillll;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivityoillllllll extends AppCompatActivity {
    EditText ll;
    Button ee;
    String ss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityoillllllll);
        ll = (EditText) findViewById(R.id.editText);
        ee = (Button) findViewById(R.id.button);

        ee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ss = ll.getText().toString();
                if(!ss.isEmpty()){
                    Intent intent = new Intent(MainActivityoillllllll.this,MainActivitypage.class);
                    intent.putExtra("ss",ss);
                    startActivity(intent);
                }
            }
        });
    }
}
