package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);


 LottieAnimationView animationView= (LottieAnimationView) findViewById(R.id.lottie);
      animationView.setAnimation("lottie_data_edit.json");
       animationView.loop(true);
    animationView.playAnimation();








  }
}
