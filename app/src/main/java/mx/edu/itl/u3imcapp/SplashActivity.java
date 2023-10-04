/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                                CAMPUS LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                             DESARROLLO EN ANDROID "A"
:*
:*                   SEMESTRE: AGO-DIC/2023    HORA: 08-09 HRS
:*
:*             Activity que muestra una pantalla de carga por 2 segundos
:*
:*  Archivo     : MainActivity.java
:*  Autor       : Galván Gándara Tomás Alejandro    20130770
:*  Fecha       : 29/Sep/2023
:*  Compilador  : Android Studio Giraffe 2022.3.1
:*  Descripción : Este Activity muestra en la pantalla un Splash (pantalla de carga) de la app
:*                la cual contiene su logotipo y un Spinner en la parte inferior.
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*==========================================================================================
:*
:*------------------------------------------------------------------------------------------*/
package mx.edu.itl.u3imcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.splash_activity );

        // Hacer la transición al MainActivity después de 2 seg.
        new Handler ().postDelayed ( new Runnable() {
            @Override
            public void run () {
                // Crear el Intent para llamar a MainActivity
                Intent intent = new Intent ( SplashActivity.this, MainActivity.class );
                startActivity ( intent );
                finish ();
            }
        }, 2000 );

    }
}