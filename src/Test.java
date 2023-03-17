import java.util.ArrayList;

class Teste {
	
    public static void main (String args[]) {
        ArrayList<Student> students = new ArrayList<>();
        
        Student std1 = new Student(
            "Martin Fowler",
            11223344,
            true,
            20.5,
            new Course(
                "ADS",
                "Graduação",
                false,
                0,
                920.50,
                new ConclusionWork(
                    null,
                    null,
                    null
        )));
        Student std2 = new Student(
            "Kent Beck",
            22334455,
            false,
            null,
            new Course(
                "Computação Aplicada",
                "Mestrado",
                true,
                2019,
                2150.45,
                new ConclusionWork(
                    "Impacto da Refatoração",
                    "Peter Coad",
                    9.5
        )));
        students.add(std1);
        students.add(std2);

        for (int i = 0;i<students.size(); i++) {
            System.out.println("Nome: " + students.get(i).getName());
            System.out.println("Curso: " + students.get(i).getCourse().getCourseDescription());
            // System.out.println(students.get(i).getCourse().getConclusionWork().getWorkTitle());
            // System.out.println();
            // System.out.println();
        }

    }
}

// "Kent Beck",
// "Computação Aplicada",
// "Mestrado",
// 22334455,
// false,
// true,
// true,
// 2019,
// 2150.45,
// 0,

// Aluno: Martin Fowler
// Curso: Graduação em ADS
// Bolsista com desconto de: 20.5%
// Mensalidade: R$ 731.7975

// Aluno: Kent Beck
// Curso: Mestrado em Computação Aplicada
// Mensalidade: R$ 2150.45
// Curso finalizado em 2019
// Título da dissertação: Impacto da Refatoração
// Orientador(a): Prof. Peter Coad
// Nota: 9.5