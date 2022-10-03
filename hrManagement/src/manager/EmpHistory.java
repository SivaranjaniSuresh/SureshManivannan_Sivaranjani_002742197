/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manager;


import java.util.ArrayList;
/**
 *
 * @author sivaranjanisuresh
 */
public class EmpHistory {
    
    private ArrayList<EmpDeclaration> history;
    
    public EmpHistory(){
        this.history = new ArrayList<EmpDeclaration>();
    }

    public ArrayList<EmpDeclaration> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<EmpDeclaration> history) {
        this.history = history;
    }
        
    public EmpDeclaration addNewEmployee(){
        EmpDeclaration newEmpDeclaration = new EmpDeclaration();
        history.add(newEmpDeclaration);
        return newEmpDeclaration;
        
        
    }
    

    public void deleteEmployee(EmpDeclaration es){
        
        history.remove(es);
    }
    
    public void updateEmployee(EmpDeclaration es, int rowindex){
        
        history.set(rowindex,es);
    }
}

    