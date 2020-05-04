package com.example.myapplication.basement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Splash extends AppCompatActivity {

public static final String TAG = "MainActivity";

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);
        }

@OnClick(R.id.landing_btn_sign_up)
public void onSignUpButtonClick() {
        Intent toSignUp = new Intent(Splash.this, CreateAccount.class);
        startActivity(toSignUp);
        }

@OnClick(R.id.landing_btn_login)
public void onLoginButtonClick() {
        Intent toSignUp = new Intent(Splash.this, Login.class);
        startActivity(toSignUp);
        }
        }