package br.com.jvictororiz.libs.ui.main.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import br.com.jvictororiz.libs.R;
import br.com.jvictororiz.libs.ui.main.dialogs.NubankBottomSheetDialog;

public class TelaNubankActivity extends AppCompatActivity {
    private NubankBottomSheetDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_nubank);

        dialog = new NubankBottomSheetDialog(this);
        dialog.show(this);
    }
}
