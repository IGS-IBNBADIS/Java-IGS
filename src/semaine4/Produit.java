public class Produit {

	private String nom;
	private String category;
	private int code;
	private float prix;
	
	Produit(String nom , String category , int code , float prix){
		this.nom = nom;
		this.category = category;
		this.code = code;
		this.prix = prix;
	}
	
	
	public String getNom(){
		return this.nom;
	}
	public void setNom(String nom){
		this.nom =nom;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	
	
}

