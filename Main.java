public class Main {
    public static void main(String args[]) {

        Cachorro Dog = new Cachorro("Bob", 7);
        Cachorro Dog1 = new Cachorro();
        
        Dog1.latir();

        Dog1.setNome("Bob ");
        Dog1.setPeso(7);

        System.out.println("Cachorro ");
        System.out.println("Nome: " + Dog1.getNome());
        System.out.println("Peso: " + Dog1.getPeso());

        Dog1.correr();
    }
}