public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public Caneta(String modelo, String cor, float ponta){
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = 100;
        this.tampada = true;
    }

    public String status(){
        return String.format("Uma caneta %s, no modelo %s, com a ponta %.2f, carga %d%% e está tampada? %b", this.cor, this.modelo, this.ponta, this.carga, this.tampada);
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String novo_modelo){
        this.modelo = novo_modelo;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String nova_cor){
        this.cor = nova_cor;
    }

    public float getPonta(){
        return this.ponta;
    }

    public void setPonta(float nova_ponta){
        this.ponta = nova_ponta;
    }

    public int getCarga(){
        return this.carga;
    }

    public void setCarga(int nova_carga){
        this.carga = nova_carga;
    }

    public String getTampada(){
        if(this.tampada){
            return "Tampada";
        } else {
            return "Destampada";
        }
    }

    public void setTampada(boolean nova_tampada){
        this.tampada = nova_tampada;
    }
}
