package shay.example.fogofwar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
private ImageButton settings;
private Button BtnPlay,BtnHistory,BtnAchiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        insit();
        settings.setOnClickListener(V ->goToSettings());
        BtnPlay.setOnClickListener(V ->goToPlay());
        BtnAchiv.setOnClickListener(V ->goToAciv());
        BtnHistory.setOnClickListener(V ->goToHistory());
    }
    private void insit()
    {
        settings=findViewById(R.id.IbtnSettings);
        BtnPlay=findViewById(R.id.Btn_play);
        BtnHistory=findViewById(R.id.Btn_History);
        BtnAchiv=findViewById(R.id.Btn_Achiv);
    }
    private void goToSettings()
    {
        Intent intent =new Intent(this, settings.class);
        startActivity(intent);
    }
    private void  goToPlay()
    {
        Intent intent =new Intent(this, GameSettings.class);
        startActivity(intent);
    }
    private void goToAciv()
    {
        Intent intent =new Intent(this, Achievements.class);
        startActivity(intent);
    }
    private void goToHistory()
    {
        Intent intent =new Intent(this, History.class);
        startActivity(intent);
    }
}