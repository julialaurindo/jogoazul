
import java.util.Random;

public abstract class Personagens {

    private String classe;
    private int jogador;
    private int vida;
    private int vidaMax;
    private int cura;
    private int ataque;
    private int bonus = 3;
    private int aleatorioAlto;
    private int aleatorioMedio;
    private int aleatorioBaixo;

    public int getAleatorioAlto() {
        return aleatorioAlto;
    }

    public void setAleatorioAlto(int aleatorioAlto) {
        this.aleatorioAlto = aleatorioAlto;
    }

    public int getAleatorioMedio() {
        return aleatorioMedio;
    }

    public void setAleatorioMedio(int aleatorioMedio) {
        this.aleatorioMedio = aleatorioMedio;
    }

    public int getAleatorioBaixo() {
        return aleatorioBaixo;
    }

    public void setAleatorioBaixo(int aleatorioBaixo) {
        this.aleatorioBaixo = aleatorioBaixo;
    }

    public int getVidaMax() {
        return vidaMax;
    }

    public void setVidaMax(int vidaMax) {
        this.vidaMax = vidaMax;
    }
    
    public int getJogador() {
        return jogador;
    }

    public void setJogador(int jogador) {
        this.jogador = jogador;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public Personagens(String classe, int vida, int vidaMax) {
        this.classe = classe;
        this.vida = vida;
        this.vidaMax = vidaMax;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getCura() {
        return cura;
    }

    public void setCura(int cura) {
        this.cura = cura;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public abstract void atacar(Personagens x);

    public abstract void curar();
    
    public int teste(int a){
        Random aleatorio = new Random();
        return aleatorio.nextInt(15)+a;
    }
    
    public void ataqueBonus(Personagens x) {
        x.setVida(x.getVida() - getBonus());
    }
    
    public void curaBonus(){
        setVida(getVida() + getBonus());
    }

}
