package shay.example.fogofwar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Achievements extends AppCompatActivity {
    private ImageButton goBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievements);
        insit();
        goBack.setOnClickListener(V->returnToMain());

    }
    private void insit()
    {
        goBack=findViewById(R.id.ImgBtnReturnAchiv);
    }
    private void returnToMain()
    {
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}