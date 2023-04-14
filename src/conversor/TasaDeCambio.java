package conversor;

import java.math.BigDecimal;

public class TasaDeCambio {

    BigDecimal solesSol = new BigDecimal(1);
    BigDecimal solesDol = new BigDecimal("0.26");
    BigDecimal solesEur = new BigDecimal("0.24");
    BigDecimal solesLib = new BigDecimal("0.21");
    BigDecimal solesYen = new BigDecimal("35.31");

    BigDecimal dolaresSol = new BigDecimal("3.79");
    BigDecimal dolaresDol = new BigDecimal(1);
    BigDecimal dolaresEur = new BigDecimal("0.91");
    BigDecimal dolaresLib = new BigDecimal("0.80");
    BigDecimal dolaresYen = new BigDecimal("133.20");

    BigDecimal eurosSol = new BigDecimal("4.15");
    BigDecimal eurosDol = new BigDecimal("1.10");
    BigDecimal eurosEur = new BigDecimal(1);
    BigDecimal eurosLib = new BigDecimal("0.88");
    BigDecimal eurosYen = new BigDecimal("146.46");

    BigDecimal libraSol = new BigDecimal("4.71");
    BigDecimal libraDol = new BigDecimal("1.25");
    BigDecimal libraEur = new BigDecimal("1.14");
    BigDecimal libraLib = new BigDecimal(1);
    BigDecimal libraYen = new BigDecimal("166.32");

    BigDecimal yenSol = new BigDecimal("0.028");
    BigDecimal yenDol = new BigDecimal("0.0075");
    BigDecimal yenEur = new BigDecimal("0.0068");
    BigDecimal yenLib = new BigDecimal("0.0060");
    BigDecimal yenYen = new BigDecimal(1);

    public BigDecimal OperacionConvertirDeSoles(String monedaDestino, double cantidadIngresada){
        BigDecimal cantidadIngresada1 = new BigDecimal(cantidadIngresada);
        //CONVERTIR DE SOLES A ....
        switch (monedaDestino){
            case "soles":
                return cantidadIngresada1.multiply(solesSol);
            case "dolares":
                return cantidadIngresada1.multiply(solesDol);
            case "euros":
                return cantidadIngresada1.multiply(solesEur);
            case "libra esterlina":
                return cantidadIngresada1.multiply(solesLib);
            case "yen japones":
                return cantidadIngresada1.multiply(solesYen);
            default:
                return solesSol;
        }
    }

    public BigDecimal OperacionConvertirDeDolares(String monedaDestino, double cantidadIngresada){
        BigDecimal cantidadIngresada1 = new BigDecimal(cantidadIngresada);
        //CONVERTIR DE DOLARES A ....
        switch (monedaDestino){
            case "soles":
                return cantidadIngresada1.multiply(dolaresSol);
            case "dolares":
                return cantidadIngresada1.multiply(dolaresDol);
            case "euros":
                return cantidadIngresada1.multiply(dolaresEur);
            case "libra esterlina":
                return cantidadIngresada1.multiply(dolaresLib);
            case "yen japones":
                return cantidadIngresada1.multiply(dolaresYen);
            default:
                return dolaresDol;
        }
    }

    public  BigDecimal OperacionConvertirDeEuros(String monedaDestino, double cantidadIngresada){
        BigDecimal cantidadIngresada1 = new BigDecimal(cantidadIngresada);
        //CONVERTIR DE EUROS A ....
        switch (monedaDestino){
            case "soles":
                return cantidadIngresada1.multiply(eurosSol);
            case "dolares":
                return cantidadIngresada1.multiply(eurosDol);
            case "euros":
                return cantidadIngresada1.multiply(eurosEur);
            case "libra esterlina":
                return cantidadIngresada1.multiply(eurosLib);
            case "yen japones":
                return cantidadIngresada1.multiply(eurosYen);
            default:
                return eurosEur;
        }
    }

    public  BigDecimal OperacionConvertirDeLibras(String monedaDestino, double cantidadIngresada){
        BigDecimal cantidadIngresada1 = new BigDecimal(cantidadIngresada);
        //CONVERTIR DE LIBRA A ....
        switch (monedaDestino){
            case "soles":
                return cantidadIngresada1.multiply(libraSol);
            case "dolares":
                return cantidadIngresada1.multiply(libraDol);
            case "euros":
                return cantidadIngresada1.multiply(libraEur);
            case "libra esterlina":
                return cantidadIngresada1.multiply(libraLib);
            case "yen japones":
                return cantidadIngresada1.multiply(libraYen);
            default:
                return libraLib;
        }
    }

    public  BigDecimal OperacionConvertirDeYen(String monedaDestino, double cantidadIngresada){
        BigDecimal cantidadIngresada1 = new BigDecimal(cantidadIngresada);
        //CONVERTIR DE YEN A ....
        switch (monedaDestino){
            case "soles":
                return cantidadIngresada1.multiply(yenSol);
            case "dolares":
                return cantidadIngresada1.multiply(yenDol);
            case "euros":
                return cantidadIngresada1.multiply(yenEur);
            case "libra esterlina":
                return cantidadIngresada1.multiply(yenLib);
            case "yen japones":
                return cantidadIngresada1.multiply(yenYen);
            default:
                return yenYen;
        }
    }






}

