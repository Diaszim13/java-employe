import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class exercicioEmpregados {

 public static void main(String[] args) {
     Locale.setDefault(Locale.US);

     Scanner sc = new Scanner(System.in);

     List<empregado> list = new ArrayList<>();

     System.out.println("Quantos funcionarios voce deseja ter?");
     int N = sc.nextInt();


     for (int i = 0; i < N; i++) {
         System.out.println((i + 1) + "funcionario");

         System.out.println("ID: ");
         Integer id = sc.nextInt();

         System.out.println("Nome: ");
         String name = sc.nextLine();
         sc.nextLine();
         System.out.println("Sálario: ");
         Double salary = sc.nextDouble();

         empregado emp = new empregado(id, name, salary);

         list.add(emp);
     }

     System.out.println("Qual o id do funcionario que o salario vai ser mduado?: ");
     Integer id_func = sc.nextInt();
     System.out.println("Quantos % vai aumentar?: ");
     Double porc = sc.nextDouble();

     for(empregado emp : list) {
        if(emp.getId().equals(id_func)) {
            emp.setSalary((emp.getSalary() * porc) / 100);
            System.out.println("Novo salario: " + emp.getSalary());
        }
     }
     sc.close();
 }
}
