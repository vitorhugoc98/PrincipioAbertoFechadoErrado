package principioabertofechadoerrado;

public class Cargo {
    
    private String nome; 
    private float salario; 

    public Cargo(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    public float calcularSalario(){
        if(this.nome.equals("Analista")){
            this.salario = 5000f; 
        }else if(this.nome.equals("Programador")){
            this.salario = 3000f; 
        }
        return salario; 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    
    
    
}
