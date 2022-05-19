import java.util.*;

public class main {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean dev = false;

        String pergunta = "S";

        while(pergunta.equalsIgnoreCase("S")) {
            Pessoa pessoa = new Pessoa();
            System.out.println("Informe o nome da pessoa: ");
            pessoa.setNome(sc.next());
            System.out.print("Informe a idade da pessoa: ");
            pessoa.setIdade(sc.nextInt());
            System.out.print("Informe o peso da pessoa: ");
            pessoa.setPeso(sc.nextDouble());
            System.out.print("Informe a altura da pessoa: ");
            pessoa.setAltura(sc.nextFloat());
            System.out.print("A pessoa é DEV? S/N: ");
            dev = sc.next().equalsIgnoreCase("S")? true:false;
            pessoa.setEhDev(dev);

            pessoas.add(pessoa);

            System.out.println("Deseja continuar? S/N");
            pergunta = sc.next();
        }
        int somaIdades = 0;
        List<String> agrupamentoNomes = new ArrayList<>();
        List<String> nomeSilva = new ArrayList<>();
        int countDev = 0;
        double somaImc = 0;
        for( Pessoa pessoaList: pessoas){
            somaIdades += pessoaList.getIdade();
            agrupamentoNomes.add(pessoaList.getNome());
            if(pessoaList.isEhDev())
                countDev++;
            somaImc = somaImc + calculaImc(pessoaList.getPeso(), pessoaList.getAltura());

            if(pessoaList.getNome().toLowerCase(Locale.ROOT).contains("silva")){
                nomeSilva.add(pessoaList.getNome());
            }
        }

        System.out.println("Soma das Idades: " + somaIdades);
        Collections.sort(agrupamentoNomes);

        for(String agrupamentoNome: agrupamentoNomes){
            System.out.println(agrupamentoNome);
        }
        System.out.println("Media IMC " + somaImc / pessoas.size());
        System.out.println("Quantidade de Ubuntus DEV: " + countDev);

        if(!nomeSilva.isEmpty()){
            Collections.sort(nomeSilva);
            for(String exibeSilva: nomeSilva){
                System.out.println("Nome Silva: " + exibeSilva);
            }
        }
    }

    static double calculaImc(double peso, double altura){
        double imc = peso / Math.pow(altura, 2);
        return imc;
    }
}
