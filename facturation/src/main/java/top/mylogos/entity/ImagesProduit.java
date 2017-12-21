package top.mylogos.entity;

public class ImagesProduit {

	private Integer id;

	private String urlImage;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public ImagesProduit() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ImagesProduit [id=" + id + ", urlImage=" + urlImage + "]";
	}

}
