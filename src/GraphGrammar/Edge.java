package GraphGrammar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nícolas Oreques de Araujo
 */
public class Edge{
    
    private String type;    //TD que identifica o tipo da aresta
    private String ID;      //ID que identifica esta instância de aresta
    private String source;  //ID do nodo fonte
    private String target;  //ID do nodo alvo
    
    public Edge (String type, String ID, String source, String target){
        this.type = type;
        this.ID = ID;
        this.source = source;
        this.target = target;
    }  
    
    /**
     * Método de acesso ao ID do nodo
     * @return string representando ID do nodo
     */
    public String getID(){
        return ID;
    }
    
    /**
     * Método de acesso ao tipo da aresta
     * @return - retorna uma string representando o tipo da aresta.
     */
    public String getType(){
        return type;
    }
    
     /**
     * Método de acesso ao nodo source da aresta
     * @return - retorna uma string representando o source da aresta.
     */
    public String getSource(){
        return source;
    }
    
      /**
     * Método de acesso ao target da aresta
     * @return - retorna uma string representando o target da aresta.
     */
    public String getTarget(){
        return target;
    }
    
     /**
     * Método que imprime as informações da aresta corrente.
     * @return - retorna true se conseguiu imprimir as informações corretamete, false caso tenha encontrado algum erro.
     */
    boolean printEdge(){
        if (this.type == null){
            System.out.println("\t\t\tErro. A aresta atual não possui tipo.");
            return false;
        }
        System.out.println("\t\t\tType: " + this.type);
        
        if (this.ID == null){
            System.out.println("\t\t\tErro. A aresta atual não possui ID.");
            return false;
        }
        System.out.println("\t\t\tID: " + this.ID);
        
        if (this.source == null){
            System.out.println("\t\t\tErro. A aresta atual não possui nodo fonte.");
            return false;
        }
        System.out.println("\t\t\tNodo Fonte: " + this.source);
        
        if (this.target == null){
            System.out.println("\t\t\tErro. A aresta atual não possui nodo destino.");
            return false;
        }
        System.out.println("\t\t\tNodo Destino: " + this.target);
        
        return true;
    }
    
}
