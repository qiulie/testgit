package com.example.testgit;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.os.Build;

public class MainActivity extends Activity {
	Button btnProduct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnProduct = (Button)findViewById(R.id.button1);
        
        btnProduct.setText("testgit");
        btnProduct.setOnClickListener(new OnClickListener()  
        {         
            public void onClick(View v)  
            {  
                Toast.makeText(MainActivity.this, "你点击了按钮1",Toast.LENGTH_LONG).show();  
                Toast.makeText(MainActivity.this, "你点击了按钮2",Toast.LENGTH_LONG).show();  
            }  
        });  
    }





}
