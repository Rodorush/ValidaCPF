import java.util.Scanner;

public class TestaCPF {
    public static void main(String[] args) {
        //String cpf;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um CPF (somente números): ");
        ValidaCPF cpf = new ValidaCPF(sc.nextLine());
        System.out.println(cpf.resultado());
        sc.close();
    }
}
