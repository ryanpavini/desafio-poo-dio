import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Aprenda Java do zero.");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Curso básico de JavaScript.");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Sessão de mentoria ao vivo.");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Intensivo prático de Java.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        // =================== DEV CAMILA ====================
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);

        System.out.println("👩‍💻 Desenvolvedora: " + devCamila.getNome());
        System.out.println("📚 Conteúdos Inscritos: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("✅ Conteúdos Concluídos: " + devCamila.getConteudosConcluidos());
        System.out.println("📌 Conteúdos Restantes: " + devCamila.getConteudosInscritos());
        System.out.println("🏆 XP Total: " + devCamila.calcularTotalXp());
        System.out.println("----------------------------------------------------");

        // =================== DEV JOÃO ====================
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);

        System.out.println("👨‍💻 Desenvolvedor: " + devJoao.getNome());
        System.out.println("📚 Conteúdos Inscritos: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("✅ Conteúdos Concluídos: " + devJoao.getConteudosConcluidos());
        System.out.println("📌 Conteúdos Restantes: " + devJoao.getConteudosInscritos());
        System.out.println("🏆 XP Total: " + devJoao.calcularTotalXp());
        System.out.println("----------------------------------------------------");
    }
}
