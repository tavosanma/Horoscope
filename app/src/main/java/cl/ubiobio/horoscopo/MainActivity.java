package cl.ubiobio.horoscopo;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button buscar, fecha;
    EditText textfecha;
    private int dia, mes, ano;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fecha = (Button) findViewById(R.id.botonfecha);
        buscar = (Button) findViewById(R.id.botonbuscar);
        textfecha = (EditText) findViewById((R.id.textfecha));
        fecha.setOnClickListener(this);
        buscar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == fecha) {
            final Calendar calendar = Calendar.getInstance();
            dia = calendar.get(Calendar.DAY_OF_MONTH);
            mes = calendar.get(Calendar.MONTH);
            ano = calendar.get(Calendar.YEAR);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    textfecha.setText(dayOfMonth + "/" + (month+1) + "/" + year);

                }
            }, dia, mes, ano);
            datePickerDialog.show();
        } else if (v == buscar) {
            if (textfecha.getText().length() == 0) {
                Toast.makeText(this, "Ingrese su fecha de nacimiento", Toast.LENGTH_SHORT).show();


            }else {
                String textofecha = textfecha.getText().toString();
                String[] sintoken = textofecha.split("/");
                int diafecha = Integer.parseInt(sintoken[0]);
                int mesfecha = Integer.parseInt(sintoken[1]);
                if (mesfecha == 1) {
                    if (diafecha >= 20) {
                        Intent IntentLoadNewActivity = new Intent(MainActivity.this, acuario.class);
                        startActivity(IntentLoadNewActivity);
                    } else {
                        Intent IntentLoadNewActivity = new Intent(MainActivity.this, capricornio.class);
                        startActivity(IntentLoadNewActivity);

                    }
                }
                if (mesfecha == 2) {
                    if (diafecha >= 19) {
                        Intent IntentLoadNewActivity = new Intent(MainActivity.this, piscis.class);
                        startActivity(IntentLoadNewActivity);
                    } else {
                        if (diafecha < 19) {
                            Intent IntentLoadNewActivity = new Intent(MainActivity.this, acuario.class);
                            startActivity(IntentLoadNewActivity);
                        }
                    }
                }
                if (mesfecha == 3) {
                    if (diafecha >= 21) {
                        Intent IntentLoadNewActivity = new Intent(MainActivity.this, aries.class);
                        startActivity(IntentLoadNewActivity);
                    } else {
                        if (diafecha < 21) {
                            Intent IntentLoadNewActivity = new Intent(MainActivity.this, piscis.class);
                            startActivity(IntentLoadNewActivity);
                        }
                    }
                }
                if (mesfecha == 4) {
                    if (diafecha >= 20) {
                        Intent IntentLoadNewActivity = new Intent(MainActivity.this, tauro.class);
                        startActivity(IntentLoadNewActivity);
                    } else {
                        if (diafecha < 20) {
                            Intent IntentLoadNewActivity = new Intent(MainActivity.this, aries.class);
                            startActivity(IntentLoadNewActivity);
                        }
                    }
                }
                if (mesfecha == 5) {
                    if (diafecha >= 21) {
                        Intent IntentLoadNewActivity = new Intent(MainActivity.this, geminis.class);
                        startActivity(IntentLoadNewActivity);
                    } else {
                        if (diafecha < 21) {
                            Intent IntentLoadNewActivity = new Intent(MainActivity.this, tauro.class);
                            startActivity(IntentLoadNewActivity);
                        }
                    }
                }
                if (mesfecha == 6) {
                    if (diafecha >= 21) {
                        Intent IntentLoadNewActivity = new Intent(MainActivity.this, cancer.class);
                        startActivity(IntentLoadNewActivity);
                    } else {
                        if (diafecha < 21) {
                            Intent IntentLoadNewActivity = new Intent(MainActivity.this, geminis.class);
                            startActivity(IntentLoadNewActivity);
                        }
                    }
                }
                if (mesfecha == 7) {
                    if (diafecha >= 23) {
                        Intent IntentLoadNewActivity = new Intent(MainActivity.this, leo.class);
                        startActivity(IntentLoadNewActivity);
                    } else {
                        if (diafecha < 23) {
                            Intent IntentLoadNewActivity = new Intent(MainActivity.this, cancer.class);
                            startActivity(IntentLoadNewActivity);
                        }
                    }
                }
                if (mesfecha == 8) {
                    if (diafecha >= 23) {
                        Intent IntentLoadNewActivity = new Intent(MainActivity.this, virgo.class);
                        startActivity(IntentLoadNewActivity);
                    } else {
                        if (diafecha < 23) {
                            Intent IntentLoadNewActivity = new Intent(MainActivity.this, leo.class);
                            startActivity(IntentLoadNewActivity);
                        }
                    }
                }
                if (mesfecha == 9) {
                    if (diafecha >= 23) {
                        Intent IntentLoadNewActivity = new Intent(MainActivity.this, libra.class);
                        startActivity(IntentLoadNewActivity);
                    } else {
                        if (diafecha < 23) {
                            Intent IntentLoadNewActivity = new Intent(MainActivity.this, virgo.class);
                            startActivity(IntentLoadNewActivity);
                        }
                    }
                }
                if (mesfecha == 10) {
                    if (diafecha >= 23) {
                        Intent IntentLoadNewActivity = new Intent(MainActivity.this, escorpio.class);
                        startActivity(IntentLoadNewActivity);
                    } else {
                        if (diafecha < 23) {
                            Intent IntentLoadNewActivity = new Intent(MainActivity.this, libra.class);
                            startActivity(IntentLoadNewActivity);
                        }
                    }
                }
                if (mesfecha == 11) {
                    if (diafecha >= 22) {
                        Intent IntentLoadNewActivity = new Intent(MainActivity.this, sagitario.class);
                        startActivity(IntentLoadNewActivity);
                    } else {
                        if (diafecha < 22) {
                            Intent IntentLoadNewActivity = new Intent(MainActivity.this, escorpio.class);
                            startActivity(IntentLoadNewActivity);
                        }
                    }
                }
                if (mesfecha == 12) {
                    if (diafecha >= 22) {
                        Intent IntentLoadNewActivity = new Intent(MainActivity.this, capricornio.class);
                        startActivity(IntentLoadNewActivity);
                    } else {
                        if (diafecha < 22) {
                            Intent IntentLoadNewActivity = new Intent(MainActivity.this, sagitario.class);
                            startActivity(IntentLoadNewActivity);
                        }
                    }
                }
            }

        }
    }
}
