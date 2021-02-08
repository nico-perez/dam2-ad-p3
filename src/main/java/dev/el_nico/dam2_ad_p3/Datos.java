package dev.el_nico.dam2_ad_p3;

import java.util.Arrays;
import java.util.List;

import dev.el_nico.dam2_ad_p3.modelo.Centro;
import dev.el_nico.dam2_ad_p3.modelo.Profesor;

public class Datos {
    private Datos() {}

    Centro IES_ITACA = new Centro(Centro.Codigo.COD_ITACA, "IES Itaca", "Jose Antonio Guallar", "Avda Estudiantes 1", "Zaragoza", "Zaragoza");
    Centro COLE_MONT = new Centro(Centro.Codigo.COD_MONTE, "Colegio Montessori", "Nosequé Señor", "Calle Lagasca 25", "Zaragoza", "Zaragoza");
    Profesor PROF_ITA_JOSE = new Profesor(0, "Josejuanzo", "Gorallez", "M", "19-3-2993", IES_ITACA);
    Profesor PROF_ITA_MARI = new Profesor(1, "Marianosa", "Capote", "F", "38-7-1990", IES_ITACA);
    Profesor PROF_ITA_ACHO = new Profesor(2, "Achoroque", "Gonzalsio", "M", "5-21-1746", IES_ITACA);
    Profesor PROF_MON_NICO = new Profesor(3, "El", "Nico", "M", "22-5-1998", COLE_MONT);
    Profesor PROF_MON_ROLE = new Profesor(4, "Rolevilla", "Hinasia", "F", "4-12-3821", COLE_MONT);
    Profesor PROF_MON_HIGU = new Profesor(5, "Higuchumbu", "Zoforeos", "?", "38-4-1997", COLE_MONT);
    
    public List<Centro> getCentros() {
        return Arrays.asList(

        );
    }

    public List<Profesor> getProfesores() {
        return Arrays.asList(
            
        );
    }
}
