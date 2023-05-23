
package com.action98.mssp.fuelgasapp;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNLiveManagerModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNLiveManagerModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNLiveManager";
  }
}