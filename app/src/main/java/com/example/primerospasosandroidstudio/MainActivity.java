

/*Hacer una app que ingrese dos valores text Number y luego que contenga dos bptones
una para sumar y otro para restar y uno tercero que nos permita hacer la accion que
seleccionamos y nos muestre los resultados en un  text View
 */

package com.example.primerospasosandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast; //nos aparece asi por que no la estamos utilizando la podemos
//si queremos  y las que si se usan aparacen bien marcadas





public class MainActivity extends AppCompatActivity {

    //Lo primero que se hace es agregar objetos de tipo EditText en modo privado
    //para que nadamas esta clase tenga acceso a ellos y van a hacer  3   dos para que ingrese valor 1 y
    // valor 2 y uno tercero que muestre el resultado

    //       \/objetos que nos permita utilizar los texView y edit Text etc para poder colocar valores
                         //dentro de nuestros controles .
    private EditText et1;
    private EditText et2;

    private TextView tv1;

    private RadioButton rb1,rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Ejemplo sin proposito:


/*

       \/Objeto de tipo
        et1=(EditText)findViewById();
               /\Castin para que nuestro primer valor que va a ingresar el usuario que es textView
                lo convierta a EditText y asi poder meter el valor dentro del objeto EditTextx et1
                y asi se compatible     */





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




                             et1=(EditText)findViewById(R.id.txt_num1);
                                                                /\El id de nuestro textView de
                                                                  activity

     */

        //Total de toodo objetos guardando lo que ingreso el usuario

        et1 = (EditText) findViewById(R.id.txt_num1);
       et2 = (EditText) findViewById(R.id.txt_num2);


     tv1 = (TextView) findViewById(R.id.txt_Resultado);

        rb1 = (RadioButton) findViewById(R.id.radioButton1);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);


    }
    //El metodo se va a mandar a llamar cuando demos click en el main activity de Evaluar
    // el metodo se agrega en   common attributes y luego en onclick y seleccionar metodo
    //El siguiente metodo realiza la Evaluacion
    //           \/Retornara valores nuestro metodo que son los resultados
   public void sumar_o_restar(View view) {

       //       \/variable de tipo stiring que guardara
       //                  \/Metodo que nos permite recuperar todoo el edit text
       String valor1 = et1.getText().toString();
       String valor2 = et2.getText().toString();

       //                             /\metodo que nos permite parsear a string
       //                           \/Parseo de String a entero(int)
       int numero1 = Integer.parseInt(valor1);
       int numero2 = Integer.parseInt(valor2);


       int sumar_1= numero1+numero2;

         if(rb1.isChecked()==true){

             String resultado_Total=String.valueOf(sumar_1);
             tv1.setText(resultado_Total);

         }else if(rb2.isChecked()==true){
             int resta=numero1-numero2;
             String res_resultado=String.valueOf(resta);
             tv1.setText(res_resultado);
         }




   }

    }

