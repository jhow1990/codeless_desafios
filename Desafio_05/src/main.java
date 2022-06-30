import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) throws IOException {

        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        File arquivo = new File("saida.csv");

        try{

            if(!arquivo.exists()){
                arquivo.createNewFile();
            }

            FileWriter fw = new FileWriter(arquivo, true);
            BufferedWriter bw = new BufferedWriter(fw);

            String cabecalho = "nome;idade;nota\n";
            bw.write(cabecalho);
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
                bw.write(aluno.getNome() + ";"+aluno.getIdade()+";"+aluno.getNota() + "\n");
                somaNota += aluno.getNota();
            }

            bw.write("Soma das notas: " + somaNota);

            bw.close();
            fw.close();

        }catch(IOException ex){
            ex.printStackTrace();
        }

    }
}
