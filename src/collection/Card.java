package collection;

/** Class that represents a card
 * Decorator pattern is used
 */
public class Card extends AbstractCard {

    /**
     *  Constructor of card
     * @param id Card's unique id
     * @param categoria category of the card
     * @param classe class of the card
     * @param livello level of the card
     * @param rarità rarity of the card
     * @param tipo type of the card
     * @param nome name of the card
     * @param descrizione description of the card
     */
    public Card(int id, String categoria, String classe, int livello, String rarità, String tipo, String nome, String descrizione) {
        this.id = id;
        this.categoria=categoria;
        this.classe = classe;
        this.livello = livello;
        this.rarità = rarità;
        this.tipo = tipo;
        this.nome = nome;
        this.descrizione = descrizione;
    }

    public int getId() {
        return id;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }



    public void setId(int id) {
        this.id = id;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getLivello() {
        return livello;
    }

    public void setLivello(int livello) {
        this.livello = livello;
    }

    public String getRarità() {
        return rarità;
    }

    public void setRarità(String rarità) {
        this.rarità = rarità;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    /*    @Override
            public Boolean setNewOwner(User oldUser, User newUser) {
                if(this.Owner.equals(oldUser)){ //controllo che la carta appartenga al vecchio propietario
                    this.setOwner(newUser);
                    return true;
                }
                else return false;
            }*/

    /**
     * Override toString method
     * @return the description of the card
     */
    public String toString()
    {
        return categoria+" "+classe+" "+livello+" "+rarità+" "+tipo+" "+nome+" "+descrizione+"\n";
    }

    //@Override
    //public Boolean setNewOwner(User oldUser, User newUser) {
      //  return null;
    //}
}

