/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestdePreguntasInterface;

import javax.swing.JOptionPane;

/**
 *
 * @author Yamil Serrano
 *Paul Pasaca
 *Byron Montaño
 *Franco Mendoza
 */
public class PreguntaAdicion implements PreguntaEntera{
    //creamos las variables para las preguntas 
    private int numero1;
    private int numero2;
    private String lista;
    
    public String getPregunta (){//Nos retorna la pregunta 
      
        return "Cuanto es "+numero1+" + "+numero2;    
    }
    
    public int getRespuestaCorrecta(){//Retorna el resultado correcto de la pregunta
      
        return (numero1+numero2);
    }

    public String compararRespuesta(int respuestaU){//Compara si la respuesta dada por el usuario es correcta
       
        if (respuestaU==getRespuestaCorrecta()) {//si la respuesta es correcta se guarda en la variable Lista la pregunta y la respuesta dada por el usuario
            //JOptionPane.showMessageDialog(null, getPregunta()+"="+getRespuestaCorrecta()+ " Correcta");
            lista=getPregunta()+"="+getRespuestaCorrecta()+ " Correcta";
            
        }else{//Si la respuesta es incorrecta se guarda en la variable lista la pregunta con la respuesta del usuario
            //JOptionPane.showMessageDialog(null, getPregunta()+"="+getRespuestaCorrecta()+ " Tu respuesta: "+respuestaU+" Incorrecta");
            lista=getPregunta()+"="+getRespuestaCorrecta()+ "  Tu respuesta: "+respuestaU+" Incorrecta";
        }
        return lista;
    }
    
    public PreguntaAdicion() {//Se generan los numeros aleatorios para la pregunta
       
        this.numero1 = (int) (Math.random()*50+1);
        this.numero2 = (int) (Math.random()*50);
        
    }

    @Override
    public int getRespuestaCOrrecta() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public String compararRespuesta() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
}
