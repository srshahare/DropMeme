package com.dropout.dropmeme.Interfaces;

public interface EditImageFragmentListener {

    void onBrightnessChanged(int brightness);
    void onSaturationChanged(float saturation);
    void onConstrantChanged(float constrant);
    void onEditStarted();
    void onEditCompleted();
}
