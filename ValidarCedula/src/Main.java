
// Ejercicio de validar la cedula

public class Main {

    private String cedula;


    public String getCedula(){
        return this.cedula;
    }
    
    public void setCedula(String cedula) {

        if(CedulaValida(cedula)){

            this.cedula=cedula;
        }else{
            System.out.println("Cédula no válida");
        }
    }

    //Metodos privados

    private boolean CedulaValida(String cedula){
        // TODO implementar algoritmo de validacion
        return false;
    }
    public static void main(String[] args) {


        int coeficientes []={2,1,2,1,2,1,2,1,2};
        int cedula[]={1,7,2,5,0,9,4,8,1,5};
        int total=0;
        int numero=0;
        int decenasuperior = 0;


        System.out.println("\t Validación de cédula");
        for(int i=0 ; i<=8 ; i++ ) {
                if (i % 2 == 0) {
                    numero = cedula[i] * 2;
                    if (numero >= 10) {
                        numero = numero - 9;
                    }

                } else {
                    numero = cedula[i] * 1;
                }

                total = total + numero;
            }
            System.out.println("\nSuma total:" + total);

            decenasuperior = total;

            // restar de la decena superior

            while (total % 10 != 0) {
                total++;
            }
            decenasuperior = total - decenasuperior;

            System.out.println("Último número de mi cédula es:" + decenasuperior);

        }
}





