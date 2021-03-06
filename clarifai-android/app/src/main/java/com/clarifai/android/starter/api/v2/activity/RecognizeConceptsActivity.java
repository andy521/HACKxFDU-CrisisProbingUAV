package com.clarifai.android.starter.api.v2.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.clarifai.android.starter.api.v2.App;
import com.clarifai.android.starter.api.v2.R;
import com.clarifai.android.starter.api.v2.RecognizeView;

import butterknife.ButterKnife;
import clarifai2.dto.prediction.Concept;

public class RecognizeConceptsActivity extends BaseActivity {

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ButterKnife.<RecognizeView<Concept>>findById(this, R.id.content_root)
        .setModel(App.get().clarifaiClient().getDefaultModels().generalModel());
  }

  @Override
  protected int layoutRes() {
    return R.layout.activity_recognize;
  }
}
