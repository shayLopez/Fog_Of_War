package shay.example.fogofwar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GameSettings extends AppCompatActivity {
    private ImageButton ImgBtnGoBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_settings);
        insit();
        ImgBtnGoBack.setOnClickListener(V->goBackToMain());

    }
    private void insit()
    {
        ImgBtnGoBack=findViewById(R.id.ImgBtnReturnGameSettings);
    }
    private void goBackToMain()
    {
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}