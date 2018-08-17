package com.example.nitishatal.registration;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity_A1_2016175 extends AppCompatActivity {
    public String pre="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second__a1_2016175);
        int duration = Toast.LENGTH_LONG;
        Context context = getApplicationContext();




        // Get the Intent that started this activity and extract the string



        if(pre.equals("")){


            Log.i("lifecycle","(Activity2)onCreate invoked");
            //Toast.makeText(this,"(Activity2)Oncreate Invoke",Toast.LENGTH_SHORT).show();
            Toast toast = Toast.makeText(context, "(Activity2)onCreate invoked", duration);
            toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 170);
            toast.show();
            pre="onCreate";


        }
        else{

            //Toast.makeText(this,pre+" to onCreate(Activity2)",Toast.LENGTH_SHORT).show();
            Toast toast = Toast.makeText(context, "pre+ to  OnCreate(Activity2)", duration);
            toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 170);
            toast.show();
            Log.i("lifecycle",pre+" to  OnCreate(Activity2)");
            pre="onCreate";

        }

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity_A1_2016175.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }


    @Override
    protected void onStart() {
        super.onStart();
        int duration = Toast.LENGTH_SHORT;
        Context context = getApplicationContext();

        // The activity is about to become visible.
        if(pre.equals("")){
            Log.i("lifecycle","(Activity2)onStart invoked");
            Toast toast = Toast.makeText(context, "(Activity2)onStart invoked", duration);
            toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 100);
            toast.show();
            pre="onStart";

        }else{
            Toast toast = Toast.makeText(context, pre+" to onStart(Activity2)", duration);
            toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 100);
            toast.show();
            Log.i("lifecycle",pre+" to onStart(Activity2)");
            pre="onStart";
        }
    }


    @Override
    protected void onResume() {
        super.onResume();
        int duration = Toast.LENGTH_SHORT;
        Context context = getApplicationContext();

        // The activity has become visible (it is now "resumed").
        if(pre.equals("")){

            Log.i("lifecycle","onResume invoked(Activity2)");
            Toast toast = Toast.makeText(context,"onResume invoked(Activity2)" , duration);
            toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
            toast.show();
            pre="onResume";

        }else{
            Toast toast = Toast.makeText(context, pre+" to OnResume(Activity2)", duration);
            toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
            toast.show();
            Log.i("lifecycle",pre+" to onResume(Activity2)");
            pre="onResume";
        }
    }
    @Override
    public void onPause() {
        super.onPause();
        int duration = Toast.LENGTH_SHORT;
        Context context = getApplicationContext();
        if(pre.equals("")){
            Log.i("lifecycle","onPause invoked(Activity2)");
            Toast toast = Toast.makeText(context, "onPause invoked(Activity2)", duration);
            toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 50);
            toast.show();
            pre="onPause";

        }else{
            Toast toast = Toast.makeText(context, pre+" to OnPause(Activity2)", duration);
            toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 50);
            toast.show();
            Log.i("lifecycle",pre+" to onPause(Activity2)");
            pre="onPause";
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        int duration = Toast.LENGTH_SHORT;
        Context context = getApplicationContext();
        super.onStop();
        // The activity is no longer visible (it is now "stopped")
        if(pre.equals("")){
            Log.i("lifecycle","onStop invoked(Activity2)");
            Toast toast = Toast.makeText(context,"onStop invoked(Activity2)" , duration);
            toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 200);
            toast.show();
            pre="onStop";

        }else{
            Toast toast = Toast.makeText(context, pre+" to OnStop(Activity2)", duration);
            toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 200);
            toast.show();
            Log.i("lifecycle",pre+" to onStop(Activity2)");
            pre="onStop";
        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        int duration = Toast.LENGTH_SHORT;
        Context context = getApplicationContext();
        super.onDestroy();
        // The activity is about to be destroyed.
        //Log.d("lifecycle","onResume invoked");
        if(pre.equals("")){
            Toast toast = Toast.makeText(context,"onDestroy invoked(Activity2)" , duration);
            toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 150);
            toast.show();
            Log.i("lifecycle","onDestroy invoked(Activity2)");
            pre="onDestroy";

        }else{
            Toast toast = Toast.makeText(context,pre+" to onDestroy(Activity2)" , duration);
            toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 150);
            toast.show();
            Log.i("lifecycle",pre+" to onDestroy(Activity2)");
            pre="onDestroy";
        }
    }

}
