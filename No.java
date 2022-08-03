package TrabalhoAzul;

public class No {
	
	private Cliente cliente;
 
    private No esquerda;
    private No direita;
    
    public No(Cliente cliente){
    	
        this.cliente =  cliente;
        this.esquerda = null;
        this.direita = null;
    }
    
    
    public No() {
    	this.esquerda = null;
    	this.direita = null;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }
    
    
}