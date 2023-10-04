/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                                CAMPUS LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                             DESARROLLO EN ANDROID "A"
:*
:*                   SEMESTRE: AGO-DIC/2023    HORA: 08-09 HRS
:*
:*             Activity que muestra la interfaz principal de la App IMC
:*
:*  Archivo     : MainActivity.java
:*  Autor       : Galván Gándara Tomás Alejandro    20130770
:*  Fecha       : 29/Sep/2023
:*  Compilador  : Android Studio Giraffe 2022.3.1
:*  Descripción : Esta clase despliega en pantalla un activity con cuadros de texto y botones
:*                que permiten realizar el cálculo del IMC siguiendo la fórmula correspondiente.
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*==========================================================================================
:*
:*------------------------------------------------------------------------------------------*/
package mx.edu.itl.u3imcapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
    }

    public void btnCalcularClick(View v) {
        TextView plainTextPeso = findViewById ( R.id.edtPeso );
        TextView plainTextEstatura = findViewById ( R.id.edtEstatura );

        String pesoStr = plainTextPeso.getText ().toString ();
        String estaturaStr = plainTextEstatura.getText().toString();

        float peso = Float.parseFloat ( pesoStr );
        float estatura = Float.parseFloat ( estaturaStr );

        // Calcula el IMC
        float imc = peso / ( estatura * estatura );

        // Evaluar el IMC y mostrar un mensaje en el AlertDialog
        String mensaje;
        if ( imc <= 15 ) {
            mensaje = "IMC: " + imc + "\nSu condición de salud es: Delgadez muy severa.";
        } else if ( imc >= 15 && imc <= 15.9 ) {
            mensaje = "IMC: " + imc + "\nSu condición de salud es: Delgadez severa.";
        } else if ( imc >= 16 && imc <= 18.4 ) {
            mensaje = "IMC: " + imc + "\nSu condición de salud es: Delgadez";
        } else if ( imc >= 18.5 && imc <= 24.9 ) {
            mensaje = "IMC: " + imc + "\nSu condición de salud es: Peso saludable";
        } else if  ( imc >= 25 && imc <= 29.9 ) {
            mensaje = "IMC: " + imc + "\nSu condición de salud es: Sobrepeso. ";
        } else if ( imc >= 30 && imc <= 34.9 ) {
            mensaje = "IMC: " + imc + "\nSu condición de salud es: Obesidad Moderada. ";
        } else if ( imc >= 35 && imc <= 39.9 ) {
            mensaje = "IMC: " + imc + "\nSu condición de salud es: Obesidad severa. ";
        } else if ( imc >= 40 ) {
            mensaje = "IMC: " + imc + "\nSu condición de salud es: Obesidad muy severa (mórbida). ";
        } else {
            mensaje = "Tu IMC no puede ser calculado según el criterio.";
        }

        // Mostar el AlertDialog
        AlertDialog.Builder builder = new AlertDialog.Builder ( this );
        builder.setTitle ( "IMCApp" )
                .setMessage ( mensaje )
                .setPositiveButton ( "Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick ( DialogInterface dialog, int which ) {
                        dialog.dismiss ();
                    }
                } )
                .create ()
                .show ();
    }

    // Método onClick para el botón Acerca de ...
    public void btnAcercaDeClick ( View v ) {
        Intent intent = new Intent ( this, AcercaDeActivity.class );
        startActivity ( intent );
    }

    // Método onClick para el botón Regresar en el Acerca de ...
    public void btnRegresarClick ( View v ) {
        Intent intent = new Intent ( this, MainActivity.class );
        startActivity (  intent );
    }

}