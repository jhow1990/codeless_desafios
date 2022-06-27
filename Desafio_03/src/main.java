import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(inputStreamReader);
        Scanner sc = new Scanner(System.in);

        //List<Aluno> alunos = new ArrayList<>();
        System.out.println("Informe a quantidade de alunos: ");
        int qtdAlunos = sc.nextInt();

        Map<Integer, Aluno> alunos = new HashMap<>();

        for (int i = 0; i < qtdAlunos; i++) {
            Aluno aluno = new Aluno();
            System.out.println("Informe o nome do aluno: ");
            aluno.setNome(br.readLine());

            System.out.println("Informe a nota do aluno: ");
            aluno.setNota(sc.nextDouble());

            alunos.put(i, aluno);
        }

        Integer maiorNota =
                alunos.entrySet().stream().max((entry1, entry2) -> entry1.getValue().getNota() >
                        entry2.getValue().getNota() ? 1 : -1).get().getKey();

        System.out.println("O aluno com maior nota eh: " + alunos.get(maiorNota).getNota());
    }
}
