public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // Construtor
    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }

    // Métodos da classe
    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        if (t.equals("CC")){
            setSaldo(50);
        } else if (t.equals("CP")) {
            setSaldo(150);
        } else {
            System.out.print("ERRO");
        }
    }

    public void fecharConta(){
        if (this.saldo > 0){
            System.out.print("Conta com dinheiro");
        } else if (this.saldo < 0) {
            System.out.print("Conta em débito");
        } else {
            setStatus(false);
        }
    }

    public void depositar(float v){
        if (this.status){
            setSaldo(getSaldo() + v);
        } else {
            System.out.print("Impossível depositar");
        }
    }

    public void sacar(float v){
        if (this.status){
            if (getSaldo() >= v){
                setSaldo(getSaldo() - v);
            } else {
                System.out.print("Saldo insuficiente");
            }
        } else {
            System.out.print("Impossível sacar");
        }
    }

    public void pagarMensal(){
        float v = 0.0f;
        if (getTipo().equals("CC")) {
            v = 12;
        } else if (getTipo().equals("CP")) {
            v = 20;
        }
        if (getStatus()){
            if (getSaldo() >= v){
                setSaldo(getSaldo() - v);
            } else {
                System.out.print("Saldo insuficiente");
            }
        } else {
            System.out.print("Impossível pagar");
        }
    }

    // Getters e Setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
