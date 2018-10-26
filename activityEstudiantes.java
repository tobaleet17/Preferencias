package prueba.prueba.crgomez.actividad3a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class activityEstudiantes extends AppCompatActivity {

    private MyDBAdapter dbAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estudiantes);

         dbAdapter = new MyDBAdapter(this);
         dbAdapter.open();
    }
}
