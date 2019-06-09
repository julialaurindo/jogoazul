/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Julia
 */
public enum ValorDano {
    
    DANO_BAIXO (0),
    DANO_MEDIO (5),
    DANO_ALTO (10);

    private Integer dano;

    ValorDano(Integer dano){
    this.dano = dano;
}

    public Integer getDano() {
        return dano;
    }

}
