/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradingsimulation;

/**
 *
 * @author sjb56
 */
public class PropertyCompany extends Company {
    
    public PropertyCompany (int startingShares, int startingPrice) {
        super (startingShares, startingPrice);
        riskFactor = RiskLevels.Low;
    }
    
    @Override
    public Company clone() {
        PropertyCompany comp = new PropertyCompany(super.getNumberOfShares(), super.getSharePrice()); 
        comp.setRisk(getRiskFactor());
        return comp;
    }
          
}
