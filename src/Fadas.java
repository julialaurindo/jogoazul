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
        int valor = teste(ValorDano.DANO_ALTO.getDano());
        setAtaque(valor);
        x.setVida(x.getVida() - getAtaque());
    }

    @Override
    public void curar() {
        int valor = teste(ValorDano.DANO_BAIXO.getDano());
        setCura(valor);
        setVida(getVida() + getCura());
    }
    
}
