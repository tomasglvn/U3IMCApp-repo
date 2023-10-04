/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                                CAMPUS LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                             DESARROLLO EN ANDROID "A"
:*
:*                   SEMESTRE: AGO-DIC/2023    HORA: 08-09 HRS
:*
:*                  Activity que muestra datos grales. de la App
:*
:*  Archivo     : AcercaDeActivity.java
:*  Autor       : Galván Gándara Tomás Alejandro    20130770
:*  Fecha       : 29/Sep/2023
:*  Compilador  : Android Studio Giraffe 2022.3.1
:*  Descripción : Esta clase despliega en pantalla un activity que muestra datos de la App
:*                tales como título, versión, nombre del autor y núm. control.
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*==========================================================================================
:*
:*------------------------------------------------------------------------------------------*/
package mx.edu.itl.u3imcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AcercaDeActivity extends AppCompatActivity {

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.acercade_activity );
    }
}