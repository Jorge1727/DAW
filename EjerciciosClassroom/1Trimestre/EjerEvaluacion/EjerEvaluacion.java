import java.util.Scanner;

public class EjerEvaluacion 
{
        public static void main(String[] args) 
        {
                final int SUELDO_BASE = 950;
                final int YEAR_ANTIGUEDAD = 150;
                final int BONIF_HIJO = 10;
                final float HORA_EXTRA = 21.4f;
                final float FORMACION_EMPRESA = 0.05f;

                System.out.println("Que antiguedad tienes en la empresa?");
                Scanner sc = new Scanner(System.in);
                int antiguedad = sc.nextInt();
                int bonifPorantiguedad = YEAR_ANTIGUEDAD * antiguedad;
                
                System.out.println("Cuantos hijos tienes?");
                int hijos = sc.nextInt();
                int bonifTotalHijos;
                if (hijos >= 3)
                        bonifTotalHijos = (hijos * BONIF_HIJO )+ 100;
                else
                        bonifTotalHijos = hijos * BONIF_HIJO;

                System.out.println("Cuantas horas extras has realizado?");
                int horasHechadas = sc.nextInt();
                float bonifHorasHechadas = horasHechadas * HORA_EXTRA;
                sc.close();

                float totalRestaPorFormacion = (SUELDO_BASE + bonifPorantiguedad + bonifHorasHechadas + bonifTotalHijos) * FORMACION_EMPRESA;

                float total = (SUELDO_BASE + bonifPorantiguedad + bonifHorasHechadas + bonifTotalHijos) - totalRestaPorFormacion;

                float sueldoSinHrNiReduccion = SUELDO_BASE + bonifPorantiguedad + bonifTotalHijos;

                System.out.println("El empleado recibira en su nomina mensual \"" + total + "\"€\nDe los cuales:\n\t- "
                                + sueldoSinHrNiReduccion + "€ son de sueldo base + antiguedad + bonificacion por hijo.\n\t- " + 
                                bonifHorasHechadas + "€ son de hrs extras realizadas (\"" + horasHechadas + 
                                "\" horas realizadas).\n\t- \"-" + totalRestaPorFormacion + "\"€ para formacion.");

        }
}
