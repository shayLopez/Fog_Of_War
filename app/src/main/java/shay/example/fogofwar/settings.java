package shay.example.fogofwar;

import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class settings extends AppCompatActivity {
    public boolean isMute;
private ImageButton IbtnMuteOnOff,IbtnContactMe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        IbtnMuteOnOff.setOnClickListener(V ->changeMute());
        IbtnContactMe.setOnClickListener(V ->contactMe());

    }
    private void insit()
    {
        IbtnMuteOnOff=findViewById(R.id.IbtnTextToSpeechOn_Off);
        IbtnContactMe=findViewById(R.id.Ib_ContactMe);
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
}