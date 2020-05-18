package Controlador;

import java.text.DateFormat;
import java.util.Date;

public class Funciones {

    public String num_a_str(double cant) {
        int cantidad = (int) cant;
        int unidad = 0, decena = 0, centena = 0, unidadM = 0, decenaM = 0,
                centenaM = 0, millon = 0;
        String str = "", unidadS = "", decenaS = "", centenaS = "", unidadMS = "",
                decenaMS = "", centenaMS = "";
        String resultado = "";

        if (cantidad >= 10 && cantidad <= 15) {
            switch (cantidad) {
                case 10:
                    str = "Diez";
                    break;
                case 11:
                    str = "Once";
                    break;
                case 12:
                    str = "Doce";
                    break;
                case 13:
                    str = "Trece";
                    break;
                case 14:
                    str = "Catorce";
                    break;
                case 15:
                    str = "Quince";
                    break;
            }
        } else {
            unidad = cantidad % 10;

            decena = cantidad / 10;
            decena = decena % 10;

            centena = cantidad / 10;
            centena = centena / 10;
            centena = centena % 10;

            unidadM = cantidad / 10;
            unidadM = unidadM / 10;
            unidadM = unidadM / 10;
            unidadM = unidadM % 10;

            decenaM = cantidad / 10;
            decenaM = decenaM / 10;
            decenaM = decenaM / 10;
            decenaM = decenaM / 10;
            decenaM = decenaM % 10;

            centenaM = cantidad / 10;
            centenaM = centenaM / 10;
            centenaM = centenaM / 10;
            centenaM = centenaM / 10;
            centenaM = centenaM / 10;
            centenaM = centenaM % 10;

            millon = cantidad / 10;
            millon = millon / 10;
            millon = millon / 10;
            millon = millon / 10;
            millon = millon / 10;
            millon = millon / 10;
            millon = millon % 10;

            switch (unidad) {
                case 0:
                    unidadS = "";
                    break;
                case 1:
                    unidadS = "Uno";
                    break;
                case 2:
                    unidadS = "Dos";
                    break;
                case 3:
                    unidadS = "Tres";
                    break;
                case 4:
                    unidadS = "Cuatro";
                    break;
                case 5:
                    unidadS = "Cinco";
                    break;
                case 6:
                    unidadS = "Seis";
                    break;
                case 7:
                    unidadS = "Siete";
                    break;
                case 8:
                    unidadS = "Ocho";
                    break;
                case 9:
                    unidadS = "Nueve";
                    break;
            }

            switch (decena) {
                case 0:
                    decenaS = "";
                    break;
                case 1:
                    if (unidad == 0) {
                        decenaS = "Diez";
                    } else if (unidad == 1) {
                        decenaS = "Once";
                        unidadS = "";
                    } else if (unidad == 2) {
                        decenaS = "Doce";
                        unidadS = "";
                    } else if (unidad == 3) {
                        decenaS = "Trece";
                        unidadS = "";
                    } else if (unidad == 4) {
                        decenaS = "Catorce";
                        unidadS = "";
                    } else if (unidad == 5) {
                        decenaS = "Quince";
                        unidadS = "";
                    } else {
                        decenaS = "Dieci";
                    }
                    break;
                case 2:
                    decenaS = (unidad == 0) ? "Veinte" : "Vienti";
                    break;
                case 3:
                    decenaS = (unidad == 0) ? "Treinta" : "Treinta y ";
                    break;
                case 4:
                    decenaS = (unidad == 0) ? "cuarenta" : "cuanrenta y ";
                    break;
                case 5:
                    decenaS = (unidad == 0) ? "Cincuenta" : "Cincuenta y ";
                    break;
                case 6:
                    decenaS = (unidad == 0) ? "Sesenta" : "Sesenta y ";
                    break;
                case 7:
                    decenaS = (unidad == 0) ? "Setenta" : "Setenta y ";
                    break;
                case 8:
                    decenaS = (unidad == 0) ? "Ochenta" : "Ochenta y ";
                    break;
                case 9:
                    decenaS = (unidad == 0) ? "Noventa" : "Noventa y ";
                    break;
            }

            switch (centena) {
                case 0:
                    centenaS = "";
                    break;
                case 1:
                    centenaS = (unidad == 0 && decena == 0) ? "Cien" : "Ciento ";
                    break;
                case 2:
                    centenaS = "Doscientos ";
                    break;
                case 3:
                    centenaS = "Trescientos ";
                    break;
                case 4:
                    centenaS = "Cuatrocientos ";
                    break;
                case 5:
                    centenaS = "Quinientos ";
                    break;
                case 6:
                    centenaS = "Seiscientos ";
                    break;
                case 7:
                    centenaS = "Setecientos ";
                    break;
                case 8:
                    centenaS = "Ochocientos ";
                    break;
                case 9:
                    centenaS = "Novecientos ";
                    break;
            }

            switch (unidadM) {
                case 0:
                    unidadMS = "";
                    break;
                case 1:
                    unidadMS = "Un Mil ";
                    break;
                case 2:
                    unidadMS = "Dos Mil ";
                    break;
                case 3:
                    unidadMS = "Tres Mil ";
                    break;
                case 4:
                    unidadMS = "Cuatro Mil ";
                    break;
                case 5:
                    unidadMS = "Cinco Mil ";
                    break;
                case 6:
                    unidadMS = "Seis Mil ";
                    break;
                case 7:
                    unidadMS = "Siete Mil ";
                    break;
                case 8:
                    unidadMS = "Ocho Mil ";
                    break;
                case 9:
                    unidadMS = "Nueve Mil ";
                    break;
            }

            switch (decenaM) {
                case 0:
                    decenaMS = "";
                    break;
                case 1:
                    if (unidadM == 0) {
                        decenaMS = "Diez Mil ";
                        unidadMS = "";
                    } else if (unidadM == 1) {
                        decenaMS = "Once Mil ";
                        unidadMS = "";
                    } else if (unidadM == 2) {
                        decenaMS = "Doce Mil ";
                        unidadMS = "";
                    } else if (unidad == 3) {
                        decenaMS = "Trece Mil ";
                        unidadMS = "";
                    } else if (unidadM == 4) {
                        decenaMS = "Catorce Mil ";
                        unidadMS = "";
                    } else if (unidadM == 5) {
                        decenaMS = "Quince Mil ";
                        unidadMS = "";
                    } else {
                        decenaMS = "Dieci";
                    }
                    break;
                case 2:
                    decenaMS = (unidadM == 0) ? "Viente Mil " : "Vienti";
                    break;
                case 3:
                    decenaMS = (unidadM == 0) ? "Treinta Mil " : "Treinta y ";
                    break;
                case 4:
                    decenaMS = (unidadM == 0) ? "Cuarenta Mil " : "Cuarenta y ";
                    break;
                case 5:
                    decenaMS = (unidadM == 0) ? "Cincuenta Mil " : "Cincuenta y ";
                    break;
                case 6:
                    decenaMS = (unidadM == 0) ? "Sesenta Mil " : "Sesenta y ";
                    break;
                case 7:
                    decenaMS = (unidadM == 0) ? "Setenta Mil " : "Setenta y ";
                    break;
                case 8:
                    decenaMS = (unidadM == 0) ? "Ochenta Mil " : "Ochenta y ";
                    break;
                case 9:
                    decenaMS = (unidadM == 0) ? "Noventa Mil " : "Noventa y ";
                    break;
            }

            switch (centenaM) {
                case 0:
                    centenaMS = "";
                    break;
                case 1:
                    centenaMS = (unidadM == 0 && decenaM == 0) ? "Cien Mil " : "Ciento ";
                    break;
                case 2:
                    centenaMS = (unidadM == 0 && decenaM == 0) ? "Doscientos Mil " : "Doscientos ";
                    break;
                case 3:
                    centenaMS = (unidadM == 0 && decenaM == 0) ? "Trecientos Mil " : "Trescientos ";
                    break;
                case 4:
                    centenaMS = (unidadM == 0 && decenaM == 0) ? "Cuatrocientos Mil " : "Cuatrocientos ";
                    break;
                case 5:
                    centenaMS = (unidadM == 0 && decenaM == 0) ? "Quinientos Mil " : "Quinientos ";
                    break;
                case 6:
                    centenaMS = (unidadM == 0 && decenaM == 0) ? "Seiscientos Mil " : "Seiscientos ";
                    break;
                case 7:
                    centenaMS = (unidadM == 0 && decenaM == 0) ? "Setecientos Mil " : "Setecientos ";
                    break;
                case 8:
                    centenaMS = (unidadM == 0 && decenaM == 0) ? "Ochocientos Mil " : "Ochocientos ";
                    break;
                case 9:
                    centenaMS = (unidadM == 0 && decenaM == 0) ? "Novecientos Mil " : "Novecientos ";
                    break;
            }
        }

        if (cantidad > 9 && cantidad < 16) {
            resultado = str;
        } else {
            resultado = centenaMS + decenaMS + unidadMS + centenaS + decenaS + unidadS;
        }

        return resultado;
    }
    
    public String fechaActual(){
        DateFormat df = DateFormat.getDateInstance();
        Date fecha = new Date();
        
        String fech = df.format(fecha);
        
        return fech;
    }
}
