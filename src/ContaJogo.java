package Javacore.BintroducaoMetodos.dominio;

public class ContaJogo {

    private String nome;
    private int nivel;
    private int xp;
    private int vida;

    public ContaJogo(String nome) {
        this.nome = nome;
        this.nivel = 1;
        this.xp = 0;
        this.vida = 100;
    }

    public void ganharXp(int valor) {
        if (valor > 0) {
            xp += valor;
        } else {
            System.out.println("xp negativo");

        }

    }


    public void subirNivel() {
        if (xp >= 100) {
            nivel++;
            xp = 0;
        }
    }

    public void receberDano(int dano){
        if (dano >= 0){

            if (dano >= vida){
                vida = 0;
            }else{
                vida -= dano;
            }

            }else{
            System.out.println("dano inválido");
        }


    }

    public void curar(int cura){
        if (cura > 0){

            if (vida + cura >= 100){
                vida = 100;
            }else {
                vida += cura;
            }

        }else{
            System.out.println("cura deve ser maior que zero");
        }

    }

    public void mostrarStatus(){
        System.out.println("nome: " + nome);
        System.out.println("nível: " + nivel);
        System.out.println("xp: " + xp);
        System.out.println("vida: " + vida);

    }
}
