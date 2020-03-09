package Demo;

public class Pessoa {
    String nome;
    int idade;

    void fazAniversario(int dia, int mes) { // aniversario em 28/12
        if (dia == 28 && mes == 12)
            this.idade += 1;
        System.out.printf(this.nome + " " + this.idade + "\n");
    }
}