package atividades;

public class Invoice {
    
    private int numeroItem;
    private String descricaoItem;
    private int quantidadeComprada;
    private double precoUnitario;
    
    
    public Invoice(int numeroItem, String descricaoItem, int quantidadeComprada, double precoUnitario) {
        this.numeroItem = numeroItem;
        this.descricaoItem = descricaoItem;
        
        if (quantidadeComprada > 0) {
            this.quantidadeComprada = quantidadeComprada;
        } else {
            this.quantidadeComprada = 0;
        }
        
        if (precoUnitario > 0) {
            this.precoUnitario = precoUnitario;
        } else {
            this.precoUnitario = 0.0;
        }
    }
    
  
    public int getNumeroItem() {
        return this.numeroItem;
    }
    
    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }
    

    public String getDescricaoItem() {
        return this.descricaoItem;
    }
    
    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }
    
    
    public int getQuantidadeComprada() {
        return this.quantidadeComprada;
    }
    
    public void setQuantidadeComprada(int quantidadeComprada) {
        if (quantidadeComprada > 0) {
            this.quantidadeComprada = quantidadeComprada;
        } else {
            this.quantidadeComprada = 0;
        }
    }
    
    
    public double getPrecoUnitario() {
        return this.precoUnitario;
    }
    
    public void setPrecoUnitario(double precoUnitario) {
        if (precoUnitario > 0) {
            this.precoUnitario = precoUnitario;
        } else {
            this.precoUnitario = 0.0;
        }
    }
    
  
    public double getInvoiceAmount() {
        return this.quantidadeComprada * this.precoUnitario;
    }
    
}
