package com.example.user.customview;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by samsung on 2017-10-22.
 */

public class ObservableDTO<T> extends BaseObservable {

    T value;

    @Bindable
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
        notifyPropertyChanged(com.example.user.customview.BR.value);
    }


}
