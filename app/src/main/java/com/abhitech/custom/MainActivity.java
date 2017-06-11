package com.abhitech.custom;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.net.Uri;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnItemClickListener
{
    /** Called when the activity is first created. */

    ListView lview;
    ListViewAdapter lviewAdapter;

    private final static String name[] = {"contact or visitJava CLICK","contact or visitGoogle CLICK","contact or visitFacebook CLICK","contact or visitAndroid CLICK","Sakib",
    };

    private final static String number[] = {"9988778877", "9988778874","9988778844",
            "7988778877","9968778877"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lview = (ListView) findViewById(R.id.listView2);
        lviewAdapter = new ListViewAdapter(this, name, number);

        System.out.println("adapter => "+lviewAdapter.getCount());

        lview.setAdapter(lviewAdapter);

        lview.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent in = new Intent(Intent.ACTION_VIEW);
                    in.setData(Uri.parse("http://www.javatpoint.com"));
                    startActivity(in);

                }
                if (position==1){
                    Intent in = new Intent(Intent.ACTION_VIEW);
                    in.setData(Uri.parse("http://www.google.com"));
                    startActivity(in);

                }
                if (position==2){
                    Intent in = new Intent(Intent.ACTION_VIEW);
                    in.setData(Uri.parse("http://www.facebook.com"));
                    startActivity(in);

                }
                if (position==3){
                    Intent in = new Intent(Intent.ACTION_VIEW);
                    in.setData(Uri.parse("http://www.android.com"));
                    startActivity(in);

                }






            }
        });

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}