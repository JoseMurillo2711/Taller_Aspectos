package Adapter;
import Adapter.LionAdapter;
import Adapter.Lion;


public aspect AdapterAspect {
	
	private LionAdapter adapter;
	
	public AdapterAspect(LionAdapter adapter) {
		this.adapter = adapter;
	}

	pointcut changeSound():execution(void LionAdapter.makeSound(..));

	before():changeSound(){
		System.out.println("Se identifico como un animal");
		System.out.println("En este caso como un leon");
		
	}	
	
	around():changeSound(){
        adapter.makeSound();
	}

	
}
