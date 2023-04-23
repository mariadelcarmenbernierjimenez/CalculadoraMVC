package controller;

import model.CalculatorModel;
import view.CalculatorView;

public class CalculatorController {
    CalculatorView theView;
    CalculatorModel theModel;
    
    /**
     * Avisa a la Vista que siempre que el botón Calcular se hace clic se ejecute el
     * método actionPerformed en la clase interna CalculateListener
     * 
     * @param theView
     * @param theModel
     */
    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
        this.theView.addCalculateListener(new CalculateListener(this));
    }
}
