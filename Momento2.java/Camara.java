public class Camara {
    private String marca;
    private String modelo;
    private int megapixeles;

    public Camara(String marca, String modelo, int megapixeles) {
        this.marca = marca;
        this.modelo = modelo;
        this.megapixeles = megapixeles;
    }

    

    public String getMarca() {
        return marca;
    }



    public void setMarca(String marca) {
        this.marca = marca;
    }



    public String getModelo() {
        return modelo;
    }



    public void setModelo(String modelo) {
        this.modelo = modelo;
    }



    public int getMegapixeles() {
        return megapixeles;
    }



    public void setMegapixeles(int megapixeles) {
        this.megapixeles = megapixeles;
    }

}
