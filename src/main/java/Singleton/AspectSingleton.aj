package Singleton;
import Singleton.TaxationOffice;

public aspect AspectSingleton {
	
	 private TaxationOffice TaxationOffice.instance;

	    pointcut getInstance(): call(public TaxationOffice TaxationOffice.getInstance());

	    before(): getInstance() {
	        if (instance == null) {
	            instance = new TaxationOffice();
	        }
	    }

}
