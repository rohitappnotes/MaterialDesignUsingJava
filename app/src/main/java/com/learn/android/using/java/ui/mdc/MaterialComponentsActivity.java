package com.learn.android.using.java.ui.mdc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.learn.android.using.java.databinding.ActivityMaterialComponentsBinding;

/**
 * Material Components (MDC) help developers implement Material Design. Created by a team of engineers
 * and UX designers at Google, MDC features dozens of beautiful and functional UI components and is
 * available for Android, iOS, web and Flutter.
 */
public class MaterialComponentsActivity extends AppCompatActivity {

    private static final String TAG = MaterialComponentsActivity.class.getSimpleName();

    private ActivityMaterialComponentsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMaterialComponentsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.textInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MaterialComponentsActivity.this, TextInputActivity.class);
                startActivity(intent);
            }
        });

        binding.exposedDropdownMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MaterialComponentsActivity.this, ExposedDropdownMenuActivity.class);
                startActivity(intent);
            }
        });

        binding.materialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MaterialComponentsActivity.this, MaterialButtonActivity.class);
                startActivity(intent);
            }
        });

        binding.floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MaterialComponentsActivity.this, FloatingActionButtonActivity.class);
                startActivity(intent);
            }
        });

        binding.materialRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MaterialComponentsActivity.this, MaterialRadioButtonActivity.class);
                startActivity(intent);
            }
        });

        binding.materialCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MaterialComponentsActivity.this, MaterialCheckBoxActivity.class);
                startActivity(intent);
            }
        });

        binding.switchMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MaterialComponentsActivity.this, SwitchMaterialActivity.class);
                startActivity(intent);
            }
        });

        binding.chip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MaterialComponentsActivity.this, ChipActivity.class);
                startActivity(intent);
            }
        });

        binding.materialCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MaterialComponentsActivity.this, MaterialCardViewActivity.class);
                startActivity(intent);
            }
        });

        binding.bottomNavigationView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MaterialComponentsActivity.this, BottomNavigationViewActivity.class);
                startActivity(intent);
            }
        });

        binding.bottomAppBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MaterialComponentsActivity.this, BottomAppBarActivity.class);
                startActivity(intent);
            }
        });

        binding.tabLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MaterialComponentsActivity.this, TabLayoutActivity.class);
                startActivity(intent);
            }
        });
    }
}