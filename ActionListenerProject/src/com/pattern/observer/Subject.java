/**
 * 
 */
package com.pattern.observer;

import java.math.BigDecimal;

/**
 * @author uobsep22
 *
 */
public interface Subject {
	public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
    public void setBidAmount(Observer observer,BigDecimal newBidAmount);
}
