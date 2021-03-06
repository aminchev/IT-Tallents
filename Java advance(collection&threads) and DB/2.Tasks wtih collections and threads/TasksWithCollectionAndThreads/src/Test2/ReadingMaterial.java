package Test2;

public abstract class ReadingMaterial {
	private String name;
	private String izdatelstvo;
	
	public ReadingMaterial(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		if(name!= null && name.length()>0){
			this.name = name;
		}
	}

	@Override
	public String toString() {
		return "ReadingMaterial [name=" + name + ", izdatelstvo=" + izdatelstvo + "]";
	}
}
