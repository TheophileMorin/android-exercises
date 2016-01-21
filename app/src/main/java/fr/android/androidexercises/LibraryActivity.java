package fr.android.androidexercises;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        // TODO Get image view and load image form URL
        // http://img3.wikia.nocookie.net/__cb20120317101541/harrypotter/images/3/37/Gryffindor_Crest.jpg
        ImageView dllImg = (ImageView) findViewById(R.id.downloadImageView);

        Picasso.with(this)
                .load("http://img3.wikia.nocookie.net/__cb20120317101541/harrypotter/images/3/37/Gryffindor_Crest.jpg")
                .into(dllImg);
    }

}
