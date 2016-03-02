package cr.ac.itcr.shopadvisor;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private Button btnLogin;
    private EditText txtEmail;
    private EditText txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = (Button)findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtEmail = (EditText)findViewById(R.id.txtEmail);
                txtPassword = (EditText)findViewById(R.id.txtPassword);

                if(txtEmail.getText().toString().equals("test@test.com") && txtPassword.getText().toString().equals("12345")){
                    Intent i = new Intent(getApplicationContext(),DashboardActivity.class);
                    startActivity(i);
                }
                else{
                    Toast mensaje_error =Toast.makeText(getApplicationContext(), "Usuario Inválido", Toast.LENGTH_SHORT);
                    mensaje_error.show();

                }

            }
        });
    }

}
