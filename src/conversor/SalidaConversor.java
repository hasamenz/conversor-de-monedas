package conversor;

import javax.swing.*;
import java.math.BigDecimal;

public class SalidaConversor {
    public static void main(String[] args) {
        boolean stado = true;

        while (stado){

            double cantidadIngresadaDouble = 0;
            BigDecimal resultado2 = new BigDecimal(0);

            // ARRAY CON LA LISTA DE MONEDAS
            Object[] monedas = { "soles","dolares", "euros", "libra esterlina", "yen japones" };

            //INGRESANDO LA MONEDA DE ORIGEN
            Object monedaOrigen = JOptionPane.showInputDialog(null,"Seleccione la moneda de Origen :",
                             "SELECCIONAR MONEDA", JOptionPane.QUESTION_MESSAGE, null,monedas,"Seleccione moneda");

            //INGRESANDO LA CANTIDAD A CONVERTIR
            String cantidadIngresada = JOptionPane.showInputDialog(null,"Ingrese la cantidad de "+monedaOrigen);

            try {
                cantidadIngresadaDouble = Double.parseDouble(cantidadIngresada);

                //SELECCIONANDO LA MONEDA DE A CONVERTIR
                Object monedaDestino = JOptionPane.showInputDialog(null,"Seleccione la moneda de Destino :", "SELECCIONAR MONEDA", JOptionPane.QUESTION_MESSAGE, null,monedas,"Seleccione moneda");

                //CONVERTIR VALORES INGRESADOS
                String monedaOrigenString = monedaOrigen.toString();
                String modenaDestinoString = monedaDestino.toString();

                //EJECUNTANDO LA CONVERSION
                TasaDeCambio tasa = new TasaDeCambio();
                if (monedaOrigen.equals("soles")){
                    resultado2 = tasa.OperacionConvertirDeSoles(modenaDestinoString,cantidadIngresadaDouble);
                }

                if (monedaOrigen.equals("dolares")){
                    resultado2 = tasa.OperacionConvertirDeDolares(modenaDestinoString,cantidadIngresadaDouble);
                }

                if (monedaOrigen.equals("euros")){
                    resultado2 = tasa.OperacionConvertirDeEuros(modenaDestinoString,cantidadIngresadaDouble);
                }

                int option = JOptionPane.showOptionDialog(null, "El resultado de convertir "+cantidadIngresada +" "+monedaOrigen +" a "+monedaDestino+" es : \n" + resultado2 + " " +monedaDestino + "\n\n¿Desea cerrar el programa o volver a ejecutar?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Cerrar", "Convertir otra moneda"}, "Cerrar");
                if(option == JOptionPane.YES_OPTION){
                    System.exit(0); //Cerrar programa
                }else{
                    new SalidaConversor();
                }

            }catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
                System.out.println(e);
            }

        }


    }
}

