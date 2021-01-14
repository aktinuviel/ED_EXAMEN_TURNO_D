package analistaed_53364034d;

public class AnalistaED_53364034D {

   static final double FACTOR_HORA_EXTRA = 1.2;
   private String nombreCompleto, dni;
   private double salarioBasePorHora = 10.56;

   public AnalistaED_53364034D(String nombreCompleto, String dni) {
      this.nombreCompleto = nombreCompleto;
      this.dni = dni;
   }

   public double getSalarioEsteMes(int horasExtra) {
      double cantidadExtra, salarioFinal;
      cantidadExtra = horasExtra * this.salarioBasePorHora * FACTOR_HORA_EXTRA;
      salarioFinal = this.salarioBasePorHora * 40 * 4 + cantidadExtra;
      salarioFinal = (double) Math.round(salarioFinal * 100d) / 100d;
      return salarioFinal;
   }

   // Este método no lo comentaremos con JavaDoc
   public static void main(String[] args) {
      // !!!! MODIFICA TU NOMBRE Y TU DNI EN LA SIGUIENTE LÍNEA
      AnalistaED_53364034D emp = new AnalistaED_53364034D("ROCÍO GONZÁLEZ", "53364034d");
      int horasExtra = 2;
      System.out.println("El salario de " + emp.nombreCompleto
         + " este mes será de " + emp.getSalarioEsteMes(horasExtra)
         + " euros, al hacer " + horasExtra + " horas extra.");
   }

}
