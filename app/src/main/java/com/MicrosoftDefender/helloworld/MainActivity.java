package com.MicrosoftDefender.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

//@SuppressWarnings("PMD")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Hello world");

    }

    public void countUp(View v) {
        Log.i("message:", "In countUp method");
        int x = 0;
        while(true) {
            x++;
            Log.i("x =", "" + x);
            if (x == 3) {
                break;
            }
        }
        Toast.makeText(this, "Count UP button clicked", Toast.LENGTH_LONG).show();
        Log.i("message:", "Toast CountUp method");
    }


    public void someMethod(int variable) {
        switch (variable) {
            case 1:
                char ch = 'A';
                if (ch != -1) {
                    System.out.println("1");
                }

            case 2:
                System.out.println("2");
        }
        int ar[] = {1, 2, 3, 4, 5};
        //for (int i=0; i<=ar.length; i++)
        for (int i=0; i< ar.length; i++)
            System.out.println(ar[i]);
    }


}

