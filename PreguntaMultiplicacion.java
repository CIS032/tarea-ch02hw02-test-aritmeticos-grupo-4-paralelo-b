/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestdePreguntasInterface;

/**
 *
 * @author Yamil Serrano
 *Paul Pasaca   
 *Byron Montaño
 *Franco Mendoza
 */
public class PreguntaMultiplicacion implements PreguntaEntera{
    private int numero1;
    private int numero2;
    private String Cadenalista;
    
    public String getPregunta(){
      return "Cuanto es "+numero1+" * "+numero2;
    }
    public int getRespuestaCorrecta(){
      return numero1*numero2;
    }

    public String compararRespuesta(int respuestaU){
        if (respuestaU==getRespuestaCorrecta()) {
           
            Cadenalista=getPregunta()+"="+getRespuestaCorrecta()+ " Correcta";
        }else{
            
            Cadenalista=getPregunta()+"="+getRespuestaCorrecta()+ "  Tu respuesta: "+respuestaU+" Incorrecta";
        }
        return Cadenalista;
    }
    
    public PreguntaMultiplicacion() {
        this.numero1 = (int) (Math.random()*20+1);
        this.numero2 = (int) (Math.random()*20);
    }

    @Override
    public int getRespuestaCOrrecta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String compararRespuesta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
