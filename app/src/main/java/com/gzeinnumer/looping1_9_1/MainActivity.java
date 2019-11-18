package com.gzeinnumer.looping1_9_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(int k=10; k>=1; k--){
            for(int i=1; i<=k; i++){
                System.out.println(i);
            }
            for(int i=k-1; i>=1; i--){
                System.out.println(i);
            }
            System.out.print("\n");
        }
    }
}
