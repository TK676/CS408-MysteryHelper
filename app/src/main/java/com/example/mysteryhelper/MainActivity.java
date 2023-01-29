package com.example.mysteryhelper;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;

import com.example.mysteryhelper.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    MysteryHelper mysteryhelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        mysteryhelper = new MysteryHelper(getResources().getStringArray(R.array.fragments));
    }

    //Shows a different text fragment every time the button is pressed
    public void onClick(View view) {
        binding.bodyText.setText(mysteryhelper.getRandText());
    }
}