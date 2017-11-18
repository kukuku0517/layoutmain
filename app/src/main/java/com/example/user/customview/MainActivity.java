package com.example.user.customview;

import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.support.annotation.IdRes;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
//        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//
//            @Override
//            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int id) {
//                RadioButton checkedRadioButton = (RadioButton) radioGroup.findViewById(id);
//                View radioButton = radioGroup.findViewById(id);
//                int idx = radioGroup.indexOfChild(radioButton);
//
//                for (int i = 0; i < radioGroup.getChildCount(); i++) {
//                    if (i == idx) {
//
//                        TransitionDrawable transition = (TransitionDrawable) radioGroup.getChildAt(i).getBackground();
//                        transition.startTransition(500);
//
//                    } else {
//                        TransitionDrawable transition = (TransitionDrawable) radioGroup.getChildAt(i).getBackground();
//                        transition.resetTransition();
//                    }
//                }
//            }
//        });

        ((GradientDrawable)findViewById(R.id.tv_tag).getBackground()).setStroke(6,ContextCompat.getColor(this,R.color.red));
    }

    public void onClick(View v) {
        v.setSelected(!v.isSelected());
    }
}
