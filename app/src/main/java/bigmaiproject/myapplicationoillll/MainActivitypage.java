package bigmaiproject.myapplicationoillll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivitypage extends AppCompatActivity {
    TextView kk;
    String ss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitypage);
        kk = (TextView) findViewById(R.id.textView);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            ss = bundle.getString("ss");
            kk.setText(ss);

        }
    }
}
