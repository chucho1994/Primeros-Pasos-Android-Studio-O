

/*Hacer una app que contenga un texView donde nos muestre
la evaluacion de las calificaciones de fisica, matematicas, español y nos diga
si el alumno aprobo o rebrobo mediante el texView que lo va a mandar a llamar el
boton evaluar
 */

package com.example.primerospasosandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast; //nos aparece asi por que no la estamos utilizando la podemos
//si queremos  y las que si se usan aparacen bien marcadas

import android.widget.Toast;//libreria para utilizar clase toast-
//         /\se pone automaticamente cuando se agrega la clase si no lo poneemos manual




public class MainActivity extends AppCompatActivity {

    //Lo primero que se hace es agregar objetos de tipo EditText en modo privado
    //para que nadamas esta clase tenga acceso a ellos y van a hacer  4   tres para que el alumno
    //ingrese la calificacion de matematicas, fisica y español y uno para promedio

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Ejemplo sin proposito:


    /*Nota uno haciendo Casting

       \/Objeto de tipo
        et1=(EditText)findViewById();
               /\Castin para que nuestro primer valor que va a ingresar el usuario que es textView
                lo convierta a EditText y asi poder meter el valor dentro del objeto EditTextx et1
                y asi se compatible     */


        int matematicas = 0;
        int física= 0;
        int español=0;
        int promedio = 0;






    /*Nota dos explicando el metodo metodo findVieId();

          //                 \/Esto significa en cuentra la vista por Id
            et1=(EditText)findViewById(R);
                                       /\Clase R


                          -Una Vista es un componente un textView editView etc.


         Nota 3 Clase R

         Nos ayuda a hacer un puente de comunicacion entre nuestro codigo java(parte logica
                            y nuesta main activity(Parte Grafica)

                            Sin la clase R no se puede hacer la comunicacion entre la parte
                            grafica y logica

            Toast.makeText(this, "Aprovado", Toast.LENGTH_SHORT).show();
            //metodo para mostarar textos, imagenes, videos ect dependiendo de como lo
            //configuremos

        } else if (promedio <= 5) {
                                                          //       \/metodo para dar cuatno tiempo sea visible
            Toast.makeText(this, "Rebrobado", Toast.LENGTH_SHORT).show();
                                          // /\Texto que aparecera en la pantalla /\Eeste metodo nos
            //hace visible que nuestor mensaje se muestre en la pantalla del dispositivo
        }


                             et1=(EditText)findViewById(R.id.txt_num1);
                                                                /\El id de nuestro textView de
                                                                  activity

     */

        //Total de toodo objetos guardando lo que ingreso el usuario

        et1 = (EditText) findViewById(R.id.txt_num1);
       et2 = (EditText) findViewById(R.id.txt_num2);
       et3=(EditText)findViewById(R.id.txt_num3);

     tv1 = (TextView) findViewById(R.id.txt_Resultado);


    }
    //El metodo se va a mandar a llamar cuando demos click en el main activity de Evaluar
    // el metodo se agrega en   common attributes y luego en onclick y seleccionar metodo
    //El siguiente metodo realiza la Evaluacion
    //           \/Retornara valores nuestro metodo
   public void Evaluar(View view) {

       //       \/variable de tipo stiring que guardara
       //                  \/Metodo que nos permite recuperar todoo el edit text
       String valor1 = et1.getText().toString();
       String valor2 = et2.getText().toString();
       String valor3 = et3.getText().toString();
       //                             /\metodo que nos permite parsear a string
       //                           \/Parseo de String a entero(int)
       int numero1 = Integer.parseInt(valor1);
       int numero2 = Integer.parseInt(valor2);
       int numero3 = Integer.parseInt(valor3);

       int promedio= (numero1 + numero2+numero3)/3;

        /*                      \/Parsear de entero a String forma novata
        String resultado1=suma+" ";

        */
       //Parsear de entero a string de manera pro

     //  String resultado1 = String.valueOf(promedio);
       //tv1.setText(resultado1);

       String mensaje="Alumno aprobado con: ";
       String mensaje2="Alumno Rebrobado con ";

       if(promedio>=6){
           tv1.setText(mensaje+promedio);
       }if(promedio<=5){
           tv1.setText(mensaje2+promedio);
       }



       //para hacer texto grade y chico de editor de texto nos vamos a settings /keymap y en buscar
       //le damos en font size y seleccionamos para hacer grande o chico y lo configuramos
       //con el teclado o raton a nuestro gusto


       //hola estamos checando la rama pruebas_calculadora que esta dentro de la ramma
       //principal master la vamos a subir al git hub

   }

    }

