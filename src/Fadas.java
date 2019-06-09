public abstract class Fadas extends Personagens {

    private int curaBonus;

    public Fadas(String classe, int vida, int vidaMax) {
        super(classe, vida, vidaMax);
    }

    public int getCuraBonus() {
        return curaBonus;
    }

    public void setCuraBonus(int curaBonus) {
        this.curaBonus = curaBonus;
    }
    
    @Override
    public void atacar(Personagens x) {
        aleatorioAlto();
        setAtaque(getAleatorioAlto());
        x.setVida(x.getVida() - getAtaque());
    }

    @Override
    public void curar() {
        aleatorioBaixo();
        setCura(getAleatorioBaixo());
        setVida(getVida() + getCura());
    }
    
}
