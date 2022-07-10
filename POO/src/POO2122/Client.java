package POO2122;

public class Client {
    private String name;
    private String localidade;

    public Client(String name, String localidade) {
        this.name = name;
        this.localidade = localidade;
    }




    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocalidade() {
        return this.localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }



    @Override
    public int hashCode() {
        return (name == null) ? 0 : (name.hashCode() + localidade.hashCode());
    }

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()){
            return false;
        }else if(this.name.equals(((Client)obj).name) && this.localidade.equals(((Client)obj).localidade)){
            return true;
        }else{
            return false;
        }
	}
    @Override
    public String toString() {
        return name + "[" + localidade + "]";
    }


}
