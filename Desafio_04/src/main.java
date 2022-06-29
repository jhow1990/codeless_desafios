import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) throws IOException {

        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);


        List<Aluno> alunos = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            Aluno aluno = new Aluno();
            System.out.println("Nome do aluno: ");
            aluno.setNome(br.readLine());

            System.out.println("Idade do aluno: ");
            aluno.setIdade(Integer.parseInt(br.readLine()));

            System.out.println("Nota do aluno: ");
            aluno.setNota(Double.parseDouble(br.readLine()));

            alunos.add(aluno);
        }

        double somaNota = 0;
        for(Aluno aluno: alunos){
            somaNota += aluno.getNota();
        }

        System.out.println("Soma das notas: " + somaNota);
    }
}
