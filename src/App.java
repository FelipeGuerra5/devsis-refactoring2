class Student {
	private String name;
	private int registrationID;
	private boolean hasSchoolarship;
	private Double discount;
    private Course course;

    public Student(
        String name,
        int registrationID,
        boolean hasSchoolarship,
        Double discount,
        Course course
        ) {
		this.name = name;
		this.registrationID = registrationID;
		this.hasSchoolarship = hasSchoolarship;
        this.discount = discount;
        this.course = course;
    }

    public String getName() {
        return this.name; 
    }

    public int getRegistration() {
        return this.registrationID; 
    }

    public boolean getSchoolarship() {
        return this.hasSchoolarship; 
    }

    public Double getDiscount() {
        return this.discount;
    }

    public Course getCourse() {
        return this.course;
    }
}


class Course {
    private String courseName, courseLevel;
    private int yearFinish;
    private boolean hasConclusionWork;
    private double monthlyRate;
    private ConclusionWork conclusionWork;

    public Course (
        String courseName,
        String courseLevel,
        boolean hasConclusionWork,
        int yearFinish,
        double monthlyRate,
        ConclusionWork conclusionWork
        ) {
		this.courseName = courseName;
		this.courseLevel = courseLevel;
		this.hasConclusionWork = hasConclusionWork;
		this.yearFinish = yearFinish;
		this.monthlyRate = monthlyRate;
        this.conclusionWork = conclusionWork;
    }

    public String getCourseDescription() {
        return (this.courseLevel + " em " + this.courseName +"\n");
    }

    public int getConclusionYear() {
        if (this.yearFinish != -1) {
            return this.yearFinish ;
        } else {
            return -1;
        }
    }

    public double getMonthlyRate(Boolean hasDiscount, Double discount) {
        if (hasDiscount) {
            return this.monthlyRate * (1 - (discount/100));
        } else {
            return this.monthlyRate;
        }
    }

    public Object getConclusionWork() {
        if (this.hasConclusionWork) {
            return conclusionWork;
        } else {
            return null;
        }
    }
}


class ConclusionWork {
    private String workTitle;
    private String workAdvisor;
    private Double workGrade;
    
    public ConclusionWork(
        String workTitle,
        String workAdvisor,
        Double workGrade
        ) {
        this.workTitle = workTitle;
        this.workAdvisor = workAdvisor;
        this.workGrade = workGrade;
    }

    public String getWorkTitle(String courseLevel) {
        
        String ans = "";
        switch (courseLevel){
            case "Graduação": 
                ans = "Título do TCC: " + this.workTitle;
            case "Lato sensu":
                ans = "Título da monografia: " + this.workTitle;
            case "Mestrado": 
                ans = "Título da dissertação: " + this.workTitle;
            case "Doutorado": 
                ans = "Título da tese: " + this.workTitle;
        }
        return ans;
    }

    public String getWorkAdvisor() {
        return this.workAdvisor;
    }

    public Double getWorkGrade() {
        return this.workGrade;
    }
}

// public String getDados()
// 		{
// 			String resp = "Aluno: "+ this.nome +"\n";
// 			resp += "Curso: " + this.nível_curso + " em " + this.nome_curso +"\n";
// 			if (this.é_bolsista) 
// 			{
// 				resp += "Bolsista com desconto de: " + this.desconto + "%\n";
// 				resp += "Mensalidade: R$ " + this.mensalidade_curso*(1-this.desconto/100)+ "\n";
// 			}
// 			else resp += "Mensalidade: R$ " + this.mensalidade_curso+ "\n";
// 			if (this.curso_finalizado)
// 			{
// 			 resp += "Curso finalizado em "+ano_finalização + "\n";
// 			 if (this.tem_trabalho)
// 			 {
// 				resp += "Título ";
// 				switch (nível_curso)
// 				{
// 				 case "Graduação": resp += "do TCC: "; break;
// 				 case "Lato sensu": resp += "da monografia: "; break;
// 				 case "Mestrado": resp += "da dissertação: "; break;
// 				 case "Doutorado": resp += "da tese: "; break;
// 				}
// 				resp += dados_tcc[1] + "\n";
// 				resp += "Orientador(a): Prof. " + dados_tcc[0] + "\n";
// 				resp += "Nota: " + dados_tcc[2];
// 			}
// 			}
// 			return resp;
// 		}

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
