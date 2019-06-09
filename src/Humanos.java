/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lenal
 */
public abstract class Humanos extends Personagens {

    private int ataqueBonus;

    public Humanos(String classe, int vida, int vidaMax) {
        super(classe, vida, vidaMax);
    }

    public int getAtaqueBonus() {
        return ataqueBonus;
    }

    public void setAtaqueBonus(int ataqueBonus) {
        this.ataqueBonus = ataqueBonus;
    }
    
    @Override
    public void atacar(Personagens x) {
        int valor = teste(ValorDano.DANO_MEDIO.getDano());
        setAtaque(valor);
        x.setVida(x.getVida() - getAtaque());
    }

    @Override
    public void curar() {
        int valor = teste(ValorDano.DANO_MEDIO.getDano());
        setCura(valor);
        setVida(getVida() + getCura());
    }
    
}
