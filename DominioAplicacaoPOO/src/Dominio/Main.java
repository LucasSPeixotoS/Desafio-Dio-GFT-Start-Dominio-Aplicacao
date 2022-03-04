package Dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		Mentoria mentoria = new Mentoria();
		BootCamp bootcamp = new BootCamp();
		Dev devLucas = new Dev();
		Dev devEleonora = new Dev();
		
		curso1.setTitulo(" Curso Java");
		curso1.setDescricao(" Descrição curso Java");
		curso1.setCargaHoraria(8);
		
		curso2.setTitulo(" Curso JS");
		curso2.setDescricao(" Descrição curso JS");
		curso2.setCargaHoraria(4);
		
		// Polimorfismo
		//Conteudo conteudo = new Curso();
		
		mentoria.setTitulo(" Mentoria de Java");
		mentoria.setDescricao(" Descrição mentoria Java");
		mentoria.setData(LocalDate.now());
		
		//System.out.println(curso1);
		//System.out.println(curso2);
		//System.out.println(mentoria);
		
		bootcamp.setNome(" Bootcamp Java Developer");
		bootcamp.setDescricao(" Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		devLucas.setNome("Lucas");
		devLucas.inscreverBootcamp(bootcamp);
		System.out.println("-");
		System.out.println("Conteúdos inscritos " + devLucas.getNome() + devLucas.getConteudosInscritos());
		devLucas.progredir();
		devLucas.progredir();
		devLucas.progredir();
		
		System.out.println("--------------");
		
		System.out.println("Conteúdos concluídos " + devLucas.getNome() + devLucas.getConteudosConcluidos());
		System.out.println("XP: " + devLucas.calcularTotalXp());
		
		devEleonora.setNome("Eleonora");
		devEleonora.inscreverBootcamp(bootcamp);
		
		System.out.println(" ");
		System.out.println("-");

		System.out.println("Conteúdos inscritos " + devEleonora.getNome() + devEleonora.getConteudosInscritos());
		devEleonora.progredir();
		
		System.out.println("--------------");
		
		System.out.println("Conteúdos concluídos " + devEleonora.getNome() + devEleonora.getConteudosConcluidos());
		System.out.println("XP: " + devEleonora.calcularTotalXp());
		
	}
	
}
