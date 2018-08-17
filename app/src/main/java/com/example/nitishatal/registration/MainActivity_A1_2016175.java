package com.example.nitishatal.registration;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity_A1_2016175 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    public String pre="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__a1_2016175);


        int duration = Toast.LENGTH_LONG;
        Context context = getApplicationContext();


        if (pre.equals("")) {


            Log.i("lifecycle", "(MainActivity)Oncreate Invoke");
            Toast toast = Toast.makeText(context, "(MainActivity)onCreate invoked", duration);
            toast.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
            //Toast.makeText(,"(MainActivity)Oncreate Invoke",Toast.LENGTH_SHORT).show();
            toast.show();
            pre = "onCreate";


        } else {
            Toast toast = Toast.makeText(context, pre + " to  OnCreate(MainActivity)", duration);
            toast.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
            toast.show();
            //Toast.makeText(this,pre+" to onCreate(MainActivity)",Toast.LENGTH_SHORT).show();
            Log.i("lifecycle", pre + " to  OnCreate(MainActivity)");
            pre = "onCreate";

        }
        Button Clear=(Button) findViewById(R.id.Clear);
        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText roll= (EditText) findViewById(R.id.roll);
                EditText name= (EditText) findViewById(R.id.Name);
                EditText branch= (EditText) findViewById(R.id.Branch);
                EditText c1= (EditText) findViewById(R.id.c1);
                EditText c2= (EditText) findViewById(R.id.c2);
                EditText c3= (EditText) findViewById(R.id.c3);
                EditText c4= (EditText) findViewById(R.id.c4);

                roll.setText("");
                name.setText("");
                branch.setText("");
                c1.setText("");
                c2.setText("");
                c3.setText("");
                c4.setText("");

            }
        });


    }


    @Override
    protected void onStart() {
        int duration = Toast.LENGTH_SHORT;
        Context context = getApplicationContext();
        super.onStart();
        // The activity is about to become visible.
        if(pre.equals("")){
            Log.i("lifecycle","onStart invoked(MainActivity)");
            Toast toast = Toast.makeText(context, "onStart invoked(MainActivity)", duration);
            toast.setGravity(Gravity.TOP|Gravity.TOP, 0, 0);
            toast.show();
            pre="onStart";

        }else{
            Toast toast = Toast.makeText(context, pre+" to onStart(MainActivity)", duration);
            toast.setGravity(Gravity.TOP|Gravity.TOP, 0, 0);
            toast.show();
            Log.i("lifecycle",pre+" to onStart(MainActivity)");
            pre="onStart";
        }
    }


    @Override
    protected void onResume() {
        int duration = Toast.LENGTH_SHORT;
        Context context = getApplicationContext();
        super.onResume();
        // The activity has become visible (it is now "resumed").
        if(pre.equals("")){

            Log.i("lifecycle","onResume invoked(MainActivity)");

            Toast toast = Toast.makeText(context,"onResume invoked(MainActivity)" , duration);
            toast.setGravity(Gravity.TOP|Gravity.CENTER, 0, 100);
            toast.show();
            pre="onResume";

        }else{
            Toast toast = Toast.makeText(context, pre+" to OnResume(MainActivity)", duration);
            toast.setGravity(Gravity.TOP|Gravity.CENTER, 0, 100);
            toast.show();
            Log.i("lifecycle",pre+" to onResume(MainActivity)");
            pre="onResume";
        }
    }
    @Override
    public void onPause() {
        super.onPause();
        int duration = Toast.LENGTH_SHORT;
        Context context = getApplicationContext();
        if(pre.equals("")){
            Log.i("lifecycle","onPause invoked(MainActivity)");
            Toast toast = Toast.makeText(context, "onPause invoked(MainActivity)", duration);
            toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 75);
            toast.show();
            pre="onRestart";

        }else{
            Toast toast = Toast.makeText(context, pre+" to OnPause(MainActivity)", duration);
            toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 75);
            toast.show();
            Log.i("lifecycle",pre+" to onPause(MainActivity)");
            pre="onPause";
        }
    }

    @Override
    protected void onStop() {
        int duration = Toast.LENGTH_SHORT;
        Context context = getApplicationContext();
        super.onStop();
        // The activity is no longer visible (it is now "stopped")
        if(pre.equals("")){
            Log.i("lifecycle","onStop invoked(MainActivity)");
            Toast toast = Toast.makeText(context,"onStop invoked(MainActivity)" , duration);
            toast.setGravity(Gravity.TOP|Gravity.CENTER, 0, 200);
            toast.show();
            pre="onStop";

        }else{
            Toast toast = Toast.makeText(context, pre+" to OnStop(MainActivity)", duration);
            toast.setGravity(Gravity.TOP|Gravity.CENTER, 0, 200);
            toast.show();
            Log.i("lifecycle",pre+" to onStop(MainActivity)");
            pre="onStop";
        }
    }


    @Override
    protected void onDestroy() {
        int duration = Toast.LENGTH_SHORT;
        Context context = getApplicationContext();
        super.onDestroy();
        // The activity is about to be destroyed.
        //Log.d("lifecycle","onResume invoked");
        if(pre.equals("")){
            Toast toast = Toast.makeText(context,"onDestroy invoked(MainActivity)" , duration);
            toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 0);
            toast.show();
            Log.i("lifecycle","onDestroy invoked(MainActivity)");
            pre="onDestroy";

        }else{
            Toast toast = Toast.makeText(context,pre+" to onDestroy(MainActivity)" , duration);
            toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 0);
            toast.show();
            Log.i("lifecycle",pre+" to onDestroy(MainActivity)");
            pre="onDestroy";
        }
    }




    public void sendMessage(View view) {
        Intent intent = new Intent(this, SecondActivity_A1_2016175.class);
        EditText roll = (EditText) findViewById(R.id.roll);
        EditText name = (EditText) findViewById(R.id.Name);
        EditText branch = (EditText) findViewById(R.id.Branch);
        EditText c1 = (EditText) findViewById(R.id.c1);
        EditText c2 = (EditText) findViewById(R.id.c2);
        EditText c3 = (EditText) findViewById(R.id.c3);
        EditText c4 = (EditText) findViewById(R.id.c4);

        String a1 = name.getText().toString();
        String a2 = roll.getText().toString();
        String a3 = branch.getText().toString();
        String a4 = c1.getText().toString();
        String a5 = c2.getText().toString();
        String a6 = c3.getText().toString();
        String a7 = c4.getText().toString();

        String output = "Name : " + a1 + System.getProperty("line.separator") + "Roll No. : " + a2 + System.getProperty("line.separator") + "Branch : " + a3 +
                System.getProperty("line.separator") + "Course 1 : " + a4 + System.getProperty("line.separator") + "Course 2 : " + a5 + System.getProperty("line.separator")
                + "Course 3 : " + a6 + System.getProperty("line.separator") + "Course 4 : " + a7 + System.getProperty("line.separator");

        intent.putExtra(EXTRA_MESSAGE, output);
        startActivity(intent);
    }







}
