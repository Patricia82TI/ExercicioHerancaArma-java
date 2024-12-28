import java.util.Scanner;

//Faça um programa com uma classe arma com tamanho, getters e setters
//Uma classe espada filha de arma com lâmina, getters e setters
//Depois crie uma espada com um tamanho e material inseridos pelos usuário e
//imprima esses valores na tela.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Espada espada = new Espada();


        System.out.println("Digite um tamanho para a espada:");
        espada.setTamanho(sc.nextLine());
        System.out.println("Digite um material para a lâmina da espada:");
        espada.setLamina(sc.nextLine());

        System.out.println("Espada -> Tamanho: " + espada.getTamanho());
        System.out.println("Espada -> Lâmina: " +  espada.getLamina());
    }
}