package com.rdtl.job.chakri.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView ivDetails;
    TextView tvName, tvDetails;

    String s1[], s2[];
    int images[] = {R.drawable.img_one, R.drawable.img_two, R.drawable.img_three,
            R.drawable.img_four, R.drawable.img_five, R.drawable.img_six, R.drawable.img_seven,
            R.drawable.img_eight, R.drawable.img_nine, R.drawable.img_ten, R.drawable.img_eleven,
            R.drawable.img_twelve, R.drawable.img_thirty, R.drawable.img_forty, R.drawable.img_fifty,
            R.drawable.img_sixty, R.drawable.img_seventy, R.drawable.img_eighty};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ivDetails = findViewById(R.id.idMainImg);
        tvName = findViewById(R.id.idTitle);
        tvDetails = findViewById(R.id.idDescrip);

        Intent intent = getIntent();
        String easyPuzzle = intent.getExtras().getString("epuzzle");

        s1 = getResources().getStringArray(R.array.product_two_list);
        s2 = getResources().getStringArray(R.array.product_two_des);

        ivDetails.setImageResource(images[Integer.parseInt(easyPuzzle)]);
        tvName.setText(s1[Integer.parseInt(easyPuzzle)]);
        tvDetails.setText(s2[Integer.parseInt(easyPuzzle)]);
    }
}