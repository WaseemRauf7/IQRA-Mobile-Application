// ALGORITHM NUMBER 1 SOURCE CODE (Braille Letter Tutor)

package com.example.waseemrauf.mysimpleapplication3;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener{

     Button btn1,btn2,btn3,btn4,btn5,btn6;
     GestureDetector gestureDetector;
     boolean check1,check2,check3,check4,check5,check6;
     MediaPlayer mp1,mp2,mp3,mp4,mp5,mp6,mp7,mp8,mp9,mp10,mp11,mp12,mp13,mp14,mp15,mp16,mp17,mp18,mp19,mp20,mp21,mp22,mp23,mp24,mp25,mp26,mp27,mp28,mp29;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        check1=false;
        check2=false;
        check3=false;
        check4=false;
        check5=false;
        check6=false;
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        // Instantiate the gesture detector with the
        // application context and an implementation of
        // GestureDetector.OnGestureListener
        gestureDetector = new GestureDetector(this,this);
        // Set the gesture detector as the double tap
        // listener.
        gestureDetector.setOnDoubleTapListener(this);


        mp1 = MediaPlayer.create(this,R.raw.alif);
        mp2 = MediaPlayer.create(this,R.raw.baa);
        mp3 = MediaPlayer.create(this,R.raw.taa);
        mp4 = MediaPlayer.create(this,R.raw.saa);
        mp5 = MediaPlayer.create(this,R.raw.jeem);
        mp6 = MediaPlayer.create(this,R.raw.haa);
        mp7 = MediaPlayer.create(this,R.raw.khaa);
        mp8 = MediaPlayer.create(this,R.raw.daal);
        mp9 = MediaPlayer.create(this,R.raw.zaad);
        mp10 = MediaPlayer.create(this,R.raw.raa);
        mp11 = MediaPlayer.create(this,R.raw.zay);
        mp12 = MediaPlayer.create(this,R.raw.seen);
        mp13 = MediaPlayer.create(this,R.raw.sheen);
        mp14 = MediaPlayer.create(this,R.raw.saad);
        mp15 = MediaPlayer.create(this,R.raw.zaad);
        mp16 = MediaPlayer.create(this,R.raw.twa);
        mp17 = MediaPlayer.create(this,R.raw.zwa);
        mp18 = MediaPlayer.create(this,R.raw.ayn);
        mp19 = MediaPlayer.create(this,R.raw.ghayn);
        mp20 = MediaPlayer.create(this,R.raw.faa);
        mp21 = MediaPlayer.create(this,R.raw.qaaf);
        mp22 = MediaPlayer.create(this,R.raw.kaaf);
        mp23 = MediaPlayer.create(this,R.raw.laam);
        mp24 = MediaPlayer.create(this,R.raw.meem);
        mp25 = MediaPlayer.create(this,R.raw.noon);
        mp26 = MediaPlayer.create(this,R.raw.haaa);
        mp27 = MediaPlayer.create(this,R.raw.waaw);
        mp28 = MediaPlayer.create(this,R.raw.yaa);
        mp29 = MediaPlayer.create(this,R.raw.wrong);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            btn1.setBackgroundResource(R.drawable.background_button);
                check1=true;
                 Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                 vibrator.vibrate(200);
     //           mp1.start();

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2.setBackgroundResource(R.drawable.background_button);
                check2=true;
                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(200);
   //     mp2.start();

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn3.setBackgroundResource(R.drawable.background_button);
                check3=true;
               Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(200);
      //      mp3.start();

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn4.setBackgroundResource(R.drawable.background_button);
                check4=true;
                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(200);
      //      mp4.start();

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn5.setBackgroundResource(R.drawable.background_button);
                check5=true;
                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(200);
      //            mp5.start();

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                btn6.setBackgroundResource(R.drawable.background_button);
                check6=true;
                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(200);
      //      mp6.start();

            }
        });
    }

    public void press() {
    if((check1==true) && (check2==false) && (check3==false) && (check4==false) && (check5==false) && (check6==false) ){
      mp1.start();
    }
    else if((check1==true) && (check2==true) && (check3==false) && (check4==false) && (check5==false) && (check6==false) ){
        mp2.start();
    }
    else if((check1==false) && (check2==true) && (check3==true) && (check4==true) && (check5==true) && (check6==false) ){
        mp3.start();
    }
    else if((check1==true) && (check2==false) && (check3==false) && (check4==true) && (check5==true) && (check6==true) ){
        mp4.start();
    }
    else if((check1==false) && (check2==true) && (check3==false) && (check4==true) && (check5==true) && (check6==false) ){
        mp5.start();
    }
    else if((check1==true) && (check2==false) && (check3==false) && (check4==false) && (check5==true) && (check6==true) ){
        mp6.start();
    }
    else if((check1==true) && (check2==false) && (check3==true) && (check4==true) && (check5==false) && (check6==true) ){
        mp7.start();
    }
    else if((check1==true) && (check2==false) && (check3==false) && (check4==true) && (check5==true) && (check6==false) ){
        mp8.start();
    }
    else if((check1==false) && (check2==true) && (check3==true) && (check4==true) && (check5==false) && (check6==true) ){
        mp9.start();
    }
    else if((check1==true) && (check2==true) && (check3==true) && (check4==false) && (check5==true) && (check6==false) ){
        mp10.start();
    }
    else if((check1==true) && (check2==false) && (check3==true) && (check4==false) && (check5==true) && (check6==true) ){
        mp11.start();
    }
    else if((check1==false) && (check2==true) && (check3==true) && (check4==true) && (check5==false) && (check6==false) ){
        mp12.start();
    }
    else if((check1==true) && (check2==false) && (check3==false) && (check4==true) && (check5==false) && (check6==true) ){
        mp13.start();
    }
    else if((check1==true) && (check2==true) && (check3==true) && (check4==true) && (check5==false) && (check6==true) ){
        mp14.start();
    }
    else if((check1==true) && (check2==true) && (check3==false) && (check4==true) && (check5==false) && (check6==true) ){
        mp15.start();
    }
    else if((check1==false) && (check2==true) && (check3==true) && (check4==true) && (check5==true) && (check6==true) ){
        mp16.start();
    }
    else if((check1==true) && (check2==true) && (check3==true) && (check4==true) && (check5==true) && (check6==true) ){
        mp17.start();
    }
    else if((check1==true) && (check2==true) && (check3==true) && (check4==false) && (check5==true) && (check6==true) ){
        mp18.start();
    }
    else if((check1==true) && (check2==true) && (check3==false) && (check4==false) && (check5==false) && (check6==true) ){
        mp19.start();
    }
    else if((check1==true) && (check2==true) && (check3==false) && (check4==true) && (check5==false) && (check6==false) ){
        mp20.start();
    }
    else if((check1==true) && (check2==true) && (check3==true) && (check4==true) && (check5==true) && (check6==false) ){
        mp21.start();
    }
    else if((check1==true) && (check2==false) && (check3==true) && (check4==false) && (check5==false) && (check6==false) ){
        mp22.start();
    }
    else if((check1==true) && (check2==true) && (check3==true) && (check4==false) && (check5==false) && (check6==false) ){
        mp23.start();
    }
    else if((check1==true) && (check2==false) && (check3==true) && (check4==true) && (check5==false) && (check6==false) ){
        mp24.start();
    }
    else if((check1==true) && (check2==false) && (check3==true) && (check4==true) && (check5==true) && (check6==false) ){
        mp25.start();
    }
    else if((check1==true) && (check2==true) && (check3==false) && (check4==false) && (check5==true) && (check6==false) ){
        mp26.start();
    }
    else if((check1==false) && (check2==true) && (check3==false) && (check4==true) && (check5==true) && (check6==true) ){
        mp27.start();
    }
    else if((check1==false) && (check2==true) && (check3==false) && (check4==true) && (check5==false) && (check6==false) ){
        mp28.start();
    }
   else{
       mp29.start();
    }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        // Be sure to call the superclass implementation
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {

        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        //mp1.start();
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
            press();
        Intent i = new Intent(this, MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP| Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }
}
