public class Cachorro {
    private String Nome;
    private float Peso;

    public Cachorro(){

    }

    public Cachorro(String nome, float peso){
        Nome = nome;
        Peso = peso;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setPeso(float peso) {
        Peso = peso;
    }

    public String getNome(){
        return Nome;
    }

    public float getPeso(){
        return Peso;
    }

    public void latir() {
        System.out.println("O cachorro está latindo ...");
    }

    public void correr() {
        System.out.println("O cachorro está correndo ...");
    }    
}