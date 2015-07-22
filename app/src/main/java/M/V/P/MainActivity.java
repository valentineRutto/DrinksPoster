package M.V.P;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends  Activity {
public static Button btn_fb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClickButtonListener ();
    }
public void  OnClickButtonListener(){
        btn_fb=(Button)findViewById(R.id.fb);
    btn_fb.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent oneactivity=new Intent("M.V.P.oneActivity");
                    startActivity(oneactivity);
                }
            }
    );

    }
    }

