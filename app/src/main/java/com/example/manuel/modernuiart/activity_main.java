package com.example.manuel.modernuiart;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.SeekBar;


public class activity_main extends Activity {
    private SeekBar seekBar;
    private LinearLayout ll_green;
    private LinearLayout ll_light_green;
    private LinearLayout ll_pink;
    private LinearLayout ll_right_blue;
    private LinearLayout ll_left_blue;
    private LinearLayout ll_bottom_yellow;
    private LinearLayout ll_top_yellow;
    private LinearLayout ll_left_yellow;
    private LinearLayout ll_right_yellow;
    private LinearLayout ll_white;
    private LinearLayout ll_bottom_red;
    private LinearLayout ll_top_red;
    private LinearLayout ll_bottom_orange;
    private LinearLayout ll_right_orange;
    private LinearLayout ll_water;
    private int ll_green_color = 0xff14af37;
    private int ll_light_green_color = 0xff66ff00;
    private int ll_pink_color = 0xddf06cb7;
    private int ll_right_blue_color = 0xff2324d0;
    private int ll_left_blue_color = 0xff2324d0;
    private int ll_bottom_yellow_color = 0xe7f6f000;
    private int ll_top_yellow_color = 0xe7f6f000;
    private int ll_left_yellow_color = 0xe7f6f000;
    private int ll_right_yellow_color = 0xe7f6f000;
    private int ll_white_color = 0xffffffff;
    private int ll_bottom_red_color = 0xeee51309;
    private int ll_top_red_color = 0xeee51309;
    private int ll_bottom_orange_color = 0xffff942e;
    private int ll_right_orange_color = 0xffff942e;
    private int ll_water_color = 0xffaff7ff;
    private int seekR;
    private static int MAX = 200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_main);
        seekBar = (SeekBar) findViewById(R.id.seekBar);

        seekBar.setMax(MAX);
        ll_green = (LinearLayout) findViewById(R.id.ll_green);
        ll_light_green = (LinearLayout) findViewById(R.id.ll_light_green);
        ll_pink = (LinearLayout) findViewById(R.id.ll_pink);
        ll_right_blue = (LinearLayout) findViewById(R.id.ll_right_blue);
        ll_left_blue = (LinearLayout) findViewById(R.id.ll_left_blue);
        ll_bottom_yellow = (LinearLayout) findViewById(R.id.ll_bottom_yellow);
        ll_top_yellow = (LinearLayout) findViewById(R.id.ll_top_yellow);
        ll_left_yellow = (LinearLayout) findViewById(R.id.ll_left_yellow);
        ll_right_yellow = (LinearLayout) findViewById(R.id.ll_right_yellow);
        ll_white = (LinearLayout) findViewById(R.id.ll_white);
        ll_bottom_red = (LinearLayout) findViewById(R.id.ll_bottom_red);
        ll_top_red = (LinearLayout) findViewById(R.id.ll_top_red);
        ll_bottom_orange = (LinearLayout) findViewById(R.id.ll_bottom_orange);
        ll_right_orange = (LinearLayout) findViewById(R.id.ll_right_orange);
        ll_water = (LinearLayout) findViewById(R.id.ll_water);


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                seekR = seekBar.getProgress();

                ll_green.setBackgroundColor(ll_green_color + seekR * 0x10000 + seekR * 0x100 + seekR);
                ll_light_green.setBackgroundColor(ll_light_green_color + seekR / 2 * 0x10000 + seekR / 2 * 0x100 + seekR / 2);
                ll_pink.setBackgroundColor(ll_pink_color + seekR * 0x10000 + seekR * 0x100 + seekR);
                ll_right_blue.setBackgroundColor(ll_right_blue_color + seekR * 0x10000 + seekR * 0x100 + seekR);
                ll_left_blue.setBackgroundColor(ll_left_blue_color + seekR * 0x10000 + seekR * 0x100 + seekR);
                ll_bottom_yellow.setBackgroundColor(ll_bottom_yellow_color + seekR * 0x10000 + seekR * 0x100 + seekR);
                ll_top_yellow.setBackgroundColor(ll_top_yellow_color + seekR * 0x10000 + seekR * 0x100 + seekR);
                ll_left_yellow.setBackgroundColor(ll_left_yellow_color + seekR * 0x10000 + seekR * 0x100 + seekR);
                ll_right_yellow.setBackgroundColor(ll_right_yellow_color + seekR * 0x10000 + seekR * 0x100 + seekR);
                ll_white.setBackgroundColor(ll_white_color + seekR * 0x10000 + seekR * 0x100 + seekR);
                ll_bottom_red.setBackgroundColor(ll_bottom_red_color + seekR * 0x10000 + seekR * 0x100 + seekR);
                ll_top_red.setBackgroundColor(ll_top_red_color + seekR * 0x10000 + seekR * 0x100 + seekR);
                ll_bottom_orange.setBackgroundColor(ll_bottom_orange_color + seekR / 6 * 0x10000 + seekR / 4 * 0x100 + seekR / 2);
                ll_right_orange.setBackgroundColor(ll_right_orange_color + seekR / 6 * 0x10000 + seekR / 4 * 0x100 + seekR / 2);
                ll_water.setBackgroundColor(ll_water_color + seekR * 0x10000 + seekR * 0x100 + seekR);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_more_info) {
            showInfo();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void showInfo() {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity_main.this);
        builder.setMessage(R.string.info)
                .setNegativeButton("Not Now", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User cancelled the dialog
                    }
                }).setPositiveButton(R.string.urlMOMA, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.moma.org/"));
                startActivity(i);
            }
        })
        ;
        // Create the AlertDialog object and return it
        builder.show();

    }
}
