package ma.ensa.list;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String nom = extras.getString("pizza_nom");
            int imageResource = extras.getInt("pizza_image");
            String description = extras.getString("pizza_description");
            String preparation = extras.getString("pizza_preparation");


            TextView nomTextView = findViewById(R.id.nom_pizza);
            ImageView imageImageView = findViewById(R.id.image_pizza);
            TextView descriptionTextView = findViewById(R.id.description_pizza);
            TextView preparationTextView = findViewById(R.id.preparation_pizza);

            nomTextView.setText(nom);
            imageImageView.setImageResource(imageResource);
            descriptionTextView.setText(description);
            preparationTextView.setText(preparation);
        }
    }
}
