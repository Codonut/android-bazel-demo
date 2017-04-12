package com.codonut.android.example;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public final class DemoActivity extends Activity {
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Toast.makeText(this, "Hello, World!", Toast.LENGTH_SHORT).show();
  }
}
