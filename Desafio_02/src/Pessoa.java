public class Pessoa {

    private String nome;
    private int idade;
    private double peso;
    private float altura;
    private boolean ehDev;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public boolean isEhDev() {
        return ehDev;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setEhDev(boolean ehDev) {
        this.ehDev = ehDev;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                ", altura=" + altura +
                ", ehDev=" + ehDev +
                '}';
    }
}
