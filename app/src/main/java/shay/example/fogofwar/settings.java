package shay.example.fogofwar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class settings extends AppCompatActivity {
    public static boolean isMute;
    private ImageButton goBack;
private ImageButton IbtnMuteOnOff,IbtnContactMe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        insit();
        IbtnMuteOnOff.setOnClickListener(V ->changeMute());
        IbtnContactMe.setOnClickListener(V ->contactMe());
        goBack.setOnClickListener(V->goBackToMain());

    }
    private void insit()
    {
        IbtnMuteOnOff=findViewById(R.id.IbtnTextToSpeechOn_Off);
        IbtnContactMe=findViewById(R.id.Ib_ContactMe);
        goBack=findViewById(R.id.ImgBtnReturnSettings);
    }
    private void changeMute()
    {
     if (isMute)
     {

     }
     else
     {

     }
    }
    private void contactMe()
    {

    }
    private void goBackToMain()
    {
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}