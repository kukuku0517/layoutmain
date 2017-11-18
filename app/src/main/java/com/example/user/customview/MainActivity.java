package com.example.user.customview;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.support.annotation.IdRes;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.user.customview.databinding.ActivityMain2Binding;

import static android.R.attr.id;
import static com.example.user.customview.R.drawable.rec;

public class MainActivity extends AppCompatActivity implements MainHandler {

    ActivityMain2Binding binding;
    CardView cvMp3;


    static ObservableDTO<Integer> recogMode = new ObservableDTO<>();
    static ObservableDTO<Integer> sampleRate = new ObservableDTO<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        recogMode.setValue(0);
        sampleRate.setValue(0);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main2);

        binding.setRecogMode(recogMode);

        binding.setSamplerate(sampleRate);
        binding.setHandler(this);
        ((GradientDrawable) findViewById(R.id.tv_tag).getBackground()).setStroke(6, ContextCompat.getColor(this, R.color.red));
    }


    @BindingAdapter("recogMode")
    public static void onModeClick(CardView v, boolean isMode) {
        Log.d("mode", String.valueOf(isMode));
        if (isMode) {
            v.setSelected(true);
        } else {
            v.setSelected(false);
        }
    }

    @BindingAdapter("samplerate")
    public static void onSampleClick(CardView v, boolean isMode) {
        Log.d("mode", String.valueOf(isMode));
        if (isMode) {
            v.setSelected(true);
        } else {
            v.setSelected(false);
        }
    }

    @Override
    public void onClickMode(View v, int id) {
        recogMode.setValue(id);
    }

    @Override
    public void onClickSamplerate(View v, int rate) {
        sampleRate.setValue(rate);
    }
}
