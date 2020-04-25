package com.example.loginactivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
	Button b;
	EditText t1,t2;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        t1=(EditText) findViewById(R.id.editText1);
        t2=(EditText) findViewById(R.id.editText2);
        b=(Button) findViewById(R.id.button1);
        b.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String uid,pd;
				uid=t1.getText().toString();
				pd=t2.getText().toString();
				if(uid.equals("")&& pd.equals(""))
					Toast.makeText(getApplicationContext(), "not entered",50);
				else
				{
					if(uid.equals("smit")&& pd.equals("123"))
						Toast.makeText(getApplicationContext(), "login successful",50);
					else
						Toast.makeText(getApplicationContext(), "login successful",50);
				}
				
				
			}
		});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login, menu);
        return true;
    }
    
}
