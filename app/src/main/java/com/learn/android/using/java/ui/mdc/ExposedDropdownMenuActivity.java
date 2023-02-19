package com.learn.android.using.java.ui.mdc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import com.learn.android.using.java.R;

import com.learn.android.using.java.databinding.ActivityExposedDropdownMenuBinding;

import java.util.ArrayList;

public class ExposedDropdownMenuActivity extends AppCompatActivity {

    private ArrayList<Education> educationArrayList = new ArrayList<>();
    private ArrayList<String> educationStringArrayList = new ArrayList<>();

    private ActivityExposedDropdownMenuBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityExposedDropdownMenuBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        educationArrayList.clear();
        educationArrayList = getEducation();

        for (Education education : educationArrayList) {
            educationStringArrayList.add(education.getName());
        }
        ArrayAdapter<String> adapterResource = new ArrayAdapter<String>(ExposedDropdownMenuActivity.this, R.layout.item_education, getResources().getStringArray((R.array.color)));
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ExposedDropdownMenuActivity.this, R.layout.item_education, educationStringArrayList);
        binding.appCompatAutoCompleteTextView.setAdapter(adapterResource);
        binding.educationTextInputEditText.setAdapter(adapter);

        binding.educationTextInputEditText.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String education = educationStringArrayList.get(position);
            }
        });


        String[] type = new String[] {"Bed-sitter", "Single", "1- Bedroom", "2- Bedroom","3- Bedroom"};

        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<>(
                        this,
                        R.layout.dropdown_item,
                        type);

        binding.educationTextInputEditText.setAdapter(arrayAdapter);

        binding.educationTextInputEditText.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

    public ArrayList<Education> getEducation() {
        ArrayList<Education> educationArrayList = new ArrayList<>();
        educationArrayList.add(new Education("1", "Class 8"));
        educationArrayList.add(new Education("2", "Class 9"));
        educationArrayList.add(new Education("3", "Class 10"));
        educationArrayList.add(new Education("4", "Class 11"));
        educationArrayList.add(new Education("5", "Class 12"));
        return educationArrayList;
    }
}