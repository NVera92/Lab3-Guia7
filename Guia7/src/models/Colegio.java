package models;

import java.util.*;

public class Colegio {
    private List<Alumno> listadoAlumnos;

    public Colegio() {
        this.listadoAlumnos = new ArrayList<>();
    }

    public List<Alumno> getListadoAlumnos() {
        return listadoAlumnos;
    }

    public void setListadoAlumnos(List<Alumno> listadoAlumnos) {
        this.listadoAlumnos = listadoAlumnos;
    }

    public void agregarAlumno(Alumno a, String nacionalidad){
        try{
            a.setNacionalidad(nacionalidad);
            this.listadoAlumnos.add(a);
        }catch (NullPointerException e){
            System.out.println("El alumno no existe");
        }
    }

    public void verNacionalidad(String nacionalidad) {
        int i = 0;
        try{
            if(this.listadoAlumnos.isEmpty()){
                for(Alumno a : this.listadoAlumnos){
                    if(a.getNacionalidad().isEmpty() || a.getNacionalidad() == null){
                        throw new NullPointerException();
                    }else{
                        if(a.getNacionalidad().equalsIgnoreCase(nacionalidad)){
                            i++;
                        }
                    }
                }
                if (i == 1) {
                    System.out.println("Hay "+i+" alumno de nacionalidad "+nacionalidad);
                }else{
                    System.out.println("Hay "+i+" alumnos de nacionalidad "+nacionalidad);
                }

            }
        }catch (NullPointerException e){
            System.out.println("Hay uno o varios alumnos sin nacionalidad!!!");
        }

        }


        public void cuantos() throws NullPointerException{
            HashMap<String, Integer> map = new HashMap<>();
        try {
            if(this.listadoAlumnos.isEmpty()){
                throw new NullPointerException();
            }else{
                for(Alumno a : this.listadoAlumnos){
                    if(a.getNacionalidad().isEmpty() || a.getNacionalidad() == null){
                        throw new NullPointerException();
                    }else{
                        if(map.containsKey(a.getNacionalidad())){
                            map.replace(a.getNacionalidad(),map.get(a.getNacionalidad())+1);
                        }else{
                            map.put(a.getNacionalidad(),1);
                        }
                    }
                }
                System.out.println(map);
            }
        }catch (NullPointerException e){
            System.out.println("Hay alumnos sin Nacionalidad");
        }
        }
}
